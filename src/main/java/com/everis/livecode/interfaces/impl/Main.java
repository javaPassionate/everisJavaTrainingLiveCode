package com.everis.livecode.interfaces.impl;

import com.everis.livecode.interfaces.StudentService;

public class Main {

	public static void main(String[] args) {
		StudentService studentService = new StudentServiceImpl();
		
		studentService.getAll();
	}
}
