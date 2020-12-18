package com.jyoti.homework.handlingpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLeavesTypeAlertPopUp {

	public static void main(String[] args) {
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
		WebElement settingIcon = driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]"));
		js.executeScript("arguments[0].click()", settingIcon);
		
		wait.until(ExpectedConditions.textToBe(By.xpath("//a[contains(text(),'Types of Work')]"), "Types of Work"));
		WebElement typeOfWork = driver.findElement(By.xpath("//a[contains(text(),'Types of Work')]"));
		js.executeScript("arguments[0].click()", typeOfWork);
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[contains(text(),'Create Type of Work')]"), "Create Type of Work"));
		driver.findElement((By.xpath(("//span[contains(text(),'Create Type of Work')]")))).click();
		
		driver.findElement(By.xpath("//input[@onchange = 'nameChanged(this);']")).sendKeys("Uzma");
		WebElement createButton = driver.findElement(By.xpath("//input[@value='   Create Type of Work   ']"));
		js.executeScript("arguments[0].click()", createButton);
		driver.findElement(By.xpath("//*[@id='billingTypesTable']/tbody/tr[13]/td[7]/a")).click();
		Alert okButton = driver.switchTo().alert();
		okButton.accept();
		
		driver.close();
	}

}
