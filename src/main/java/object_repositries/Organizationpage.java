package object_repositries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizationpage {

	//Declaration
	@FindBy(xpath = "//img[@alt='creat organizaton...']")
	private WebElement createorgLookUpImg;
	
	//Initialization
	public Organizationpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getcreateorgLookUpImg() {
		return createorgLookUpImg;
	}
	
	//Business Library
	/**
	 * this method will click on creat contact look up image
	 */
	
	public void clickoncreateorgLookUpImg()
	{
		createorgLookUpImg.click();
	}
}


