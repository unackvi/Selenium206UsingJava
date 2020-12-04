package com.us.jyoti.homework.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	private WebDriver setURL(WebDriver driver1, String urlAdrress) {
		driver1.get(urlAdrress);
		return driver1;
	}

	// use .cssLocator unless there isn't a unique one for that field/web element
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
		//driver.findElement(By.cssSelector("a[class='_yb_498uu']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		driver.findElement(By.cssSelector("a[id='createacc']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		driver.findElement(By.cssSelector("input[autocomplete='given-name']")).sendKeys("Test");
		driver.findElement(By.cssSelector("input[autocomplete='family-name']")).sendKeys("User");
		driver.findElement(By.cssSelector("input[autocomplete='username']")).sendKeys("t.user69");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Selenium69_");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("554-554-5545");
		driver.findElement(By.cssSelector("select[name='mm']")).sendKeys("August");
		driver.findElement(By.cssSelector("input[placeholder='Day']")).sendKeys("10");
		driver.findElement(By.cssSelector("input[name='yyyy']")).sendKeys("2000");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		driver.quit();
		
	}

	// use .cssLocator unless there isn't a unique one e.g. for the userName input field here
	protected void orangeHRM() {
		WebDriver driver = new ChromeDriver();
		driver = this.setURL(driver, "https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[autocomplete = 'off']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
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
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("trainee");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("trainee");
		driver.findElement(By.cssSelector("a[class='initial']")).click();
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
		driver.findElement(By.cssSelector("a[rel='async']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.findElement(By.cssSelector("a[rel='async']")).click();
		//driver.findElement(By.id("u_c_9")).click(); //cssSelector("img[class='_8idr img']"));//
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
		//driver.findElement(By.cssSelector("input[id='m_login_email']")).sendKeys("unackvi@hotmail.com");
		driver.findElement(By.linkText("Sign up")).click();	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// NoSuchElementException ?
//		driver.findElement(By.linkText("Log in with Facebook")).click();
		driver.findElement(By.cssSelector("span[class='coreSpriteFacebookIconInverted cneKx']")).click();
			
//		driver.quit();
	}

	protected void appTivoCRM() {
		WebDriver driver = new ChromeDriver();
		driver = this.setURL(driver, "https://www.apptivo.com/answers/login/");
		driver.manage().window().maximize();

		
		//driver.findElement(By.cssSelector("input[ng-model='signupData.firstName']"));
		driver.quit();
	}

	public static void main(String[] args) {

		CssLocator cssLoc = new CssLocator();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
//		cssLoc.yahoo();

//		cssLoc.orangeHRM();
//
//		cssLoc.actiTime();
//
//		cssLoc.faceBook();
//
		cssLoc.instaGram();
//
//		cssLoc.appTivoCRM();

	}

}
