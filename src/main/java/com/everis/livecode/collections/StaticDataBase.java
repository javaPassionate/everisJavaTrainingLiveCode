package com.everis.livecode.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.everis.livecode.abstraction.models.Student;

public class StaticDataBase {

	private static List<Object> list = new ArrayList<Object>();

	static {
		list.add(new Student("Ibrahim", new Date()));
		list.add(new Student("Mohamed", new Date()));
		list.add(new Student("Ali", new Date()));
		list.add(new Student("Mouad", new Date()));
	}

	public static List<Object> studentDataBase() {
		return list;
	}
}
