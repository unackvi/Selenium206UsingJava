package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsLinkAndPartialLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement link = driver.findElement(By.linkText("Forgot Password?"));
		System.out.println(link.getText());
		driver.close();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// use partialLinkText locator
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://www.facebook.com");
		WebElement link1 = driver1.findElement(By.partialLinkText("Forgot"));
		System.out.println(link1.getText());	
		link1.click();
		
		// try and print after the link has been clicked. Exception because the control has moved to 
		// another window and the ref to the variable link1 is no longer the same as on the previous window
		System.out.println(link1.getText());
		// StaleElementException

	}

}
