package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TEST1 {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","E:\\Program Softwares\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb/");

		}

}
