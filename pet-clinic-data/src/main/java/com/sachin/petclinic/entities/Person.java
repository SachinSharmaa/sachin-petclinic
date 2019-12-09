package com.sachin.petclinic.entities;

import javax.persistence.Entity;

import lombok.Data;

/**
 * @author Sachin Sharma
 */
@Data
@Entity
public class Person {

	private String firstName;
	private String lastName;
}
