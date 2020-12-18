package com.jyoti.homework.handlingpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeTypeOfWorkAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// 11-12-20_2.png Assignment
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[contains(@id,'login')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='menu_icon'])[2]")));
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		WebElement y = driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]"));
		js.executeScript("arguments[0].click()", y);
		WebElement x = driver.findElement(By.xpath("//a[contains(text(),'Types of Work')]"));
		js.executeScript("arguments[0].click()", x);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Create Type of Work')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Create Type of Work')]")).click();
		
		driver.findElement(By.id("name")).sendKeys("Abc");
		driver.findElement(By.xpath("//input[@onclick='handleCancel();']")).click();
		// handle cancel (AlertConfirmation) popup
		Alert okAlert = driver.switchTo().alert();
		// just adding forced wait to see the popup before getting canceled
		Thread.sleep(3000);
		okAlert.accept();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Create Type of Work')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Create Type of Work')]")).click();
		
		driver.findElement(By.id("name")).sendKeys("Abc");
		driver.findElement(By.xpath("//input[@onclick='handleCancel();']")).click();
		// handle cancel (AlertConfirmation) popup
		Alert cancelAlert = driver.switchTo().alert();
		// just adding forced wait to see the popup before getting canceled
		Thread.sleep(3000);
		cancelAlert.dismiss();
		
		//Click on the Settings again->Type of Work
		WebElement z = driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]"));
		js.executeScript("arguments[0].click()", z);

		WebElement tyepeOfWork = driver.findElement(By.xpath("//a[contains(text(),'Types of Work')]"));
		js.executeScript("arguments[0].click()", tyepeOfWork);
		// another HiddenDiv Popup comes up that can be inspected
		driver.findElement(By.xpath("//input[@onclick = 'remainOnThePage();']")).click();;
		
		driver.close();
	}

}
