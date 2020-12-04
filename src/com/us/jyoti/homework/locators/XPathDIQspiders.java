package com.us.jyoti.homework.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDIQspiders {

	public static void main(String[] args) {
		
		
		// #2 qspiders.com: Contact-> print mobile number of Qspiders United states
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://qspiders.com/");
		driver2.manage().window().maximize();
		driver2.findElement(By.xpath("//span[contains(text(), 'Contact')]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver2.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// using SelectorsHub adds normalize-space instead of .= or text()
		//p[normalize-space()='United States']//..//..//../footer/a/span[contains(text(), '+1415')]
		// same result as:
		//p[contains(text(), 'States')]//..//..//../footer/a/span[contains(text(), '+1415')]
		System.out.println(driver2.findElement(By.xpath("//p[contains(text(), 'States')]//..//..//../footer/a/span[contains(text(), '+1415')]")).getText());		
		driver2.close();

	}

}
