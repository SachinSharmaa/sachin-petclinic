package com.sachin.petclinic.entities;

import java.time.LocalDate;

import lombok.Data;

/**
 * @author Sachin Sharma
 */
@Data
public class Pet {

	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;

}
