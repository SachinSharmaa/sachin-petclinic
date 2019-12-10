package com.sachin.petclinic.services;

import java.util.Set;

/**
 * @author Sachin Sharma
 * @param <T>
 *            The Entity Class
 * @param <ID>
 *            The type of ID used
 */
public interface CrudService<T, ID> {

	Set<T> findAll();





	T findById(ID id);





	T save(T object);





	void delete(T object);





	void deleteById(ID id);

}
