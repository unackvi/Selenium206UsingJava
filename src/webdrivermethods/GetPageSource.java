package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bbc.com");
		driver.manage().window().maximize();
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);

	}

}
