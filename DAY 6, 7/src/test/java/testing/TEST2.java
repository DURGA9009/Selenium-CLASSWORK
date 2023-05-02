package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TEST2 {
	int a, b,c;
	@BeforeSuite
	public void getdata() {
		a=7;
		b=4;
	}
  @Test(priority = 1)
  public void add() {
	 c = a+b;
	  Assert.assertEquals(c,11);
	  
  }
  @Test(priority = 2)
  public void sub() {
	  c = a-b;
	  Assert.assertEquals(c,3);
  }
  
  @Test(priority = 3)
  public void mul() {
	  c = a*b;
	  Assert.assertEquals(c,28);
	  
  }

  @Test(priority = 4)
  public void div() {
	  c = a/b;
	  Assert.assertEquals(c,1);
	  
  }

  

}

