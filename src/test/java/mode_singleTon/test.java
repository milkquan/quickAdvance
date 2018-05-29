package mode_singleTon;


import org.junit.Test;

import com.mode.SingleTon1;

public class test {
	
	@Test
	public void testSingleTon() {
		
		SingleTon1 singleTon1 = SingleTon1.getInstance();
		SingleTon1 singleTon2 = SingleTon1.getInstance();
		
		if(singleTon1==singleTon2) {
			System.out.println("单例模式获取的对象都一样！");
		}
	
	}
}
