package eki.ekilex.data;

import eki.common.data.AbstractDataObject;

public class Government extends AbstractDataObject {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String value;

	private String typeCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

}
