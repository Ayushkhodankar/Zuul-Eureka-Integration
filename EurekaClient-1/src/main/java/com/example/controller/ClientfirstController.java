package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientfirstController {
	@GetMapping("/showfun")
	public String show()
	{
		return "showing client-1";
	}
}
