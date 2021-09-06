package com;

import org.springframework.beans.factory.annotation.Autowired;

public class MyService {


@Autowired
private MyProperties myProperties;

	public String hello(String  username){
		return myProperties.getPrefix()+"\t"+username+"\t"+myProperties.getSuffix();
	}

}
