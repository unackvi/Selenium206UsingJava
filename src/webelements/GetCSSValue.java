package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("email"));

		// google search for a complete css property list
		System.out.println("Font-Size :" + username.getCssValue("font-size"));
		System.out.println("Font :" + username.getCssValue("font-family"));
		System.out.println("Color :" + username.getCssValue("color"));
		System.out.println("background :" + username.getCssValue("background"));
		System.out.println("Order :" + username.getCssValue("order"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}

}
