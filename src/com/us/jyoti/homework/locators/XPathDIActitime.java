package com.us.jyoti.homework.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XPathDIActitime {
	/* ********************************************************************************** */
	/* replaced thread.sleep with ExplicitlyWait                                         */
	/* 
	/* ********************************************************************************** */
	public static void main(String[] args) throws Exception {
		
		// #3 actitime.com: login 
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[contains(@id,'login')]")).click();
		//Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='container_tasks']")));
		
		//click on Task link
		WebElement settings = driver.findElement(By.xpath("//div[@id='container_tasks']"));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click()", settings);
		Thread.sleep(3000);
		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(), 'Galaxy')])[1]/../..//div[@class='editButton']")));
		//Click Customer Settings button of Galaxy corp		
		WebElement settings3 = driver.findElement(By.xpath("(//div[contains(text(), 'Galaxy')])[1]/../..//div[@class='editButton']"));
		js1.executeScript("arguments[0].click()", settings3);
//		Thread.sleep(3000);
	
		// ************************************************************* //
		// #4 actitime.com: click on Task link -> Add New-> New Customer ->  

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[(@class='title ellipsis')]")));
		driver.findElement(By.xpath("//div[(@class='title ellipsis')]")).click();
		driver.findElement(By.xpath("//div[(@class='item createNewCustomer')]")).click();
		Thread.sleep(3000);
		
		// enter name-> Create Customer button	
		String name = "Uzma S";
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(name);
		WebElement settings4 = driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']"));//
		js1.executeScript("arguments[0].click()", settings4);
//		Thread.sleep(3000);		
		
		// -> Search for CustName->  
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder = 'Start typing name ...']")));		
		driver.findElement(By.xpath("//input[@placeholder = 'Start typing name ...']")).sendKeys(name);
		Thread.sleep(5000);	
		
		// -> Click on highlighted one
		WebElement settings5 = driver.findElement(By.xpath("//span[@class='highlightToken']"));
		js1.executeScript("arguments[0].click()", settings5);
		
		//Click on newly created Customer Settings Button->
		System.out.println("XPath String: "+"//div[contains(text(), "+"'"+name+"')]/../..//div[@class='editButton']");	
		System.out.println("XPath String: "+"//div[contains(text(), 'Uzma')]/../..//div[@class='editButton']");
		//Thread.sleep(3000);	
		
		// TimeOutException  with ExplicitlyWait but not Thread.sleep?  
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Uzma')]/../..//div[@class='editButton']")));
		driver.findElement(By.xpath("//div[contains(text(), 'Uzma')]/../..//div[@class='editButton']"));

		// using String name
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), "+"'"+name+"')]/../..//div[@class='editButton']")));
		//	driver.findElement(By.xpath("//div[contains(text(), "+"'"+name+"')]/../..//div[@class='editButton']"));
		
		
		settings4 = driver.findElement(By.xpath("(//div[contains(text(),"+"'"+name+"')])[2]/../div[2]"));
		js1.executeScript("arguments[0].click()", settings4);
		Thread.sleep(5000);	
		
		// Actions 
		// DI XPath
		/////////////////////////////// TimeOutException  with ExplicitlyWait but not Thread.sleep?  /////////////////////////////////////////////////
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),"+"'"+name+"')])[3]/../../..//div[.='ACTIONS']")));
		settings4 = driver.findElement(By.xpath("(//div[contains(text(),"+"'"+name+"')])[3]/../../..//div[.='ACTIONS']"));
		js1.executeScript("arguments[0].click()", settings4);
//		Thread.sleep(3000);	
		
		// -> Delete 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='taskManagement_customerPanel']/div[4]/div/div[3]/div[contains(text(),'Delete')]")));
		settings4 = driver.findElement(By.xpath("//div[@class='taskManagement_customerPanel']/div[4]/div/div[3]/div[contains(text(),'Delete')]"));
		js1.executeScript("arguments[0].click()", settings4);
//		Thread.sleep(3000);	
		
		// -> Delete Permanently	
		/////////////////////////////// TimeOutException with ExplicitlyWait but not Thread.sleep? /////////////////////////////////////////////////		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Delete permanently')]")));
		settings4 = driver.findElement(By.xpath("//span[contains(text(),'Delete permanently')]"));
		js1.executeScript("arguments[0].click()", settings4);		
		Thread.sleep(3000);		

		
		driver.close();
	}

}
