package com.doug.learning.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstConstroller {

	@GetMapping(path = { "/ola", "/tigrinho" })
	public String ola() {
		return "Ola Spring Boot!";
	}
	
	@PostMapping(path = { "/tigrinho" })
	public String saudacao() {
		return "Olá Spring Boot!";
	}

}