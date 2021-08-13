package com.example.boot203servlet.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@Slf4j
//@WebListener
public class MyListener  implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		log.info("MyListener init ");
		ServletContextListener.super.contextInitialized(sce);
	}
}
