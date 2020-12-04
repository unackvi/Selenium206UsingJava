package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterURLNavigateAndGetTitle {

	public static void main(String[] args) {
		//System.getProperty("webdriver.chrome.driver",  "C:\\Selenium206\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com");
		driver.navigate().to("https://www.cnn.com");
		String cnn = driver.getTitle();
		System.out.println(cnn);
		driver.navigate().to("https://www.flipkart.com");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		String fk = driver.getTitle();
		System.out.println(fk);
		
		
	}

}
