package com.us.jyoti.homework.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAndPartialLink {

	public static void main(String[] args) {
		// open actitime - print the text of forgotyourpassword link using linkText and PartialLink
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		WebElement link = driver.findElement(By.linkText("Forgot your password?"));
		System.out.println("Using LinkText Locator: " + link.getText());
		WebElement partLink = driver.findElement(By.partialLinkText("Forgot"));
		System.out.println("Using ParitalLinkText Locator: " + partLink.getText());
		
		// print the text of actitime inc link using linkText and partialLinkText
		WebElement link2 = driver.findElement(By.linkText("actiTIME Inc."));
		System.out.println("Using LinkText Locator: " + link2.getText());
		WebElement partLink2 = driver.findElement(By.partialLinkText("actiT"));
		System.out.println("Using ParitalLinkText Locator: " + partLink2.getText());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		driver.quit();
		
		// open myntra.com - print the text of OFFERS link using linkText and partial
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://www.myntra.com");
		WebElement link3 = driver3.findElement(By.linkText("Offers"));
		System.out.println("Using LinkText Locator: "  + link3.getText());
		WebElement partLink3 = driver3.findElement(By.partialLinkText("Off"));
		System.out.println("Using ParitalLinkText Locator: " + partLink3.getText());
		driver3.close();
		
		// login to orangeHRM
		WebDriver driver4 = new ChromeDriver();
		driver4.get("http://opensource-demo.orangehrmlive.com");
		WebElement userName = driver4.findElement(By.id("txtUsername"));
		try {
			Thread.sleep(5000);
		} catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		userName.sendKeys("Admin");
		
		WebElement passW = driver4.findElement(By.id("txtPassword"));
		passW.sendKeys("admin123");
		try {
			Thread.sleep(5000);
		} catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		driver4.findElement(By.id("btnLogin")).click();
		try {
			Thread.sleep(5000);
		} catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		driver4.close();
		
		// print the text of forgot your password using linkText and partialLinkText
		WebDriver driver5 = new ChromeDriver();
		driver5.get("http://opensource-demo.orangehrmlive.com");
		WebElement link4 = driver5.findElement(By.linkText("Forgot your password?"));
		System.out.println("Using LinkText Locator: "  + link4.getText());		
		WebElement link5 = driver5.findElement(By.partialLinkText("Forgot"));
		System.out.println("Using ParitalLinkText Locator: " + link5.getText());	
		

	}

}
