package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlDummyPages {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Selenium Using Java\\TagNameLocator.html");
		driver.findElement(By.tagName("input")).sendKeys("unackvi");
		
	}

}
