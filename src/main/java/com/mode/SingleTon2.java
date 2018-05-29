package com.mode;

public class SingleTon2 {
	
	//懒汉式
	private static SingleTon2 singleTon1;
	
	private SingleTon2() {
		
	}
	
	public static SingleTon2 getInstance() {
		
		if(singleTon1==null) {
			singleTon1 = new SingleTon2();
		}
		return singleTon1;
	}
}
