package com.imooc.controller;

import java.util.concurrent.Callable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class AsyncController {
	
	private Logger logger = LoggerFactory.getLogger(AsyncController.class);
	
	@GetMapping("/sync")
	public String syncOrder() {
		logger.info("主线程开始");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			logger.error("the exception",e);
			return "error";
		}
		logger.info("主线程结束");
		return "success";
	}
	
	@GetMapping("/async")
	public Callable<String> asyncOrder() throws Exception {
		logger.info("主线程开始");
		Callable<String> callable = ()->{
			logger.info("副线程开始");
			Thread.sleep(1000);
			logger.info("副线程结束");
			return "success";
		};
		logger.info("主线程结束");
		return callable;
	}
}
