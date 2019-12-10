package com.sachin.petclinic.entities;

import java.time.LocalDate;

/**
 * @author Sachin Sharma
 */

public class Pet extends BaseEntity {

	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;

}
