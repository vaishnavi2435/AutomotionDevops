package Com_CRM_Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrrenshot 
{
	
public  static void getScrresnhot(WebDriver driver) 
{



TakesScreenshot ts= (TakesScreenshot) driver;

File temp=ts.getScreenshotAs(OutputType.FILE);


File des= new File(System.getProperty("user.dir")+"//scrrenshot//test"+System.currentTimeMillis()+".png");
   
      try
      {
		FileHandler.copy(temp, des);
		
	} 
      
      catch (IOException e) 
      {
	
		e.printStackTrace();
	} 


}
}