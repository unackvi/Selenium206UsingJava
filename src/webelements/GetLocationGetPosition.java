package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationGetPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		// GetPosition
		WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		System.out.println("Size/Dimensions: "+logo.getSize());
		// GetLocation
		WebElement username = driver.findElement(By.id("email"));
		System.out.println("Location: "+username.getLocation());		
		
		driver.close();
	}

}
