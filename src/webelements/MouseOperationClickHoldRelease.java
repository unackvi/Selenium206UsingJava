package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperationClickHoldRelease {
	/* ********************************************************************************** */
	/* replaced thread.sleep with ImplicitlyWait as there are only calls to findElement() */
	/* some of the Thread.sleep are left in there becuase those were to force a wait to be
	 * able to see the changes being made by keyboard actions - not for the webElement to 
	 * load.
	/* ********************************************************************************** */
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		Thread.sleep(3000);
		
		WebElement bestSellers = driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']"));
		Actions clkNHold = new Actions(driver);
		clkNHold.clickAndHold(bestSellers).perform();
//		Thread.sleep(3000);	
		clkNHold.release().perform();
	}

}
