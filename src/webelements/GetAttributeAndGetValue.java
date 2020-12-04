package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeAndGetValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		// getting an attribute named data-testid in the input tag of email i.e. data-testid="royal_email"
		String attrVal = username.getAttribute("data-testid");
		System.out.println(attrVal);
		
		// For an input/text field to get the value/text on the webpage: use "value"
		driver.manage().window().maximize();
		username.sendKeys("Uzma just entered this");
		Thread.sleep(3000);
		System.out.println("The text on the screen in this field is: "+username.getAttribute("value"));

		
		// "href" as arguments in getAttribute is also used to get the url link etc like this:
		WebElement forgotLink = driver.findElement(By.xpath("//a[contains(text(), 'Forgot Password?')]"));
		System.out.println("The url link is: "+forgotLink.getAttribute("href"));
		
		driver.close();
	}

}
