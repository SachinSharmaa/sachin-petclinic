package com.sachin.petclinic.services.map;

import java.util.Set;

import com.sachin.petclinic.entities.Pet;
import com.sachin.petclinic.services.PetService;

public class VetServiceMapImpl extends AbstractMapService<Pet, Long> implements PetService {

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}





	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}





	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}





	@Override
	public void delete(Pet object) {
		super.delete(object);
	}





	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
