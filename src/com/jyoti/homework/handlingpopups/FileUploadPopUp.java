package com.jyoti.homework.handlingpopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// 15-12-20.png
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium206\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.freshersworld.com/user/register?src=homeheader");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// for Firefox, the click on the Browse button is not working so need to pass the file in sendKeys directly
		driver.findElement(By.xpath("//input[@onchange='return fileValidation()']")).sendKeys("C:\\Users\\13175\\Downloads\\Uzma Shah Resume (4).pdf");
		// control is automatically on the fileUpload popup
		
		// for chrome following should work
		
		//save the file path locally here
//		StringSelection fileName = new StringSelection("C:\\Users\\13175\\Downloads\\20-21 Student Entry Form_TXPTA.pdf");
//		// copy this file to be pasted to the upload popup -- 2nd param can be null
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileName, null);
//		Robot r = new Robot();
//		Thread.sleep(3000);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		// tab 4 times as checked from the popup on the website to get to 'Open' button
//		for(int i=0;i<4;i++) {
//			r.keyPress(KeyEvent.VK_TAB);			
//		}
//		r.keyPress(KeyEvent.VK_ENTER);
//		
//		r.keyRelease(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_ENTER);
//
//		

	}

}
