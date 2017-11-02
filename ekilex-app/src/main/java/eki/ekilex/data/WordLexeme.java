package eki.ekilex.data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.persistence.Column;

import eki.common.constant.FreeformType;
import eki.common.data.AbstractDataObject;

public class WordLexeme extends AbstractDataObject {

	private static final long serialVersionUID = 1L;

	@Column(name = "word")
	private String word;

	@Column(name = "word_id")
	private Long wordId;

	@Column(name = "lexeme_id")
	private Long lexemeId;

	@Column(name = "meaning_id")
	private Long meaningId;

	@Column(name = "level1")
	private Integer level1;

	@Column(name = "level2")
	private Integer level2;

	@Column(name = "level3")
	private Integer level3;

	@Column(name = "lexeme_type_code")
	private String lexemeTypeCode;

	@Column(name = "lexeme_type_value")
	private String lexemeTypeValue;

	@Column(name = "frequency_group_code")
	private String frequencyGroupCode;

	@Column(name = "frequency_group_value")
	private String frequencyGroupValue;

	private List<Classifier> domains;

	private List<Form> words;

	private List<Rection> rections;

	@Column(name = "datasets")
	private List<String> datasets;

	@Column(name = "definitions")
	private List<String> definitions;

	private List<FreeForm> meaningFreeforms;

	private List<FreeForm> lexemeFreeforms;

	public WordLexeme() {
	}

	public WordLexeme(Consumer<WordLexeme> builder) {
		builder.accept(this);
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Long getWordId() {
		return wordId;
	}

	public void setWordId(Long wordId) {
		this.wordId = wordId;
	}

	public Long getLexemeId() {
		return lexemeId;
	}

	public void setLexemeId(Long lexemeId) {
		this.lexemeId = lexemeId;
	}

	public Long getMeaningId() {
		return meaningId;
	}

	public void setMeaningId(Long meaningId) {
		this.meaningId = meaningId;
	}

	public Integer getLevel1() {
		return level1;
	}

	public void setLevel1(Integer level1) {
		this.level1 = level1;
	}

	public Integer getLevel2() {
		return level2;
	}

	public void setLevel2(Integer level2) {
		this.level2 = level2;
	}

	public Integer getLevel3() {
		return level3;
	}

	public void setLevel3(Integer level3) {
		this.level3 = level3;
	}

	public String getLexemeTypeCode() {
		return lexemeTypeCode;
	}

	public void setLexemeTypeCode(String lexemeTypeCode) {
		this.lexemeTypeCode = lexemeTypeCode;
	}

	public String getLexemeTypeValue() {
		return lexemeTypeValue;
	}

	public void setLexemeTypeValue(String lexemeTypeValue) {
		this.lexemeTypeValue = lexemeTypeValue;
	}

	public List<Classifier> getDomains() {
		return domains;
	}

	public void setDomains(List<Classifier> domains) {
		this.domains = domains;
	}

	public List<Form> getWords() {
		return words;
	}

	public void setWords(List<Form> words) {
		this.words = words;
	}

	public List<Rection> getRections() {
		return rections;
	}

	public void setRections(List<Rection> rections) {
		this.rections = rections;
	}

	public List<String> getDatasets() {
		return datasets;
	}

	public void setDatasets(List<String> datasets) {
		this.datasets = datasets;
	}

	public List<String> getDefinitions() {
		return definitions;
	}

	public void setDefinitions(List<String> definitions) {
		this.definitions = definitions;
	}

	public List<FreeForm> getMeaningFreeforms() {
		return meaningFreeforms;
	}

	public void setMeaningFreeforms(List<FreeForm> meaningFreeforms) {
		this.meaningFreeforms = meaningFreeforms;
	}

	public List<FreeForm> getLexemeFreeforms() {
		return lexemeFreeforms;
	}

	public void setLexemeFreeforms(List<FreeForm> lexemeFreeforms) {
		this.lexemeFreeforms = lexemeFreeforms;
	}

	public String getFrequencyGroupCode() {
		return frequencyGroupCode;
	}

	public void setFrequencyGroupCode(String frequencyGroupCode) {
		this.frequencyGroupCode = frequencyGroupCode;
	}

	public String getFrequencyGroupValue() {
		return frequencyGroupValue;
	}

	public void setFrequencyGroupValue(String frequencyGroupValue) {
		this.frequencyGroupValue = frequencyGroupValue;
	}

	public List<FreeForm> getFreeforms() {
		List<FreeForm> freeforms = new ArrayList<>();
		if (getLexemeFreeforms() != null) freeforms.addAll(getLexemeFreeforms());
		if (getMeaningFreeforms() != null) freeforms.addAll(getMeaningFreeforms());
		return freeforms.stream().filter(f -> !f.getType().equals(FreeformType.RECTION)).collect(Collectors.toList());
	}
}
