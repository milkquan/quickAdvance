package com.mode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SingleTon4 {
	
	//线程安全式
	//使用volatile关键字保其可见性
	private static SingleTon4 singleTon1;
	private static int maxInt = 2;
	private static List<SingleTon4> list = new ArrayList<SingleTon4>();
	private static List<String> namelist = new ArrayList<String>();
	private static Integer index;
	
	static {
		for(int i=0;i<maxInt;i++) {
			list.add(new SingleTon4("皇"+(i+1)+"帝"));
		}
	}
	
	private SingleTon4() {
		
	}
	
	private SingleTon4(String name) {
		namelist.add(name);
	}
	
	
	
	public static SingleTon4 getRandomInstance() {	
		Random random = new Random();
		index = random.nextInt(maxInt);		
		return list.get(index);
	}
	
	public static void say() {
		System.out.println(namelist.get(index));
	}
}
