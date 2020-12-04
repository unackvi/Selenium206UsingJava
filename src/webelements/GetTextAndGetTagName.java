package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndGetTagName {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(), 'Create New Account')]")).click();
		Thread.sleep(3000);
		// get tagName	
		WebElement monthDropDwn = driver.findElement(By.id("month"));
		System.out.println("The dropdown tag's name is: "+monthDropDwn.getTagName());
		
		// get text - NOT THE TEXT IN TEXTFIELD BUT WHAT IS IN >...< IN CODE
		String monthFirstText = driver.findElement(By.xpath("//select[@id='month']/option[@value='1']")).getText();
		System.out.println("The dropdown first text on webpage is: "+monthFirstText);
		driver.close();

	}

}
