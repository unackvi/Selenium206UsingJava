package com.us.jyoti.homework.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XPathDIActitime5 {

	public static void main(String[] args) throws Exception {
		// #5 actitime.com: Settings->  

		/* ********************************************************************************** */
		/* replaced thread.sleep with ExplicitlyWait                                         */
		/* 
		/* ********************************************************************************** */
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[contains(@id,'login')]")).click();

		//		Thread.sleep(3000);
		//Explicitly Wait until the next webElement is Visible before an action is performed on that element
		WebDriverWait waitEx = new WebDriverWait(driver, 3);
		waitEx.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='menu_icon'])[2]")));
		// check if this webElement in the findElement is visible first as above. Use the same locator path as you are going to use in the find element statement
		WebElement elem = driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", elem);
		
//		Thread.sleep(3000);		
		WebDriverWait wait1 = new WebDriverWait(driver, 3);
		wait1.until(ExpectedConditions.elementToBeClickable(By.linkText("Leave Types")));
		// Leave Types Link -
		elem = driver.findElement(By.linkText("Leave Types"));
		js.executeScript("arguments[0].click()", elem);	
		
//		Thread.sleep(3000);	
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Create Leave Type'])[1]")));
		// > Create Leave Type ->	
		elem = driver.findElement(By.xpath("(//span[text()='Create Leave Type'])[1]"));
		js.executeScript("arguments[0].click()", elem);
		
		// enter name -> 
		driver.findElement(By.id("leaveTypeLightBox_nameField")).sendKeys("Uzma S");
		
		// Create Leave Type 
		elem = driver.findElement(By.xpath("(//span[text()='Create Leave Type'])[2]"));
		js.executeScript("arguments[0].click()", elem);
		Thread.sleep(3000);
		
		// -> Delete ------------------ using DI XPath
		elem = driver.findElement(By.xpath("//span[.='Uzma S']/../../../../../..//td[@class='leaveTypeDeleteCell last']"));
		js.executeScript("arguments[0].click()", elem);
		
	}

}
