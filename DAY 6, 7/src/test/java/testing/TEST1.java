package testing;

import org.testng.Assert;
import org.testng.annotations.Test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TEST1 {
  @Test
  public void OPENWEB() {
	 System.setProperty("webdriver.chrome.driver","E:\\Program Softwares\\chromedriver_win32\\chromedriver.exe");
	  
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  WebDriver driver=new ChromeDriver(co);
      driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
      String actualtitle=driver.getTitle();
      String expectedtitle= "Guest Registration Form - User Registration";
      Assert. assertEquals (actualtitle, expectedtitle);
      
  }
  

}
