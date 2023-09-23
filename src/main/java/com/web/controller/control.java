package com.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control {
	@GetMapping(value="/getMan")
	public String getMan() {
		return "Shankar";
	}

}
