package eki.ekilex.data.transform;

import eki.common.data.AbstractDataObject;

public class ClassifierMapping extends AbstractDataObject {

	private static final long serialVersionUID = 1L;

	private String ekiOrigin;

	private String ekiType;

	private String ekiName;

	private String ekiParentCode;

	private String ekiCode;

	private String ekiValue;

	private String ekiValueLang;

	private String lexName;

	private String lexCode;

	private int order;

	private String ekiKey;

	public String getEkiOrigin() {
		return ekiOrigin;
	}

	public void setEkiOrigin(String ekiOrigin) {
		this.ekiOrigin = ekiOrigin;
	}

	public String getEkiType() {
		return ekiType;
	}

	public void setEkiType(String ekiType) {
		this.ekiType = ekiType;
	}

	public String getEkiName() {
		return ekiName;
	}

	public void setEkiName(String ekiName) {
		this.ekiName = ekiName;
	}

	public String getEkiParentCode() {
		return ekiParentCode;
	}

	public void setEkiParentCode(String ekiParentCode) {
		this.ekiParentCode = ekiParentCode;
	}

	public String getEkiCode() {
		return ekiCode;
	}

	public void setEkiCode(String ekiCode) {
		this.ekiCode = ekiCode;
	}

	public String getEkiValue() {
		return ekiValue;
	}

	public void setEkiValue(String ekiValue) {
		this.ekiValue = ekiValue;
	}

	public String getEkiValueLang() {
		return ekiValueLang;
	}

	public void setEkiValueLang(String ekiValueLang) {
		this.ekiValueLang = ekiValueLang;
	}

	public String getLexName() {
		return lexName;
	}

	public void setLexName(String lexName) {
		this.lexName = lexName;
	}

	public String getLexCode() {
		return lexCode;
	}

	public void setLexCode(String lexCode) {
		this.lexCode = lexCode;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getEkiKey() {
		return ekiKey;
	}

	public void setEkiKey(String ekiKey) {
		this.ekiKey = ekiKey;
	}

}
