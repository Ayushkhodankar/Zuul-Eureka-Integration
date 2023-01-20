package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ClientSecondController {
	
	@GetMapping("/func")
	public String show() {
		return "This is client 2";
	}

}
