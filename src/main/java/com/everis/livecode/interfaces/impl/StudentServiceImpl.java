package com.everis.livecode.interfaces.impl;

import java.util.List;

import com.everis.livecode.interfaces.StudentService;

public class StudentServiceImpl implements StudentService {

	public Object create(Object student) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object update(Long id, Object student) {
		Object object = getById(id);
		object = student;
		return null;
	}

	public List<Object> getAll() {
		// select * from StudentTable
		return null;
	}

	public Object getById(Long id) {
		// select * from StudentTable where id == id
		return null;
	}

	public void delete(Long id) {
	}

}
