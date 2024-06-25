package testNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations_Flow {
	@Test
	public void TC() {
		Reporter.log("====Actaul TC====",true);
	}
	@BeforeClass
	public void bc() {
		Reporter.log("====LAUNCH BROWSER====",true);
	}
	@BeforeSuite
	public void bs() {
		Reporter.log("====DB CONNECION====",true);
	}
	@AfterClass
	public void ac() {
		Reporter.log("====CLOSE BROWSER====",true);
	}
	@AfterSuite
	public void as() {
		Reporter.log("====DB DISCONNECTION====",true);
	}
	@BeforeMethod
	public void bm() {
		Reporter.log("====Open AAplication====",true);

}
}
