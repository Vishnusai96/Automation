package testNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_On_Methods {
	@Test
	public void login() {
		Reporter.log("Login successfull",true);
		//Intentionally I will fail LoginTC
		Assert.fail();
	}
	@Test(dependsOnMethods ="login()" )
	public void logout() {
		Reporter.log("Logout successfull",true);
}
}
