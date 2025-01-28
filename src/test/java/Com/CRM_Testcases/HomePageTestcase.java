package Com.CRM_Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTestcase extends BaseCLass 
{
	
	
  @Test(priority=1)
  public void verifyurl() 
  {
	String url=  hp.geturl();
	Assert.assertTrue(url.contains("automationplayground"),"url are not matched");
	System.out.println("url are  matched :"+url);
	  
  }
  
  
  
  @Test(priority=2)
  public void veriftittle() 
  {
	  
	String til=  hp.getTittle();
	Assert.assertTrue(til.contains("Customer"),"Tittle are not matched");
	System.out.println("tittle are matched:"+til);
	  
  }
  
  
  
  @Test(priority=3)
  public void validatesignLInk() 
  {
	 String nextpage= hp.getStatusOfLink();
	  System.out.println(nextpage);
	  
	  
  }
}
