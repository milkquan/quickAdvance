package com.imooc.interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.imooc.util.DateUtil;


@Component
public class TimeInterceptor implements HandlerInterceptor {
	
	private Logger Log = LoggerFactory.getLogger(TimeInterceptor.class);
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception)
			throws Exception {
//		Log.info("======afterCompletion========");
		String name = request.getAttribute("name").toString();
		String date = request.getAttribute("date").toString();
//		Log.info("======afterCompletion name: "+name);
//		Log.info("======afterCompletion date: "+date);
//		Log.info("======afterCompletion exception: "+exception);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
//		Log.info("======postHandle========");
		String name = request.getAttribute("name").toString();
		String date = request.getAttribute("date").toString();
//		Log.info("======postHandle name: "+name);
//		Log.info("======postHandle date: "+date);
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//		Log.info("======preHandle========");
		request.setAttribute("name", "barry");
		request.setAttribute("date", DateUtil.format(new Date(), ""));
//		Log.info(((HandlerMethod)handler).getBean().getClass().getName());
//		Log.info(((HandlerMethod)handler).getMethod().getName());
		return true;
	}

}
