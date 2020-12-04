package com.us.jyoti.homework.multiplewebelements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionMyntra {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Tommy");
		Thread.sleep(3000);
		List<WebElement> listLinks = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		System.out.println(listLinks.size());
		for(int i=0;i<listLinks.size();i++) 
		{
			String resulText = listLinks.get(i).getText();
			if(resulText.contains("Perfume")) {
				listLinks.get(i).click();
				System.out.println("found Perfume");
				break;
			}
			Thread.sleep(1000);
		}
		driver.close();
		
	}

}
