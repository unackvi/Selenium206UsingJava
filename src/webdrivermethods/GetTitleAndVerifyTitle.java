package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndVerifyTitle {

	public static void main(String[] args) {
		// set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cnn.com");
		String actualTitle = driver.getTitle();
		String expectedTitle = "CNN - Breaking News, Latest News and Videos";
		String answer = actualTitle.equalsIgnoreCase(expectedTitle)?"Titles match":"Titles do not match";
		System.out.println(answer);

	}
}
