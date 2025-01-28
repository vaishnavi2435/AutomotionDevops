package Com.CRM_Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTestcase extends  BaseCLass 
{
	@BeforeClass()
	
	public void pagesetup()
	{
		hp.getStatusOfLink();
	}
	
	
  @Test(priority=1)
  public void verifylologin()
  {
	 String url= lp.doloign("test@gmail.com", "test123");
	 Assert.assertTrue(url.contains("com/crm/customers"),"url are not matched");
	 System.out.println("login is pass :"+url);
	  
  }
  
  
  
  
  

  
}
