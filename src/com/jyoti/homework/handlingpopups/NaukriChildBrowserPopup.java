package com.jyoti.homework.handlingpopups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaukriChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		// 12-12-2-1.png
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.titleContains("Jobs - Recruitment "));

		Set<String> s = driver.getWindowHandles();
		System.out.println("Number of Popup windows including main webpage that opened (parent + children): " + s.size());

		String popUp1Title="";
		ArrayList<String> al = new ArrayList<>(s);
		for (int i = 0; i < al.size(); i++) {
			driver.switchTo().window(al.get(i));
			System.out.println("Window Title is:" + driver.getTitle());
			System.out.println("Window Handle is:" + driver.getWindowHandle());
			if (driver.getTitle().contains("HSBC")) {
				popUp1Title = driver.getTitle();
				break; 
			}
		}
		String hsbcPopup1Handle = driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@src='https://company.naukri.com/popups/hsbc/3172020/hsbc-ns-250x250-2972020.gif']")).click();
		Thread.sleep(3000);
		
		s.clear();
		al.clear();
		s = driver.getWindowHandles();
		System.out.println("Number of Popup windows including parent (parent + children): " + s.size());
		
		al.addAll(s);
		driver.switchTo().window(al.get(4));
		String hsbcPopup2Handle = driver.getWindowHandle();

		System.out.println("Window Handle now is:" + hsbcPopup2Handle);	
		System.out.println("Window Title now is:" + driver.getTitle());


		String popUpWindow2Title = driver.getTitle();

		if(popUpWindow2Title.equals(popUp1Title)) {
			System.out.println("The two titles are equal");
		}
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//a[contains(text(), 'Know More')]")).click();	
		s.clear();
		al.clear();
		s = driver.getWindowHandles();
		System.out.println("Number of Popup windows including parent (parent + children): " + s.size());
		
		al.addAll(s);
		driver.switchTo().window(al.get(al.size()-1));
		wait.until(ExpectedConditions.titleIs("Careers in India | HSBC Holdings plc"));
	
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[contains(text(), 'Accept all cookies')]")).click();
		
		s.clear();
		al.clear();
		System.out.println("Set and Array sizes cleared out: " + s.size() + " " + al.size());
		s = driver.getWindowHandles();
		System.out.println("Number of Popup windows including parent (parent + children): " + s.size());
		
		al.addAll(s);
		driver.switchTo().window(al.get(al.size()-1));
		driver.findElement(By.xpath("(//span[@class='hsbc-close'])[3]")).click();
		
		s.clear();
		al.clear();
		s = driver.getWindowHandles();
		al.addAll(s);
		for (int i = 0; i < al.size(); i++) {
			if (driver.getTitle().contains("Careers in India")) {
				driver.switchTo().window(al.get(i));
				popUp1Title = driver.getTitle();
				System.out.println("Window Title is:" + popUp1Title);
				System.out.println("Window Handle is:" + driver.getWindowHandle());	
				break; 
			}
		}
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement savedContact = driver.findElement(By.xpath("(//a[contains(text(), 'Contact')])[2]"));
		js.executeScript("arguments[0].click()", savedContact);

		s.clear();
		al.clear();
		s = driver.getWindowHandles();
		al.addAll(s);
		for (int i = 0; i < al.size(); i++) {
			driver.switchTo().window(al.get(i));
			if (driver.getTitle().contains("Contact Us")) {
				popUp1Title = driver.getTitle();
				System.out.println("Window Title is:" + popUp1Title);
				System.out.println("Window Handle is:" + driver.getWindowHandle());	
				break; 
			}
		}
		Thread.sleep(3000);
		WebElement mobileNum = driver.findElement(By.xpath("//strong[@class='ltGrC'][contains(text(), '91-98188')]"));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[@class='ltGrC'][contains(text(), '91-98188')]")));
		System.out.println("MobileNumber for Sales Enquires India: "+mobileNum.getText());
		
		// process of closing all popups, child browsers and then lastly the parent
		for (int i = al.size()-1; i >= 0; i--) {
			driver.switchTo().window(al.get(i));
			popUp1Title = driver.getTitle();
			System.out.println("Closing Window Titled as:" + popUp1Title);
			driver.close();
			Thread.sleep(3000);
		}

}

}
