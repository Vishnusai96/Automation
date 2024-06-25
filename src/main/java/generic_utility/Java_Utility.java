package generic_utility;

import java.util.Random;

public class Java_Utility {

	public int getRandomNum() {
		Random ran=new Random();
		int r=ran.nextInt(100);
		return r;
		
	}
}
