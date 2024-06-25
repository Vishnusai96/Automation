package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void TC1() {
		Reporter.log("Hi",true);
	}
	@Test
	public void TC2() {
		Reporter.log("Hello",true);
	}
	
}

