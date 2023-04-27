package com.day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TEST5 {

	 public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","E:\\Program Softwares\\chromedriver_win32\\chromedriver.exe");
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  WebDriver driver=new ChromeDriver(co);
	  driver.get("https://www.google.com") ;
      driver.manage() .window().maximize();
      
	  driver.findElement(By.name("q")).sendKeys("Apple") ;
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER) ;
      String parent=driver.getWindowHandle() ;
      
	  System.out.println(parent) ;
	  System.out.println(driver.getTitle());
	  driver.switchTo() .newWindow(WindowType. TAB) ;
	  driver.get("https://www.google.com") ;
	  driver.manage() .window() .maximize() ;
	  
	  driver.findElement(By.name("q")).sendKeys("Selenium" ) ;
	  driver. findElement(By.name("q")).sendKeys(Keys. ENTER) ;
	  System.out.print("\n"+driver.getWindowHandle());
	  
	  System.out.println("\n"+driver.getTitle());
	  driver. switchTo() .newWindow(WindowType. TAB) ;
	  driver.get("https://www.google.com") ;
	  driver.manage().window().maximize();
	  driver.findElement (By.name("q")).sendKeys("Cucumber") ;
	  driver.findElement (By.name("q")).sendKeys(Keys.ENTER) ;
	  System.out.print("\n"+driver.getWindowHandle());
	  Set<String>s = driver.getWindowHandles();
	  System.out.println("Number Of Windows Opened = "+s.size());
	  
	 }
}

