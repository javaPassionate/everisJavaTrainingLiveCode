package com.everis.livecode.interfaces.impl;

import java.util.List;

import com.everis.livecode.abstraction.models.Student;
import com.everis.livecode.collections.StaticDataBase;
import com.everis.livecode.interfaces.StudentService;

public class StudentServiceImpl implements StudentService {

	public Object create(Object student) {
		StaticDataBase.studentDataBase().add(student);
		return student;
	}

	public Object update(Long id, Object student) {
		Object object = getById(id);
		object = student;
		return object;
	}

	public List<Object> getAll() {
		return StaticDataBase.studentDataBase();
	}

	public Object getById(Long id) {
		Student student = (Student) StaticDataBase.studentDataBase().get(id.intValue());
		return student;
	}

	public void delete(Long id) {
		StaticDataBase.studentDataBase().remove(id.intValue());
	}

}
