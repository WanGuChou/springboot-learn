package com.example.boot203servlet.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


	@RequestMapping("/tt")
	public Object tt(){
		return "234";
	}
}
