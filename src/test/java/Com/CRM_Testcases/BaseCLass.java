package Com.CRM_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import Com.CRM_pages.Homepage;
import Com.CRM_pages.Login_page;

public class BaseCLass 
{
	
	public WebDriver driver;
	public Homepage hp;
	public Login_page lp;
	
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		hp= new Homepage(driver);
		lp= new Login_page (driver);
		
	}
	

}
