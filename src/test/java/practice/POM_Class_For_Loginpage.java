package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Class_For_Loginpage {

	//declaration
	@FindBy(xpath = "//input[@id='user-name']")private WebElement untxtElement;
	@FindBy(xpath = "//input[@id='user-name']")private WebElement pwdtxtElement;
	@FindBy(xpath = "//input[@id='user-name']")private WebElement loginBtn;
	
	//intailization
	  public POM_Class_For_Loginpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

//getters[right click>>source>>generate getters and setter>>select only getter>>finish]

public WebElement getUntxtElement() {
	return untxtElement;
}
public WebElement getPwdtxtElement() {
	return pwdtxtElement;
}
public WebElement getLoginBtn() {
	return loginBtn;
}
}
