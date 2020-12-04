package com.us.jyoti.homework.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDIActitime {

	public static void main(String[] args) throws Exception {
		
		// #3 actitime.com: login 
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://demo.actitime.com/login.do");
		driver3.manage().window().maximize();
		driver3.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("admin");
		driver3.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("manager");
		driver3.findElement(By.xpath("//a[contains(@id,'login')]")).click();
		Thread.sleep(3000);
		
		//click on Task link
		WebElement settings = driver3.findElement(By.xpath("//div[@id='container_tasks']"));
		JavascriptExecutor js1 = (JavascriptExecutor)driver3;
		js1.executeScript("arguments[0].click()", settings);
		Thread.sleep(3000);
		
		//Click Customer Settings button of Galaxy corp		
		// results in Exception: NoSuchElement so need to use the Javascript executor to click
		WebElement settings3 = driver3.findElement(By.xpath("(//div[contains(text(), 'Galaxy')])[1]/../..//div[@class='editButton']"));
		JavascriptExecutor js3 = (JavascriptExecutor)driver3;
		js3.executeScript("arguments[0].click()", settings3);
		Thread.sleep(3000);
	
		// ************************************************************* //
		// #4 actitime.com: click on Task link -> Add New-> New Customer ->  

		driver3.findElement(By.xpath("//div[(@class='title ellipsis')]")).click();
		driver3.findElement(By.xpath("//div[(@class='item createNewCustomer')]")).click();
		Thread.sleep(3000);
		
		// enter name-> Create Customer button	
		String name = "Uzma Shah";
		driver3.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(name);
		WebElement settings4 = driver3.findElement(By.xpath("//div[@class='components_button withPlusIcon']"));//
		JavascriptExecutor js4 = (JavascriptExecutor)driver3;
		js4.executeScript("arguments[0].click()", settings4);
		Thread.sleep(3000);		
		
		// -> Search for CustName->  
		//using forward traversing from a static parent
		//driver3.findElement(By.xpath("//div[@class='customersProjectsPanel']/div[1]/div[2]/div[1]/table/tbody/tr/td[1]/div/input[@placeholder = 'Start typing name ...']")).sendKeys(name);
		// or simply this
		driver3.findElement(By.xpath("//input[@placeholder = 'Start typing name ...']")).sendKeys(name);
		Thread.sleep(5000);	
		
		// -> Click on highlighted one
		WebElement settings5 = driver3.findElement(By.xpath("//span[@class='highlightToken']"));
		js4.executeScript("arguments[0].click()", settings5);
		Thread.sleep(3000);
		
		//Click on newly created Customer Settings Button->
		System.out.println("//div[contains(text(), "+"'"+name+"')]/../..//div[@class='editButton']");
		driver3.findElement(By.xpath("//div[contains(text(), "+"'"+name+"')]/../..//div[@class='editButton']"));
		
		settings4 = driver3.findElement(By.xpath("(//div[contains(text(),"+"'"+name+"')])[2]/../div[2]"));
		js4.executeScript("arguments[0].click()", settings4);
		Thread.sleep(3000);	
		
		// Actions 
		// is this a valid way to forward traverse: //parent//inner child skipping intermediate children?
		driver3.findElement(By.xpath("//div[@class='editCustomerPanelHeader']//div[@class='action']"));
		settings4 = driver3.findElement(By.xpath("//div[@class='editCustomerPanelHeader']//div[@class='action']"));
		js4.executeScript("arguments[0].click()", settings4);
		Thread.sleep(3000);	
		
		// -> Delete 
		
		// Simply use this (//div[contains(text(),'Delete')])[2] OR using forward traversing from a static element
		settings4 = driver3.findElement(By.xpath("//div[@class='taskManagement_customerPanel']/div[4]/div/div[3]/div[contains(text(),'Delete')]"));
		js4.executeScript("arguments[0].click()", settings4);
		Thread.sleep(3000);	
		
		// -> Delete Permanently		
		settings4 = driver3.findElement(By.xpath("//span[contains(text(),'Delete permanently')]"));
		js4.executeScript("arguments[0].click()", settings4);		
		Thread.sleep(3000);		

		
		driver3.close();
	}

}
