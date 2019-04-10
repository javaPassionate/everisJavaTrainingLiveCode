package com.everis.livecode.abstraction;

import com.everis.livecode.abstraction.models.Student;
import com.everis.livecode.abstraction.models.StudentDTO;

public class StudentTransformer extends AbstractTransformer {

	@Override
	public Object toDTO(Object object) {
		StudentDTO dto = new StudentDTO();
		Student student = (Student) object;

		dto.setFirstName(student.getFirstName());
		dto.setBirthDate(student.getBirthDate());

		return dto;
	}

	@Override
	public Object toEntity(Object object) {
		Student student = new Student();
		StudentDTO dto = (StudentDTO) object;

		student.setFirstName(dto.getFirstName());
		student.setBirthDate(dto.getBirthDate());

		return student;
	}

}
