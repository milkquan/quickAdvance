package mode_singleTon;

import com.mode.SingleTon1;
import com.mode.SingleTon2;
import com.mode.SingleTon3;

public class ThreadTest extends Thread{
	
	
	public void run() {
//		System.out.println(SingleTon1.class.getSimpleName()+":"+SingleTon1.getInstance().hashCode());
		System.out.println(SingleTon2.class.getSimpleName()+":"+SingleTon2.getInstance().hashCode());
//		System.out.println(SingleTon3.class.getSimpleName()+":"+SingleTon3.getInstance().hashCode());
	}
	
	public static void main(String[] args) {
		
		ThreadTest[] thread1 = new ThreadTest[10];
		
		for(int i =0 ;i<10;i++) {
			thread1[i] = new ThreadTest();
		}
		
		for(ThreadTest thread : thread1) {
			thread.start();
		}
	}
}
