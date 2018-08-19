package com.imooc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
//filter是j2ee规范只能获取request，response信息，无法获取spring的信息 如果想要更详细的信息用spring 拦截器实现	
public class TimeFilter implements Filter{
	
	private Logger Log = LoggerFactory.getLogger(TimeFilter.class);
	
	@Override
	public void destroy() {
//		Log.info("====time filter destory====");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
//		Log.info("====time filter start====");
		chain.doFilter(request, response);
//		Log.info("====time filter finish====");
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
//		System.out.println("====time filter init====");
//		Log.info("====time filter init====");		
	}

}
