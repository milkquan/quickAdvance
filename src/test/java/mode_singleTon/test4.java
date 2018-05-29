package mode_singleTon;

import org.junit.Test;

import com.mode.SingleTon4;

public class test4 {
	
	@Test
	public void testSingleTon() {
		
		for(int i=1;i<=5;i++) {		
			System.out.print("第"+i+"大臣参拜的是:");
			SingleTon4.getRandomInstance();
			SingleTon4.say();	
		}
	
	}
}
