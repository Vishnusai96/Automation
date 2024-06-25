package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeouts {
	@Test(timeOut = 10)
	public void TC() {
		Reporter.log("Hii running TC",true);
	}
}
