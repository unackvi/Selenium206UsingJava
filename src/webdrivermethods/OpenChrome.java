package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {
	public static void main(String[] args) {
		// set path first using .setProperty
		// key(browser and driver): webdriver.chrome.driver
		// value/path: path to the downloaded browser driver locally
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
	}


}
