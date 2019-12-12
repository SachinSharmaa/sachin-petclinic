package com.sachin.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sachin Sharma
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {

	@RequestMapping({ "", "/", "/index", "/index.html" })
	public String listOfOwners() {
		return "/owners/index";
	}

}
