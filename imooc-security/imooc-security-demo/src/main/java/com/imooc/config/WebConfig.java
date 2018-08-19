package com.imooc.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.imooc.filter.TimeFilter;

@SpringBootConfiguration
public class WebConfig {
	
	@Bean
	//用于指定这些filter在那些url中起作用
	//可以将一些第三方的filter加入项目中来
	public FilterRegistrationBean timeFilter() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		TimeFilter timeFilter = new TimeFilter();
		filterRegistrationBean.setFilter(timeFilter);
		List<String> urList = new ArrayList<>();
		urList.add("/*");
		filterRegistrationBean.setUrlPatterns(urList);
		return filterRegistrationBean;
	}

}
