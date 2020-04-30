package com.akhil.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class SecurityController {

	@RequestMapping("/login")
	public String name() {

		return "login.jsp";

	}

}
