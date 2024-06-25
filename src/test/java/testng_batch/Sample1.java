package testng_batch;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
	@Test
	public void TC1() {
		Reporter.log("TC1",true);
	}
	@Test
	public void TC2() {
		Reporter.log("TC2",true);
	}
	@Test
	public void TC3() {
		Reporter.log("TC3",true);
		Assert.fail();
	}
}
