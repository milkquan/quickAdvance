package com.mode;

public class SingleTon1 {
	
	//恶汉式
	private static SingleTon1 singleTon1 = new SingleTon1();
	
	private SingleTon1() {
		
	}
	
	public static SingleTon1 getInstance() {
		
		return singleTon1;
	}
}
