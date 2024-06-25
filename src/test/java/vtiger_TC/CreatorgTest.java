package vtiger_TC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import generic_utility.Excel_File_Utility;
import generic_utility.Java_Utility;
import generic_utility.Property_File_Utility;
import generic_utility.Web_Driver_Utility;
import object_repositries.Creatnew_Organizationpage;
import object_repositries.Homepage;
import object_repositries.Loginpage;
import object_repositries.Organization_Infopage;
import object_repositries.Organizationpage;

public class CreatorgTest {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriver driver=null;
		Property_File_Utility putil=new Property_File_Utility();
		Excel_File_Utility eutil=new Excel_File_Utility();
		Web_Driver_Utility wutil=new Web_Driver_Utility();
		Java_Utility jutil=new Java_Utility();
	
		//fetch browser name
		String BROWSER = putil.readDataFromPF("browser");
		System.out.println(BROWSER);
		//Launch browser
		if(BROWSER.equals("edge")) {
			 driver=new EdgeDriver();
		}
		else if(BROWSER.equals("chrome")) {
			 driver=new ChromeDriver();
		}
		else if(BROWSER.equals("firefox")) {
			 driver=new FirefoxDriver();
		}
		else {
			System.out.println("INVALID BROWSER NAME");
		}
		wutil.maximizeWindow(driver);
		wutil.waitForPageLoad(driver);
		//fetch URL
		String URL = putil.readDataFromPF("url");
		driver.get(URL);
		//Login to app
		String UN = putil.readDataFromPF("un");
		String PWD = putil.readDataFromPF("pwd");
		//Create object of Login apge POM class
		Loginpage lp=new Loginpage(driver);
		lp.loginToApp(UN,PWD);

		//Create Object of Homepage
		Homepage h=new Homepage(driver);
		h.clickOnOrganizationLink();
		//click on orgLookup img
			Organizationpage op=new Organizationpage(driver);
			op.clickoncreateorgLookUpImg();	
			//give org name
			String orgname = eutil.readDatafromExcl("Sheet1", 0, 0);
			Creatnew_Organizationpage cnop=new Creatnew_Organizationpage(driver);
			cnop.createNewOrganization(orgname+jutil.getRandomNum());	
			//click on save btn
			cnop.getSaveBtn();
			//create object of OrganizationInfpage
			Organization_Infopage oip=new OrganizationInfoPage(driver);
			String header = oip.getHeader();
			if(header.contains(orgname)) {
				System.out.println("Org is created and TC is pass");
			}
			else{
				System.out.println("TC is failed");
			}
			//logout from app
			h.logOutOfApp(driver);
			

		
		
	}
}


