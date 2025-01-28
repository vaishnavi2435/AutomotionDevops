package Com.CRM_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Com_CRM_Utility.Scrrenshot;

public class Login_page 
{
	
	public WebDriver driver;
	
	public Login_page (WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	
	// lacotor
	
	private By email=By.id("email-id");
	private By psw= By.id("password");
	private By btn= By.id("submit-id");
	
	
	public String doloign(String un,String ps)
	
	
	{
		
		Scrrenshot .getScrresnhot(driver);
		driver.findElement(email).sendKeys(un);
		driver.findElement(psw).sendKeys(ps);
		driver.findElement(btn).click();
		
		return driver.getCurrentUrl();

	}
	
	
	
	
	

}
