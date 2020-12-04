package webdrivermethods;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAllBrowserMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cnn.com");
		driver.getTitle();
		driver.getCurrentUrl();

		driver.getPageSource();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().window().getPosition();
		Point p = new Point(100, 100);
		driver.manage().window().setPosition(p);
		Dimension d = new Dimension(400, 400);
		driver.manage().window().setSize(d);
		driver.navigate().to("https://www.bbc.com");
		driver.manage().window().maximize();
		WebElement wE = driver.findElement(By.id("orb-search-q"));
		if(wE != null) {
			System.out.println("not null");
		}
		
		System.out.println(wE);
		
		
		try {
				WebElement wEByName = driver.findElement(By.name("qs"));
		}
		catch (NoSuchElementException ne) {
			ne.printStackTrace();
			System.out.println("No such element");
		} finally {
			System.out.println("after the exception was handled");	
		}
		
	}

}
