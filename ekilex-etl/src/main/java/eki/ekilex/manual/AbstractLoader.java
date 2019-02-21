package eki.ekilex.manual;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import eki.common.exception.DataLoadingException;
import eki.ekilex.constant.SystemConstant;
import eki.ekilex.data.transform.DatasetId;
import eki.ekilex.data.transform.Guid;

public abstract class AbstractLoader implements SystemConstant {

	private static final String TERMEKI_KEY_PART = ".termeki.";

	abstract void execute(String[] args);

	private ConfigurableApplicationContext applicationContext;

	private Properties loaderConf;

	protected void initDefault() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("service-config.xml", "db-config.xml");
		initMain();
	}

	protected void initWithTermeki() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("service-config.xml", "db-config.xml", "db-termeki-config.xml");
		initMain();
	}

	private void initMain() throws IOException {
		applicationContext.registerShutdownHook();
		Resource loaderConfResource = applicationContext.getResource("ultima-loader.properties");
		InputStream confStream = loaderConfResource.getInputStream();
		loaderConf = new Properties();
		loaderConf.load(confStream);
		confStream.close();
	}

	protected <T> T getComponent(Class<T> componentType) {
		return applicationContext.getBean(componentType);
	}

	protected void shutdown() {
		applicationContext.close();
	}

	public boolean doReports() {
		String doReportsStr = loaderConf.getProperty("doreports");
		boolean doReports = Boolean.valueOf(doReportsStr);
		return doReports;
	}

	public boolean isFullReload() {
		String isFullReloadStr = loaderConf.getProperty("isfullreload");
		boolean isFullReload = Boolean.valueOf(isFullReloadStr);
		return isFullReload;
	}

	public String getMandatoryConfProperty(String key) throws Exception {
		String propertyValue = loaderConf.getProperty(key);
		if (StringUtils.isBlank(propertyValue)) {
			throw new DataLoadingException("Missing mandatory property \"" + key + "\"");
		}
		return propertyValue;
	}

	public String getConfProperty(String key) {
		return loaderConf.getProperty(key);
	}

	public String[] getMabDataFilePaths() {
		String[] mabDataFilePathKeys = new String[] {
				"mab.data.file.1",
				"mab.data.file.2",
				"mab.data.file.3",
				"mab.data.file.4"
		};
		String[] dataFilePaths = new String[mabDataFilePathKeys.length];
		for (int dataFilePathKeyIndex = 0; dataFilePathKeyIndex < mabDataFilePathKeys.length; dataFilePathKeyIndex++) {
			dataFilePaths[dataFilePathKeyIndex] = getConfProperty(mabDataFilePathKeys[dataFilePathKeyIndex]);
		}
		return dataFilePaths;
	}

	public List<DatasetId> getTermekiIds() {
		List<DatasetId> termekiIds = new ArrayList<>();
		Enumeration<Object> loaderConfKeys = loaderConf.keys();
		while (loaderConfKeys.hasMoreElements()) {
			String loaderConfKey = loaderConfKeys.nextElement().toString();
			if (StringUtils.contains(loaderConfKey, TERMEKI_KEY_PART)) {
				String termekiDataset = StringUtils.substringBefore(loaderConfKey, TERMEKI_KEY_PART);
				String termekiIdStr = loaderConf.getProperty(loaderConfKey);
				if (StringUtils.isNotEmpty(termekiIdStr)) {
					Integer termekiId = Integer.valueOf(termekiIdStr);
					DatasetId datasetId = new DatasetId(termekiDataset, termekiId);
					termekiIds.add(datasetId);
				}
			}
		}
		return termekiIds;
	}

	public Map<String, List<Guid>> getSsGuidMapFor(String filteringDataset) throws Exception {

		String ssGuidMapFilePath1 = loaderConf.getProperty("ss1.map.file.1");
		String ssGuidMapFilePath2 = loaderConf.getProperty("ss1.map.file.2");
		if (StringUtils.isBlank(ssGuidMapFilePath1)) {
			return null;
		}
		if (StringUtils.isBlank(ssGuidMapFilePath2)) {
			return null;
		}
		String[] ssGuidMapFilePaths = new String[] {ssGuidMapFilePath1, ssGuidMapFilePath2};

		Map<String, List<Guid>> ssGuidMap = new HashMap<>();
		InputStream resourceInputStream;
		List<String> resourceFileLines;
		List<Guid> mappedGuids;
		Guid guidObj;
		for (String ssGuidMapFilePath : ssGuidMapFilePaths) {
			resourceInputStream = new FileInputStream(ssGuidMapFilePath);
			resourceFileLines = IOUtils.readLines(resourceInputStream, UTF_8);
			resourceInputStream.close();
			for (String resourceFileLine : resourceFileLines) {
				if (StringUtils.isBlank(resourceFileLine)) {
					continue;
				}
				String[] ssGuidMapRowCells = StringUtils.split(resourceFileLine, CSV_SEPARATOR);
				if (ssGuidMapRowCells.length != 4) {
					throw new DataLoadingException("Invalid guid map line \"" + resourceFileLine + "\"");
				}
				String sourceDataset = correctDatasetCode(ssGuidMapRowCells[0]);
				String sourceGuid = ssGuidMapRowCells[1].toLowerCase();
				String targetGuid = ssGuidMapRowCells[2].toLowerCase();
				String word = ssGuidMapRowCells[3];
				word = RegExUtils.removePattern(word, "[&]\\w+[;]");//remove eki markup 
				word = RegExUtils.removePattern(word, "<[^>]*>");//remove html
				word = StringUtils.removeStart(word, "-");//suffixoid
				word = StringUtils.removeEnd(word, "-");//prefixoid
				if (StringUtils.equals(sourceDataset, filteringDataset)) {
					mappedGuids = ssGuidMap.get(sourceGuid);
					if (mappedGuids == null) {
						mappedGuids = new ArrayList<>();
						ssGuidMap.put(sourceGuid, mappedGuids);
					}
					guidObj = new Guid();
					guidObj.setValue(targetGuid);
					guidObj.setWord(word);
					if (!mappedGuids.contains(guidObj)) {
						mappedGuids.add(guidObj);
					}
				}
			}
		}
		return ssGuidMap;
	}

	private String correctDatasetCode(String datasetCode) {
		if (StringUtils.equals(datasetCode, "qqv")) {
			return "qq2";
		}
		if (StringUtils.equals(datasetCode, "evs")) {
			return "ev2";
		}
		return datasetCode;
	}
}
