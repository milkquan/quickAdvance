package com.mode;

public class SingleTon3 {
	
	//线程安全式
	//使用volatile关键字保其可见性
	private volatile static SingleTon3 singleTon1;
	
	private SingleTon3() {
		
	}
	
	public static SingleTon3 getInstance() {
		
		synchronized (SingleTon3.class) {
			if(singleTon1==null) {
				singleTon1 = new SingleTon3();
			}
		}
		return singleTon1;
	}
}
