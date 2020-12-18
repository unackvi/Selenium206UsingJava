package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDropDownList {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:\\C:\\Selenium206\\Automation\\HTMLpages\\DropDownListMultiSelect.HTML");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement multiSDropDownL = driver.findElement(By.xpath("//select[@name = 'city']"));
		Select sel = new Select(multiSDropDownL);
		sel.selectByValue("BO");
		Thread.sleep(3000);
		// if the option is not present in the list, NoSuchElementException occurs
		sel.deselectByValue("PA");
		
		
		
	}

}
