package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsXPath {

	public static void main(String[] args) {
		// XPath by Attribute
		// XPath by Attribute using Group Index
		// XPath by Multiple Attributes
		// XPath by Text
	
		//Xpath by text
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		//Xpath by Attribute using Group Index
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("trainee");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("trainee");

		// didn't work? Exception
		//xpath by attribute
		//driver.findElement(By.xpath("//div[@xpath='1']")).click();
		// XPath by Text
		driver.findElement(By.xpath("//div[text()= 'Login ']")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
		
		// Facebook
		// click on forgotten password link using xpath by Text
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com");
		driver1.manage().window().maximize();
		driver1.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// click on Search button using XPath by Multiple Attributes
		driver1.findElement(By.xpath("//input[@type='submit'][@value='Search']")).click();
		driver1.navigate().back();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver1.findElement(By.xpath("//a[.='Create New Account']")).click();
		
		
		// yahoo.com XPath Contains
		
	}

}
