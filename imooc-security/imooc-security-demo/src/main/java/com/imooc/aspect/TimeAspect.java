package com.imooc.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

//声明一个切片类
@Aspect
@Component
public class TimeAspect {
	
	private Logger Log = LoggerFactory.getLogger(TimeAspect.class);
	@Around("execution(* com.imooc.controller.DemoController.*(..))")
	public Object aspectAroud(ProceedingJoinPoint pjp) throws Throwable {
	
		Log.info("=====start aspect=====");
		int i=0;
		Object[] objects = pjp.getArgs();
		if(objects!=null&&objects.length>0) {
			for(Object object:objects) {
				i=i+1;
				Log.info("object "+i+" "+object);
			}
		}
		Object result = pjp.proceed();
		Log.info("=====end aspect=====");
		return result;
	}
}
