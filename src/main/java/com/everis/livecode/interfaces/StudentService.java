package com.everis.livecode.interfaces;

import java.util.List;

public interface StudentService {

	Object create(Object student);

	Object update(Long id, Object student);

	List<Object> getAll();

	Object getById(Long id);

	void delete(Long id);

}
