package com.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TEST4 {
  
	 public static void main(String[] args) {
		 
		 
		 
		 
		  System.setProperty("webdriver.chrome.driver","E:\\Program Softwares\\chromedriver_win32\\chromedriver.exe");

		  ChromeOptions co=new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  WebDriver driver=new ChromeDriver(co);
		  driver.get("https://j2store.net/free/");
		  WebElement clothing=driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]"));
		  clothing.click();
		  driver.manage().window().maximize();
		  driver.navigate().back();
		  driver.navigate().forward();
		  driver.navigate().refresh();
		  driver.close();

		 }
}