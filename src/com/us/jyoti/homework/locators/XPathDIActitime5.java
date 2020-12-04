package com.us.jyoti.homework.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDIActitime5 {

	public static void main(String[] args) throws Exception {
		// #5 actitime.com: Settings->  

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[contains(@id,'login')]")).click();
		Thread.sleep(3000);
		
		WebElement elem = driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", elem);
		Thread.sleep(3000);		
		
		// Leave Types Link -
		elem = driver.findElement(By.linkText("Leave Types"));
		js.executeScript("arguments[0].click()", elem);	
		Thread.sleep(3000);
		
		// > Create Leave Type ->	
		elem = driver.findElement(By.xpath("(//span[text()='Create Leave Type'])[1]"));
		js.executeScript("arguments[0].click()", elem);
		
		// enter name -> 
		driver.findElement(By.id("leaveTypeLightBox_nameField")).sendKeys("Uzma S");
		
		// Create Leave Type 
		elem = driver.findElement(By.xpath("(//span[text()='Create Leave Type'])[2]"));
		js.executeScript("arguments[0].click()", elem);
		Thread.sleep(3000);
		
		// -> Delete
		
		
		
	}

}
