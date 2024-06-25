package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_Count {
	@Test(invocationCount = 10)
	public void TC() {
		Reporter.log("Hii",true);
		
	}
}
