package com.example.myserver;


import com.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MyCtrl {


	@Resource
	private MyService myService;

	@GetMapping("/hello")
	public String hello(String username){
         return myService.hello(username);
	}
}
