package com.everis.livecode.abstraction;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTransformer {

	public abstract Object toDTO(Object object);

	public abstract Object toEntity(Object object);

	public List<Object> toDTOList(List<Object> objectList) {
		List<Object> result = new ArrayList<Object>();

		for (Object object : objectList) {
			result.add(toDTO(object));
		}
		return result;
	}

	public List<Object> toEntityList(List<Object> objectList) {
		List<Object> result = new ArrayList<Object>();

		for (Object object : objectList) {
			result.add(toEntity(object));
		}
		return result;
	}
}
