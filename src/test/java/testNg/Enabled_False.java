package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled_False {
	@Test(enabled = false)
	public void TC1() {
		Reporter.log("Hii ge",true);
	}
	@Test(priority = 1)
	public void TC2() {
		Reporter.log("Hii gm",true);
	}
	@Test(priority = 2)
	public void TC3() {
		Reporter.log("Hii ga",true);
}
}
