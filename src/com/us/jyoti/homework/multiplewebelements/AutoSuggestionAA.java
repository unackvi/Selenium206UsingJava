package com.us.jyoti.homework.multiplewebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionAA {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.americanairlines.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='origin']")).sendKeys("SAN");
		Thread.sleep(1000);
		
		List<WebElement> listOfResults = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		Thread.sleep(3000);		

		for(int i=0;i<listOfResults.size();i++) 
		{
			String resulText = listOfResults.get(i).getText();
			System.out.println(resulText);
			// it's not in the text so how am I getting the value from .getText()
			if(resulText.contains("San Jose (SJO)")) {
				listOfResults.get(i).click();
				System.out.println("found THE airport");
				break;
			}
			Thread.sleep(1000);
		}
		driver.close();
		

	}

}
