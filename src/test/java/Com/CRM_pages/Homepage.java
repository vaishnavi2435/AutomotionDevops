package Com.CRM_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class Homepage

{
	
	private WebDriver driver;
	
	public Homepage(WebDriver driver)   // comes from base class
	{
		
		this.driver=driver;
		//PageFactory.initElements(driver,this);
	}
	
	
	// locator(data member locator)
	
	 private By email=By.id("SignIn");
	 
	 
	 // method (functionality of test) 
	 
	 public String geturl()
	 {
		return driver.getCurrentUrl();
	 }
	 
	 
	 public String getTittle()
	 {
		return driver.getTitle();
	 }
	 
	 
	 public String getStatusOfLink()
	 {
		 driver.findElement(email).click();
		 
		 return driver.getCurrentUrl();
	 }
	
	

}
