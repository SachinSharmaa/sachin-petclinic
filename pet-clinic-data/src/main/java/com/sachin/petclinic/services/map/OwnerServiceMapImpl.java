package com.sachin.petclinic.services.map;

import java.util.Set;

import com.sachin.petclinic.entities.Owner;
import com.sachin.petclinic.services.OwnerService;

public class OwnerServiceMapImpl extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}





	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}





	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}





	@Override
	public void delete(Owner object) {
		super.delete(object);
	}





	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}





	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
