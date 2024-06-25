package testng_batch;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 {
	@Test
	public void TC7() {
		Reporter.log("TC7",true);
	}
	@Test
	public void TC8() {
		Reporter.log("TC8",true);
	}
	@Test
	public void TC9() {
		Reporter.log("TC9",true);
	}
}
