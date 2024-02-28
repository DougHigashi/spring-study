package com.doug.learning.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	// /caculadora/somar/10/20
	// /calculadora/subtrair?a=10&b=20
	
	@GetMapping("/somar/{a}/{b}")
	public String somar(@PathVariable int a, @PathVariable int b) {
		int sum = a + b;
		return Integer.toString(sum);
	}
	
	@GetMapping("/subtrair")
	public String subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
		int subtraction = a - b;
		return Integer.toString(subtraction);
	}
}
