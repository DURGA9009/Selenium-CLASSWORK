package com.day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TEST3 {
 public static void main(String[]args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","E:\\Program Softwares\\chromedriver_win32\\chromedriver.exe");
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  WebDriver driver=new ChromeDriver(co);
  driver.get("https://demo.guru99.com/test/delete_customer.php");
  WebElement textBox=driver.findElement(By.name("cusid"));
  WebElement submitButton = driver.findElement(By.name("submit"));
  textBox.sendKeys("401");
  submitButton.click();
  Alert alert1 = driver.switchTo().alert();
  alert1.dismiss();
  textBox.clear();
  textBox.sendKeys("402");
  submitButton.click();
  Alert alert2 = driver.switchTo().alert();
  alert2.accept();
  Alert alert3 = driver.switchTo().alert();
  String text = alert3.getText();
  alert3.accept();
  System.out.println(text);
 }
}