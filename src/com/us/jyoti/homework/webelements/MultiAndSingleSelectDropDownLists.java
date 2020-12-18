package com.us.jyoti.homework.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class MultiAndSingleSelectDropDownLists {

	public static void orangeHRM() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("txtPassword")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id = 'menu_directory_viewDirectory']")).click();
		Thread.sleep(3000);
		WebElement jobDDList = driver.findElement(By.xpath("//select[@id = 'searchDirectory_job_title']"));
		Select sel = new Select(jobDDList);
		sel.selectByVisibleText("HR Manager");
		Thread.sleep(3000);

		WebElement locDDList1 = driver.findElement(By.xpath("//select[@id = 'searchDirectory_location']"));
		Select sel1 = new Select(locDDList1);
		sel1.selectByValue("5");
		Thread.sleep(3000);
		driver.close();
	}

	public static void actitime() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("username")).sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class = 'menu_icon'])[2]")).click();
		Thread.sleep(3000);			
		driver.findElement(By.xpath("//a[contains(text(),'Types of Work')]")).click();
		Thread.sleep(3000);	
		
		driver.findElement(By.xpath("//label[text() ='Archived only']")).click();	
		driver.findElement(By.xpath("//input[@onclick ='filterTypes()']")).click();	
		Thread.sleep(3000);
		driver.close();
	}

	public static void yahoo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-ylk='sec:yb_accounts;slk:Account Login;itc:0;']")).click();
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//a[@data-ylk='elm:link;elmt:secondary;mKey:login-landing-signup']")).click();

		//select[@name='shortCountryCode']
		WebElement areaCodeDDList = driver.findElement(By.xpath("//select[@name='shortCountryCode']"));
		Select sel = new Select(areaCodeDDList);
		sel.selectByValue("PK");
	}

	public static void americanairlines() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.americanairlines.in/");
		driver.manage().window().maximize();
		
		
	}

	public static void naukri() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("(//button[@data-ga-click='Register_QSB|Desktop Homepage'])[1]")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//button[contains(text(),'I am Experienced')]")).click();
		Thread.sleep(3000);			
		driver.findElement(By.xpath("//input[@name='expYear']")).click();
		// this is not a Select list so can't use the Select Class.
		// Important Point Below
		// Also there is a problem on the web page to not be able to click on the drop down to inspect
		// used the scroll bar to inspect and then searched manually on CTRL+F where the list numbers appear
		Thread.sleep(3000);			
		driver.findElement(By.xpath("(//div[@ng-class='{notSelectable:item.notSelectable,limitCheck:item.limitCheck}']/div[@class = 'transcluded']/span[text()='1'])[1]")).click();

		driver.findElement(By.xpath("(//span[@class='ddIcon srchTxt'])[2]")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement myelement = driver.findElement(By.xpath("//div[@ng-class='{notSelectable:item.notSelectable,limitCheck:item.limitCheck}']/div[@class='transcluded']/span[.='9']"));
		js.executeScript("arguments[0].click()", myelement);
		Thread.sleep(3000);
		driver.close();
		

		
		
	}

	public static void main(String[] args) throws InterruptedException {

//		orangeHRM();
//		actitime();
//		americanairlines();
//		yahoo();
		naukri();

	}

}
