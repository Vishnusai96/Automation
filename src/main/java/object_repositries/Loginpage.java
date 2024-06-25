package object_repositries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindBy(name = "user_name")
	private WebElement userNameEdt;

	@FindBy(name = "user_password")
	private WebElement passwordEdt;
 
	@FindBy(xpath="//input[@id='submitButton']")private WebElement loginBtn;


	// Rule 3: Create a constructor to initiliaze
		public void LoginPage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}

		// Rule 4: Provide getters to access
		public WebElement getUserNameEdt() {
			return userNameEdt;
		}

		public WebElement getPasswordEdt() {
			return passwordEdt;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}

		//Business Libraries - project specific generic utilities
		/**
		 * This method will login to application
		 * @param USERNAME
		 * @param PASSWORD
		 */
	    public void loginToApp(String USERNAME, String PASSWORD)
	    {
	    	userNameEdt.sendKeys(USERNAME);
	    	passwordEdt.sendKeys(PASSWORD);
	    	loginBtn.click();

	
}
}


