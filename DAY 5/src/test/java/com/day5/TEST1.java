package com.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TEST1 {
	
	public static void main(String[]args) {
		 System.setProperty("webdriver.chrome.driver","E:\\Program Softwares\\chromedriver_win32\\chromedriver.exe");
		  ChromeOptions co=new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  WebDriver driver=new ChromeDriver(co);
	    driver.get("https://demoqa.com/droppable/");
	    Actions a = new Actions(driver);
	    WebElement sourceEle= driver.findElement(By.id("draggable"));
	    WebElement destEle = driver.findElement(By.id("droppable"));
	    a.clickAndHold(sourceEle).release(destEle).build().perform();
	    a.dragAndDrop(sourceEle, destEle).build().perform();
	  }
}