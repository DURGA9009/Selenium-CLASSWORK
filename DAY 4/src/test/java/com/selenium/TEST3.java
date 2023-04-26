package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TEST3 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Program Softwares\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		WebElement rname=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
		rname.sendKeys("recipient name");
		WebElement email=driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
		email.sendKeys("recipient email");
		WebElement yname=driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
		yname.sendKeys("your name");
		WebElement yemail=driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
		yemail.sendKeys("your email");
		WebElement daybutton=driver.findElement (By.xpath("//*[@id=\"input-theme-7\"]"));
		daybutton.click();	
		WebElement message=driver.findElement(By.xpath("//*[@id=\"input-message\"]"));
		message.sendKeys("messages are many");
		WebElement amount=driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
		amount.sendKeys("1 is enough");
		
	}

}
