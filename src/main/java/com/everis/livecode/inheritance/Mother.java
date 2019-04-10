package com.everis.livecode.inheritance;

public class Mother {

	public void createMother(String fullName) {
		System.out.println("fullName : " + fullName);
	}

	public void createMother(String firstName, String lastName) {
		System.out.println("firstName : " + firstName + " lastName : " + lastName);
	}

	public void create() {
		System.out.println("create from mother");
	}
}
