package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		//driver.close();
		driver.quit();
	}

}
