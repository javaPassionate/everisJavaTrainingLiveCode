package com.everis.livecode.abstraction.models;

import java.util.Date;

public class Student {

	private String firstName;

	private Date birthDate;

	public Student() {
		super();
	}

	public Student(String firstName, Date birthDate) {
		super();
		this.firstName = firstName;
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}
