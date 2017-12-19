package eki.ekilex.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import eki.ekilex.data.Word;
import eki.ekilex.data.WordDetails;
import eki.ekilex.service.SearchService;

@ConditionalOnWebApplication
@Controller
public class SearchController {

	private static final Logger logger = LoggerFactory.getLogger(SearchController.class);

	@Autowired
	private SearchService search;

	@GetMapping("/search")
	public String search(
			@RequestParam(required = false) String searchFilter,
			@RequestParam(name = "dicts", required = false) List<String> selectedDatasets,
			Model model, HttpSession session) {

		logger.debug("doing search : {}, {}", searchFilter, selectedDatasets);
		Map<String, String> datasets = search.getDatasetNameMap();
		if (selectedDatasets == null) {
			if (session.getAttribute("datasets") == null) {
				selectedDatasets = new ArrayList<>(datasets.keySet());
			} else {
				selectedDatasets = (List<String>) session.getAttribute("datasets");
			}
		}
		model.addAttribute("datasets", datasets.entrySet());
		model.addAttribute("selectedDatasets", selectedDatasets);
		session.setAttribute("datasets", selectedDatasets);
		List<Word> words = search.findWordsInDatasets(searchFilter, selectedDatasets);
		model.addAttribute("wordsFoundBySearch", words);
		model.addAttribute("searchFilter", searchFilter);

		return "search";
	}

	@GetMapping("/details/{formId}")
	public String details(@PathVariable("formId") Long formId, Model model, HttpSession session) {

		logger.debug("doing details : {}", formId);

		List<String> selectedDatasets = (List<String>) session.getAttribute("datasets");
		if (selectedDatasets == null) {
			Map<String, String> datasets = search.getDatasetNameMap();
			selectedDatasets = new ArrayList<>(datasets.keySet());
		}
		WordDetails details = search.findWordDetailsInDatasets(formId, selectedDatasets);
		model.addAttribute("detailsName", formId + "_details");
		model.addAttribute("details", details);

		return "search :: details";
	}

}
