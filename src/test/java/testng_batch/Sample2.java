package testng_batch;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void TC4() {
		Reporter.log("TC4",true);
	}
	@Test
	public void TC5() {
		Reporter.log("TC5",true);
	}
	@Test
	public void TC6() {
		Reporter.log("TC6",true);
	}
}
