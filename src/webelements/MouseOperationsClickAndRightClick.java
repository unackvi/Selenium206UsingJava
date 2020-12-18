package webelements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperationsClickAndRightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement logo = driver.findElement(By.id("nav-logo"));
		// .click()
		Actions act = new Actions(driver);
		act.click(logo).perform();

//		.contextClick() for Right Click
		WebElement cart = driver.findElement(By.id("nav-cart-count-container"));
		Actions actRight = new Actions(driver);
		actRight.contextClick(cart).perform();
		// USE ROBOT class to access anything that is not part of the webpage for example
		// context menu
		Robot rightClick;
		try {
			rightClick = new Robot();
			// first option on the context menu: open in new tab
			rightClick.keyPress(KeyEvent.VK_DOWN);
			// navigating down one more -- open in new window
	//		rightClick.keyPress(KeyEvent.VK_DOWN);
			rightClick.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			rightClick.keyRelease(KeyEvent.VK_DOWN);
			rightClick.keyRelease(KeyEvent.VK_ENTER);

		} catch (AWTException e) {
			e.printStackTrace();
		}

		driver.quit();


		
//		doubleClick()

//		moveToElement()

	}

}
