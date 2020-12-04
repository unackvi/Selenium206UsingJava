package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysAndClear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Uzma");
		Thread.sleep(3000);
		username.clear();
		
		// delete/Backspace -- using keyboard operations instead of .clear
		username.sendKeys("Uzma");
		Thread.sleep(3000);
		username.sendKeys(Keys.CONTROL,"a");
		username.sendKeys(Keys.BACK_SPACE);
		username.sendKeys("Uzma Shah");
		
		// copy, paste
		username.sendKeys(Keys.CONTROL, "C");
		Thread.sleep(3000);		
		WebElement passw = driver.findElement(By.id("pass"));
		passw.sendKeys(Keys.CONTROL, "V");
		Thread.sleep(3000);	
		driver.close();
		
	}

}
