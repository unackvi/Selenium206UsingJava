package com.us.jyoti.homework.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XPathDIQspiders {

	public static void main(String[] args) {
		
		/* ********************************************************************************** */
		/* replaced thread.sleep with ExplicitlyWait                                         */
		/* 
		/* ********************************************************************************** */
		
		
		// #2 qspiders.com: Contact-> print mobile number of Qspiders United states
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://qspiders.com/");
		driver2.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver2, 3);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Contact')]")));
		
		driver2.findElement(By.xpath("//span[contains(text(), 'Contact')]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// how to know if the window is visible before it is maximized for Explicit wait?
		//wait.until(ExpectedConditions.)
		
		driver2.manage().window().maximize();
		
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//Explicitly Wait until the next webElement is Visible before an action is performed on that element
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='United Kingdom']/../..//span[contains(text(),'+44')]")));
		//------------------ using DI XPath
		System.out.println(driver2.findElement(By.xpath("//p[text()='United Kingdom']/../..//span[contains(text(),'+44')]")).getText());		
		//------------------ using DI XPath
		System.out.println(driver2.findElement(By.xpath("//p[@class='card-header-title has-text-primary'][text()='Online']/../..//span[contains(text(),'+919686')]")).getText());
		
		driver2.close();

	}

}
