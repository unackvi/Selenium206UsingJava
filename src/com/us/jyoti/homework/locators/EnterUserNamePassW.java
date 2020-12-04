package com.us.jyoti.homework.locators;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterUserNamePassW {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().deleteAllCookies();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// locate the webElement called username
		WebElement webElmntUserName = driver.findElement(By.id("username"));
		// enter the data in the field
		webElmntUserName.sendKeys("admin");

		// locate the webElement called password & enter the data in the field
		driver.findElement(By.name("pwd")).sendKeys("manager");

		// click checkbox
		driver.findElement(By.id("keepLoggedInLabel")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// click login
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("keepLoggedInLabel")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Verify the title of the homePage
		System.out.println(driver.getTitle());
		String answer = (driver.getTitle()).equalsIgnoreCase("actiTIME - Login") ? "The title matches"
				: "The titles do not match";
		System.out.println(answer);

	}

}
