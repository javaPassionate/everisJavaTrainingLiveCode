package com.everis.livecode.inheritance;

public enum OS {

	WINDOWS("win"), LINUX("kernel");

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private String value;

	private OS(String value) {
		this.value = value;
	}

}
