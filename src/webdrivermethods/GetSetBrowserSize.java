package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetBrowserSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		// create an object of type Dimension
		Dimension d = driver.manage().window().getSize();
		System.out.println(d.height + "  " + d.width);
		Dimension d1 = new Dimension(200, 200);
		driver.manage().window().setSize(d1);

	}

}
