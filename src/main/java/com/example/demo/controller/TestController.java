package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	// http://localhost:8083/SpringMVC/servlet/
	@RequestMapping("/")
	@ResponseBody
	public String welcome() { return " Bonjour, Bienvenue à l'application de test des Web Services REST."; }

}
