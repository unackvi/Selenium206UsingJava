package com.us.jyoti.homework.multiplewebelements;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionYahoo {

	/* ********************************************************************************** */
	/* replaced thread.sleep with ImplicitlyWait as there are only calls to findElement() */
	/* ********************************************************************************** */
	
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("selenium");
//		Thread.sleep(1000);
		
		// make sure the whole text in web browser auto suggestion drop down is highlighting when you scroll
		// up and down the list of xpath in Developers Bar
		// sometimes only part of the search result text is highlighting
		List<WebElement> listOfResults = driver.findElements(By.xpath("//li[@role='option']"));
//		Thread.sleep(3000);			
		// use iterator
		ListIterator<WebElement> lit = listOfResults.listIterator();
		while(lit.hasNext()) {
			WebElement thisElement = lit.next();
			if(thisElement.getAttribute("data").equalsIgnoreCase("seLenium beneFIts")) {
				thisElement.click();
				break;
			}
		Thread.sleep(3000);		
		}
		
	}

}
