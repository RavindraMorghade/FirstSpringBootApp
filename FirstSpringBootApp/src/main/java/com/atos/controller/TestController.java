package com.atos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/msg")
	public String msg() {
		return "Welcome to Spring Boot APP";
	}
}
