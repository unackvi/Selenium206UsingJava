package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperationsDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// dragAndDrop()
		// drag Madrid onto Spain
		WebElement source = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement target = driver.findElement(By.xpath("//div[text()='Spain']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
		
		

	}

}
