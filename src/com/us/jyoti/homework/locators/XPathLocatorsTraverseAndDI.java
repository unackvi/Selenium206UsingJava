package com.us.jyoti.homework.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocatorsTraverseAndDI {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[contains(@id,'login')]")).click();
		Thread.sleep(3000);


		// #1 actitime login -> Settings -> Types OF Work->Create ->Enter name ->Click on Create type of Work->Click Delete
		driver.manage().window().maximize();
		WebElement whoRyou = driver.findElement(By.xpath("(//div[.=contains(@class,'popup_menu_icon')])[2]"));
		System.out.println(whoRyou.getTagName());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", whoRyou);
		Thread.sleep(3000);
	
		//driver.close();

			
		// #6 filehippo.com: Popular Software -> Download vlc Media Player

	}

}
