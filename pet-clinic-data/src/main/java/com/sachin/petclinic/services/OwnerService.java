package com.sachin.petclinic.services;

import com.sachin.petclinic.entities.Owner;

/**
 * @author Sachin Sharma
 */
public interface OwnerService extends CrudService<Owner, Long> {


	Owner findByLastName(String lastName);


}
