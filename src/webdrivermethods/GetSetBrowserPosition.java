package webdrivermethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetBrowserPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		int xAxis = driver.manage().window().getPosition().getX();
		int yAxis =	driver.manage().window().getPosition().getY();
		// or use this
		Point position = driver.manage().window().getPosition();
		int xPosition = position.x;
		int yPosition = position.y;
		
		// create an object of type Point
		Point p = new Point(30,30);
		driver.manage().window().setPosition(p);

	}

}
