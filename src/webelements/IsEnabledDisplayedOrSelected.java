package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledDisplayedOrSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();

		// check if the checkbox is enabled, displayed on the webpage and if checked/selected
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println("checkbox is enabled: "+checkbox.isEnabled());
		System.out.println("checkbox is displayed: "+checkbox.isDisplayed());
		System.out.println("checkbox is selected: "+checkbox.isSelected());
		// setting checkbox to checked state and then testing if selected?
		checkbox.click();
		System.out.println("checkbox is now selected: "+checkbox.isSelected());	
		Thread.sleep(3000);
		

	}

}
