package object_repositries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_utility.Web_Driver_Utility;

public class Homepage extends Web_Driver_Utility {

	
	// declaration
			@FindBy(linkText = "Organizations")
			private WebElement OrganizationsLnk;

			@FindBy(linkText = "Contacts")
			private WebElement ContactsLnk;

			@FindBy(linkText = "Opportunities")
			private WebElement opportunitiesLnk;

			@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
			private WebElement AdministratorImg;

			@FindBy(linkText = "Sign Out")
			private WebElement SignOutLnk;

			// initialization
			public void HomePage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}

			// Utilization
			public WebElement getOrganizationsLnk() {
				return OrganizationsLnk;
			}
			
			public WebElement getContactsLnk() {
				return ContactsLnk;
			}

			public WebElement getOpportunitiesLnk() {
				return opportunitiesLnk;
			}

			public WebElement getAdministratorImg() {
				return AdministratorImg;
			}

			public WebElement getSignOutLnk() {
				return SignOutLnk;
			}

			//Business Library
			/**
			 * This method will click on Organizations link
			 */
			public void clickOnOrganizationLink()
			{
				OrganizationsLnk.click();
			}
			
			/**
			 * This method will click on Contacts link
			 */
			public void clickOnContactsLink()
			{
				ContactsLnk.click();
			}
			
			/**
			 * This method will logout of the application
			 * @param driver
			 */
			public void logOutOfApp(WebDriver driver )
			{
				mouseHoverAction(driver, AdministratorImg);
				SignOutLnk.click();
			}			
				
			}

			
			
			
			
			