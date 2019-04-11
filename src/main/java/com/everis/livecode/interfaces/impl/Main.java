package com.everis.livecode.interfaces.impl;

import com.everis.livecode.abstraction.models.Student;
import com.everis.livecode.interfaces.StudentService;

public class Main {

	public static void main(String[] args) {
		StudentService studentService = new StudentServiceImpl();

		for (Object object : studentService.getAll()) {
			System.out.println((Student) object);
		}
		System.out.println("************");
		studentService.delete(2l);
		studentService.create(new Student("Nawal", null));

		for (Object object : studentService.getAll()) {
			System.out.println((Student) object);
		}
//		System.out.println("************");
//		System.out.println(studentService.getById(3l));
//		System.out.println("************");
//
//		Student updatedStudent = (Student) studentService.update(3l, new Student("updated Value", null));
//
//		System.out.println(updatedStudent);
	}
}
