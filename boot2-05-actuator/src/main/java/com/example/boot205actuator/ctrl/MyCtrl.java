package com.example.boot205actuator.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyCtrl {

	/**
	 * 测试方法
	 * @return
	 */
	@RequestMapping("/t")
	private Object t(){
		return "OK";
	}

}
