package com.sachin.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sachin Sharma
 */
@Controller
@RequestMapping("/vets")
public class VetController {


	@RequestMapping({ "", "/", "/index", "/index.html" })
	public String listVets() {
		return "vets/index";
	}
}
