package com.imooc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.imooc.interceptor.TimeInterceptor;


@SpringBootConfiguration
public class InterceptorConfig extends WebMvcConfigurerAdapter{
	
	@Autowired
	private TimeInterceptor timeInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {		
		registry.addInterceptor(timeInterceptor);
	}

}
