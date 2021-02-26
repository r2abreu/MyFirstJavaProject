package com.netmind.model;

public enum OptionEnum {
	ADD_STUDENT;

	public static OptionEnum getOption(int userInput) {
		return OptionEnum.values()[userInput - 1];
	}
}
