package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		// copy path from going to FileExplorer, find driver file, Shift->Click->Copy as path, change to \\
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium206\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		

	}

}
