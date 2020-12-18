package com.jyoti.homework.handlingpopups;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipCartHiddenDivPopUp {

	public static void main(String[] args) {
		// 11-12-20_3.png Assignment
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		// move to Element HomeAndFurniture
		Actions act = new Actions(driver);
		//WebElement home = driver.findElement(By.xpath("//div[@class = 'xtXmba'][contains(text(), 'Home')]"));
		WebElement home = driver.findElement(By.xpath("//span[contains(text(), 'Home & Furniture')]"));
		act.moveToElement(home).perform();
		
		// Important Point Below
		
		// how do we click on an option in this pop-up e.g. Gas Stove?
		// right click on element like Gas Stove->Selectors Hub->Copy XPath-> Paste in Ctrl+f (developer's toolbar)
		// to see the element highlighted, Mouse Over Home&Furnoture and Press enter to see
		// the element in HiddenDivision Popup to get highlighted
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Gas Stoves']")));
		WebElement gasStove = driver.findElement(By.xpath("//a[normalize-space()='Gas Stoves']"));
		act.moveToElement(gasStove).click(gasStove).perform();
		
		driver.close();

	}

}
