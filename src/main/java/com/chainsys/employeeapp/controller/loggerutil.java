package com.chainsys.employeeapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loggerutil {

	private static final Logger logger = LoggerFactory.getLogger(loggerutil.class);

	@RequestMapping("/")
	public String index() {
		logger.info("this is a info message");
		logger.warn("this is a warn message");
		logger.error("this is a error message");
		logger.debug("this is a debug message");
		return "index.jsp";
	}
}
