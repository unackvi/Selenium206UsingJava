package com.jyoti.homework.handlingframes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AptivoHandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		// Couldn't do it for https://www.apptivo.com/lp/crm

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("http://demo.guru99.com/test/guru99home/");
//		//driver.manage().timeouts().implicitlyWait(arg0, arg1);
//		driver.manage().window().maximize();
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,'ytp-large-play-button ytp-button')]")));
//		Thread.sleep(5000);
//		driver.switchTo().frame(1);
//		driver.findElement(By.xpath("//div[@class='ytp-cued-thumbnail-overlay-image']"));
//	//	driver.switchTo().frame("");
//	//	driver.findElement(By.xpath("")).click();
		
		driver.get("https://www.apptivo.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='roko-instabot-widget']")).click();
		// small child frame
		driver.switchTo().frame("widget-window");
		//driver.findElement(By.xpath("(//div[@class='avatar-container'])[2]"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='Ask a question']")).click();
		// trying to click an element now on parent ends up in exception if uncommented
		//driver.findElement(By.xpath("(//a[contains(text(), 'Contact Us')])")).click();
		
		// switch to parent frame now
		driver.switchTo().parentFrame();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(), 'Contact Us')]"));
		js.executeScript("arguments[0].click()", ele);
		
		
}

}
