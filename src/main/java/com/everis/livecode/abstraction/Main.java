package com.everis.livecode.abstraction;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.everis.livecode.abstraction.models.Student;
import com.everis.livecode.abstraction.models.StudentDTO;

public class Main {

	public static void main(String[] args) {
		StudentTransformer studentTransformer = new StudentTransformer();

		List<Object> studentList = new ArrayList<Object>();
		Student student = new Student("Mohammed", new Date());
		studentList.add(student);
		
		List<Object> dtoList = studentTransformer.toDTOList(studentList);
		StudentDTO dto = (StudentDTO) dtoList.get(0);

		System.out.println(dto.getFirstName());
		System.out.println(dto.getBirthDate());
	}
}