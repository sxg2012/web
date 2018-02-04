package com.sxg.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

@RestController
public class WebApplication {
	private static final Logger LOG = LoggerFactory.getLogger(WebApplication.class);
//	@RequestMapping("/test")
//	public String hello() {
//		LOG.info("Hello!!!!");
//		return "hello";
//	}
}
