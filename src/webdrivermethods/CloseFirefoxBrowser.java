package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseFirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium206\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.close();

	}

}
