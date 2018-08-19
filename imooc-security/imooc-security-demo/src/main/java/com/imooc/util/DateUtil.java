package com.imooc.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.lang.StringUtils;

public class DateUtil {
	
	
	public static String format(Date date,String pattern) {
		if(StringUtils.isEmpty(pattern)) {
			pattern = "yyyy-MM-dd hh:mm:ss";
		}	
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		return dateFormat.format(date);
	}
	
	public static Date parse(String date,String pattern) throws Exception{
		if(StringUtils.isEmpty(pattern)) {
			pattern = "yyyy-MM-dd hh:mm:ss";
		}	
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		return dateFormat.parse(date);
	}
}
