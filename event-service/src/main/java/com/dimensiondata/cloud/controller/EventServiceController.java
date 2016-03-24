package com.dimensiondata.cloud.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventServiceController {
	@RequestMapping("/greeting")
	public String sayHello() {
		return "Hello Spring REST";
	}

	@ExceptionHandler
	@ResponseStatus(HttpStatus.CONFLICT)
	public String handleException(Exception e) {
		return e.getMessage();
	}
}
