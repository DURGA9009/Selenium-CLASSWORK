package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TEST2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver
		System.setProperty("webdriver.chrome.driver","E:\\Program Softwares\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb/");
		WebElement fname=driver.findElement(By.id("input-firstname"));
		fname.sendKeys("firstname");
		WebElement lname=driver.findElement(By.id("input-lastname"));
		lname.sendKeys("lastname");
		WebElement email=driver.findElement(By.id("input-email"));
		email.sendKeys("email");
		WebElement password=driver.findElement(By.id("input-password"));
		password.sendKeys("password");   
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrol1By (0,250)","");
		WebElement yesbutton=driver.findElement (By.id("input-newsletter-yes"));
		yesbutton.click();
		 
		
		}
}
