package org.akhil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {
	
	@GetMapping("/show")
	public String show() {
		return "Welcome to Docker Demo  !! ";
	}
}
