package com.us.jyoti.homework.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// locate actitime inc link
		driver.get("https://demo.actitime.com");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit(); // closes both/all windows
		
		// locate actitime inc link
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://demo.actitime.com");		
		// use close to see what windows close
		driver2.findElement(By.linkText("actiTIME Inc.")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver2.close(); // closes only the active window, usually the first/main one opened.	
		
		
	}
}
