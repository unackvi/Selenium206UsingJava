package com.us.jyoti.homework.multiplewebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinksMyntra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();

		List<WebElement> listLinks = driver.findElements(By.xpath("//a"));
		System.out.println(listLinks.size());
		for(int i=0;i<listLinks.size();i++) 
		{
			//System.out.println(listLinks.get(i).getText());
			System.out.println(listLinks.get(i).getAttribute("href"));
			Thread.sleep(1000);
		}

	}

}
