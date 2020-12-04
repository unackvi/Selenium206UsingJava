package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CloseEdgeBrowser {

	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Selenium206\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.close();

	}

}
