package eki.ekilex.runner;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eki.ekilex.data.transform.ClassifierMapping;

public abstract class AbstractDomainRunner extends AbstractClassifierRunner {

	private static Logger logger = LoggerFactory.getLogger(AbstractDomainRunner.class);

	public List<ClassifierMapping> merge(List<ClassifierMapping> sourceClassifiers, List<ClassifierMapping> existingClassifierMappings) {

		if (CollectionUtils.isEmpty(sourceClassifiers)) {
			return existingClassifierMappings;
		}
		if (CollectionUtils.isEmpty(existingClassifierMappings)) {
			return sourceClassifiers;
		}

		List<ClassifierMapping> mergedClassifierMappings = new ArrayList<>();
		mergedClassifierMappings.addAll(existingClassifierMappings);
		for (ClassifierMapping sourceClassifier : sourceClassifiers) {
			if (!rowExists(sourceClassifier, existingClassifierMappings)) {
				mergedClassifierMappings.add(sourceClassifier);
			}
		}
		return mergedClassifierMappings;
	}

	private boolean rowExists(ClassifierMapping sourceClassifier, List<ClassifierMapping> existingClassifierMappings) {

		String srcOrigin = sourceClassifier.getEkiOrigin();
		String srcCode = sourceClassifier.getEkiCode();
		String srcValueLang = sourceClassifier.getEkiValueLang();
		String srcKey = composeRow(CLASSIFIER_KEY_SEPARATOR, srcOrigin, srcCode, srcValueLang);
		for (ClassifierMapping existingClassifierMapping : existingClassifierMappings) {
			String exsOrigin = existingClassifierMapping.getEkiOrigin();
			String exsCode = existingClassifierMapping.getEkiCode();
			String exsValueLang = existingClassifierMapping.getEkiValueLang();
			String exsKey = composeRow(CLASSIFIER_KEY_SEPARATOR, exsOrigin, exsCode, exsValueLang);
			if (StringUtils.equals(srcKey, exsKey)) {
				return true;
			}
		}
		return false;
	}

	public void writeDomainClassifierCsvFile(List<ClassifierMapping> classifiers) throws Exception {

		if (CollectionUtils.isEmpty(classifiers)) {
			logger.warn("No classifiers to save. Interrupting...");
			return;
		}

		FileOutputStream classifierCsvStream = new FileOutputStream(CLASSIFIER_DOMAIN_CSV_PATH);

		StringBuffer classifCsvLineBuf;
		String classifCsvLine;

		classifCsvLine = composeRow(CSV_SEPARATOR, "Päritolu", "Kood", "Alluvus", "Väärtus", "Keel");
		classifCsvLine += "\n";

		IOUtils.write(classifCsvLine, classifierCsvStream, StandardCharsets.UTF_8);

		for (ClassifierMapping classifier : classifiers) {

			classifCsvLineBuf = new StringBuffer();

			appendCell(classifCsvLineBuf, classifier.getEkiOrigin(), false);
			appendCell(classifCsvLineBuf, classifier.getEkiCode(), false);
			appendCell(classifCsvLineBuf, classifier.getEkiParentCode(), false);
			appendCell(classifCsvLineBuf, classifier.getEkiValue(), false);
			appendCell(classifCsvLineBuf, classifier.getEkiValueLang(), true);

			classifCsvLine = classifCsvLineBuf.toString();
			IOUtils.write(classifCsvLine, classifierCsvStream, StandardCharsets.UTF_8);
		}

		classifierCsvStream.flush();
		classifierCsvStream.close();
	}
}
