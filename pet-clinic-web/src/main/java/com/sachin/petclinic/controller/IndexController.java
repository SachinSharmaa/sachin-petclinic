package com.sachin.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sachin Sharma
 */
@Controller
public class IndexController {

	@RequestMapping({ "", "/", "index", "index.html" })
	public String index() {
		return "index";
	}
}
