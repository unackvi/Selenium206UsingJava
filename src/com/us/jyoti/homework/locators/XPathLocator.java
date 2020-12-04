package com.us.jyoti.homework.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocator {
	private WebDriver setURL(WebDriver driver1, String urlAdrress) {
		driver1.get(urlAdrress);
		return driver1;
	}

	// use .xPath
	protected void yahoo() {
		WebDriver driver = new ChromeDriver();
		driver = this.setURL(driver, "https://www.yahoo.com");
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[@class='_yb_pf5jl']")).click();
		System.out.println(driver.getTitle());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[@data-ylk='elm:link;elmt:secondary;mKey:login-landing-signup']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@autocomplete='given-name']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@autocomplete='family-name']")).sendKeys("User");
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("t.user69");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Selenium69_");
		driver.findElement(By.xpath("//input[@class='input-with-icon icon-phone phone-no ']")).sendKeys("972-332-3517");
		driver.findElement(By.xpath("//select[@name='mm']")).sendKeys("August");
		driver.findElement(By.xpath("//input[@placeholder='Day']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@placeholder='Year']")).sendKeys("2000");
		driver.findElement(By.xpath("//button[@id='reg-submit-button']")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// trying to click on captcha checkbox
//		String arg1 = "label[@class='rc-anchor-center-item rc-anchor-checkbox-label']";
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click", arg1);
		
		// OR
		//driver.findElement(By.xpath("label[@class='rc-anchor-center-item rc-anchor-checkbox-label']")).click();
		driver.quit();

	}

	// use xPath

	protected void orangeHRM() {
		WebDriver driver = new ChromeDriver();
		driver = this.setURL(driver, "https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("")).sendKeys("admin123");
		driver.findElement(By.xpath("")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();

	}

	protected void actiTime() {
		WebDriver driver = new ChromeDriver();
		driver = this.setURL(driver, "https://demo.actitime.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("")).sendKeys("trainee");
		driver.findElement(By.xpath("")).sendKeys("trainee");
		driver.findElement(By.xpath("")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}

	protected void faceBook() {
		WebDriver driver = new ChromeDriver();
		driver = this.setURL(driver, "https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.navigate().back();
		driver.navigate().forward();

		driver.findElement(By.xpath("")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}

	protected void instaGram() {
		WebDriver driver = new ChromeDriver();
		driver = this.setURL(driver, "https://www.instagram.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("")).click();

//		driver.quit();
	}

	protected void appTivoCRM() {
		WebDriver driver = new ChromeDriver();
		driver = this.setURL(driver, "https://www.apptivo.com/answers/login/");
		driver.manage().window().maximize();

		driver.quit();
	}

	public static void main(String[] args) {

		XPathLocator xLoc = new XPathLocator();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		xLoc.yahoo();

//		cssLoc.orangeHRM();
//
//		cssLoc.actiTime();
//
//		cssLoc.faceBook();
//
//		cssLoc.instaGram();
//
//		cssLoc.appTivoCRM();

	}

}
