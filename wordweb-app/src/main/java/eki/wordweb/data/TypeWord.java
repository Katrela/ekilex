package eki.wordweb.data;

import eki.common.data.AbstractDataObject;

public class TypeWord extends AbstractDataObject {

	private static final long serialVersionUID = 1L;

	private String value;

	private String lang;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

}
