package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperationsMoveToElem {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// moving from element to element in 2nd row from All->Buy Again
		WebElement all = driver.findElement(By.xpath("//span[@class='hm-icon-label']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(all).perform();
		Thread.sleep(3000);	
		
		// move to gift cards
		WebElement giftCards = driver.findElement(By.xpath("//a[contains(text(), 'Gift Cards')]"));
		Actions act2 = new Actions(driver);
		act2.moveToElement(giftCards).perform();
		Thread.sleep(3000);	
		
		// move to prime
		WebElement prime = driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
		Actions act3 = new Actions(driver);
		act3.moveToElement(prime).perform();
		Thread.sleep(3000);	
		
		// customer service
		WebElement cust = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_customerservice']"));
		Actions act4 = new Actions(driver);
		act4.moveToElement(cust).perform();
		Thread.sleep(3000);	
		

		
	}

}
