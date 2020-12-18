package ExtraFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOutAndToolTips {

	public static void main(String[] args) {
		// 12-16-20 class
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// ToolTip
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])")).click();
		// tooltip saved in title attribute as it's value
		System.out.println(driver.findElement(By.id("birthday-help")).getAttribute("title"));
		
		// PageLoadTimeOut
		try {
			driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
		}
		catch(TimeoutException te) {
			te.printStackTrace();
			driver.close();
		}
		finally {
			driver.close();
		}
		


	}

}
