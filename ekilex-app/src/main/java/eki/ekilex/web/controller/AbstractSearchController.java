package eki.ekilex.web.controller;

import static java.util.Collections.emptyList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import eki.ekilex.constant.SearchKey;
import eki.ekilex.constant.WebConstant;
import eki.ekilex.data.Dataset;
import eki.ekilex.data.SearchCriterion;
import eki.ekilex.data.SearchFilter;
import eki.ekilex.data.Word;
import eki.ekilex.service.CommonDataService;
import eki.ekilex.web.bean.SessionBean;

public abstract class AbstractSearchController implements WebConstant {

	private static final Logger logger = LoggerFactory.getLogger(AbstractSearchController.class);

	@Autowired
	protected CommonDataService commonDataService;

	protected void initSearchForms(Model model) {

		SessionBean sessionBean = (SessionBean) model.asMap().get(SESSION_BEAN);
		if (sessionBean == null) {
			sessionBean = new SessionBean();
			model.addAttribute(SESSION_BEAN, sessionBean);
		}
		List<Dataset> allDatasets = commonDataService.getDatasets();
		List<String> allDatasetCodes = allDatasets.stream().map(dataset -> dataset.getCode()).collect(Collectors.toList());
		List<String> selectedDatasets = sessionBean.getSelectedDatasets();
		if (CollectionUtils.isEmpty(selectedDatasets)) {
			sessionBean.setSelectedDatasets(allDatasetCodes);
		}
		SearchFilter detailSearchFilter = initSearchFilter();
		model.addAttribute("allDatasets", allDatasets);
		model.addAttribute("detailSearchFilter", detailSearchFilter);
		model.addAttribute("searchMode", SEARCH_MODE_SIMPLE);
	}

	protected void performSearch(
			List<String> selectedDatasets, String searchMode, String simpleSearchFilter,
			SearchFilter detailSearchFilter, SessionBean sessionBean, Model model) throws Exception {

		logger.debug("Searching by \"{}\" in {}", simpleSearchFilter, selectedDatasets);

		List<Dataset> allDatasets = commonDataService.getDatasets();
		List<String> allDatasetCodes = allDatasets.stream().map(dataset -> dataset.getCode()).collect(Collectors.toList());
		if (CollectionUtils.isEmpty(selectedDatasets)) {
			selectedDatasets = sessionBean.getSelectedDatasets();
			if (CollectionUtils.isEmpty(selectedDatasets)) {
				sessionBean.setSelectedDatasets(allDatasetCodes);
			}
		}
		if (StringUtils.isBlank(searchMode)) {
			searchMode = SEARCH_MODE_SIMPLE;
		}
		List<Word> words = emptyList();
		if (StringUtils.equals(SEARCH_MODE_DETAIL, searchMode)) {
			List<SearchCriterion> searchCriteria = detailSearchFilter.getSearchCriteria();
			searchCriteria = searchCriteria.stream()
					.filter(criterion ->
							(criterion.getSearchKey() != null)
							&& (criterion.getSearchValue() != null)
							&& StringUtils.isNotBlank(criterion.getSearchValue().toString()))
					.collect(Collectors.toList());
			if (CollectionUtils.isNotEmpty(searchCriteria)) {
				detailSearchFilter.setSearchCriteria(searchCriteria);
				words = commonDataService.findWords(detailSearchFilter, selectedDatasets);
			}
		} else {
			words = commonDataService.findWords(simpleSearchFilter, selectedDatasets);
		}
		model.addAttribute("allDatasets", allDatasets);
		model.addAttribute("simpleSearchFilter", simpleSearchFilter);
		model.addAttribute("detailSearchFilter", detailSearchFilter);
		model.addAttribute("searchMode", searchMode);
		model.addAttribute("wordsFoundBySearch", words);
	}

	protected SearchFilter initSearchFilter() {

		SearchFilter detailSearch = new SearchFilter();
		detailSearch.setSearchCriteria(new ArrayList<>());
		SearchCriterion defaultCriterion = new SearchCriterion();
		defaultCriterion.setSearchKey(SearchKey.WORD_VALUE);
		defaultCriterion.setSearchOperand(SearchKey.WORD_VALUE.getOperands()[0]);
		detailSearch.getSearchCriteria().add(defaultCriterion);
		return detailSearch;
	}
}
