package com.us.jyoti.homework.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElemMethodsForKeyboard {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("qspiders");
		Thread.sleep(5000);
		// remove p & e
		// the control is at the end of 
		driver.findElement(By.id("email")).sendKeys(Keys.ARROW_LEFT);
		driver.findElement(By.id("email")).sendKeys(Keys.ARROW_LEFT);
		driver.findElement(By.id("email")).sendKeys(Keys.ARROW_LEFT);
		driver.findElement(By.id("email")).sendKeys(Keys.ARROW_LEFT);
		driver.findElement(By.id("email")).sendKeys(Keys.ARROW_LEFT);
		driver.findElement(By.id("email")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("email")).sendKeys(Keys.ARROW_RIGHT);
		driver.findElement(By.id("email")).sendKeys(Keys.ARROW_RIGHT);
		driver.findElement(By.id("email")).sendKeys(Keys.DELETE);

		
		// enter qspiders, enter jspiders in the beginning
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("qspiders");
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL, Keys.HOME);
		driver.findElement(By.id("email")).sendKeys("jspiders");
		Thread.sleep(5000);
		
		// enter qspiders, give space and enter pyspiders
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("qspiders");
		driver.findElement(By.id("email")).sendKeys(Keys.SPACE);
		driver.findElement(By.id("email")).sendKeys("pspiders");
		Thread.sleep(5000);
		// enter qspiders in uppercase
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(Keys.SHIFT, "qspiders");
		Thread.sleep(5000);
		
		// same as above
		driver.findElement(By.id("email")).clear();
		String test = "qspiders";
		String test1 = test.toUpperCase();
		driver.findElement(By.id("email")).sendKeys(test1);

		Thread.sleep(5000);	
		
		// enter QSPIDERS in lowercase
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("qspiders");
		Thread.sleep(5000);
		
		
		// enter qspiders in firstname, switch to passworrd using TAB and enter jspiders
		driver.findElement(By.id("email")).sendKeys(Keys.TAB);
		driver.findElement(By.id("pass")).sendKeys("jspiders");;

		
		// enter qspiders and print the length of the string value entered
		String userName = driver.findElement(By.id("email")).getAttribute("value");	
		System.out.println("The length of username is: "+ userName.length());
		
		
		

	}

}
