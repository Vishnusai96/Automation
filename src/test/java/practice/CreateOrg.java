package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateOrg {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("http://localhost:8888/");
	
	//implicit wait(10)
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	//UN
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	//PWD
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	
	//login button
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	
	//maximize the window
	driver.manage().window().maximize();

	//click on orgnization module
	driver.findElement(By.xpath("//a[text()='Organizations']")).click();

	//click on orgnization lookup image
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();

	//give orgnization name
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("intel");

	//save it
	driver.findElement(By.xpath("//input[@name='button']")).click();

	//verify wether orgnization name is created or not
	String actText = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	if(actText.contains("intel")) {
		System.out.println("Org is created TC is pass");
	}
	else{
		System.out.println("TC is failed");

	//logout from application 
	WebElement admele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	Actions a=new Actions(driver);
	a.moveToElement(admele).perform();

	//click on sign out button
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

	
}
}
}

