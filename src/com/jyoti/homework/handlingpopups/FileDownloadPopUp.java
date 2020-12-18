package com.jyoti.homework.handlingpopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileDownloadPopUp {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// 15-12-20.png
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium206\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://filehippo.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onesignal-slidedown-cancel-button")));
		driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Popular software')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Popular software')]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='VLC Media Player 64-bit']")));
		driver.findElement(By.xpath("//span[@title='VLC Media Player 64-bit']")).click();
		
		// control is automatically on the fileUpload popup
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Download Latest Version')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Download Latest Version')]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='icon icon-close icon--medium']")));
		driver.findElement(By.xpath("//div[@class='icon icon-close icon--medium']")).click();
	
		// File Download popup has just opened
		Robot r = new Robot();
		// check on popup where the control is and what keys we need to press to get to
		// 'Save File' or 'Cancel'
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		
//		
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
