package com.us.jyoti.homework.multiplewebelements;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionBing {

	/* ********************************************************************************** */
	/* replaced thread.sleep with ImplicitlyWait as there are only calls to findElement() */
	/* ********************************************************************************** */
	
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys("selenium");
//		Thread.sleep(1000);
		
		List<WebElement> listOfResults = driver.findElements(By.xpath("//li[contains(@query,'selenium')]"));
//		Thread.sleep(3000);		

		//using for loop
//		for(int i=0;i<listOfResults.size();i++) 
//		{
//			// it's not in the text so how am I getting the value from .getText()
//			String resulText = listOfResults.get(i).getText();
//			
//			//String resulText = listOfResults.get(i).getAttribute("aria-label");
//			System.out.println(resulText);
//			
//			if(resulText.contains("supplement")) {
//				listOfResults.get(i).click();
//				break;
//			}
//			Thread.sleep(1000);
//		}
		//driver.close();
		
		// using iterator
		ListIterator<WebElement> lit = listOfResults.listIterator();
		System.out.println("lit.nextIndex() "+lit.nextIndex() + lit.toString());
		
		
		while(lit.hasNext()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebElement lListElement = lit.next();
			System.out.println(lListElement.getText());
			if(lListElement.getText().contains("supplement")) {
				lListElement.click();
				System.out.println("found element");
				break;
			}
			
		}
		
	}

}
