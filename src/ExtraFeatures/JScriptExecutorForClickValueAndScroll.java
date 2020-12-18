package ExtraFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class JScriptExecutorForClickValueAndScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(3000);
		WebElement checkbox = driver.findElement(By.id("persistent"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		// performing a click
		js.executeScript("arguments[0].click()", checkbox);
		Thread.sleep(3000);
		// sending a value
		WebElement username = driver.findElement(By.id("login-username"));
		js.executeScript("arguments[0].value='qspiders'", username);
			
		Thread.sleep(3000);
		//scroll down
		js.executeScript("window.scrollBy(0,1000)");
		//scroll up
		//js.executeScript("window.scrollBy(0,-700)");

	}

}
