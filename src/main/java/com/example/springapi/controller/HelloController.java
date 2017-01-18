package com.example.springapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author manhnt
 */
@Controller
public class HelloController {

	@RequestMapping("/")
	public String greeting() {
		return "hello";
	}
}
