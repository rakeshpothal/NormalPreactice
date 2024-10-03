package com.jsp.springweb1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerStudent {

//	public ControllerStudent() {
//		System.out.println(this.getClass().getSimpleName());
//	}

	@GetMapping(value = "/hi")
	public String homePage() {
		return "student.jsp";
	}

}
