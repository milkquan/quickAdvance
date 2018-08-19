package com.imooc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/demo")
public class DemoController {
	
	@GetMapping(value="/hello")
	public String hello() {
		System.out.println("xxxxxxxxxxxx");
		return "hello spring security";
	}
}
