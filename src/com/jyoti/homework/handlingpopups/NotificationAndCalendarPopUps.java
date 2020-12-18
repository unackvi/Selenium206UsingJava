package com.jyoti.homework.handlingpopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotificationAndCalendarPopUps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
	
		// first make sure the add popup blockers are turned off so all notifications are showing
		// turn off the notification popup
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);	
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.cnn.com");
		driver.navigate().back();
		driver.navigate().refresh();
		
		driver.quit();
		
		// calendar popup
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.aa.com/homePage.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[@class = 'ui-datepicker-trigger'])[1]")).click();
		driver.findElement(By.xpath("(//a[.='21'])[1]")).click();
		
		driver.findElement(By.xpath("(//button[@class = 'ui-datepicker-trigger'])[2]")).click();
		driver.findElement(By.xpath("(//a[.='21'])[2]")).click();	
				
				

	}

}
