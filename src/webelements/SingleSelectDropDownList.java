package webelements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDownList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium206\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:\\C:\\Selenium206\\Automation\\HTMLpages\\DropDownList.HTML");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement dropdownlist= driver.findElement(By.xpath("//select[@name='city']"));
		Select sel = new Select(dropdownlist);
		sel.selectByVisibleText("Seattle");
		Thread.sleep(3000);
		sel.selectByValue("DL");
		Thread.sleep(3000);
		// this is a duplicate so the first instance of the duplicate will be selected
		sel.selectByVisibleText("Chicago");
		Thread.sleep(3000);
		// index starts at 0 like arrays and unlike index for webElements when doing findElements (By.id etc.
		sel.selectByIndex(7);
		
		List<WebElement> li = sel.getOptions();
		// printing the whole list options
		System.out.println("Printing List Options");
		for(int i=0; i<li.size(); i++) {
			System.out.println(li.get(i).getText());
		}
		// single select does not allow to de-select Because there must always one choice be selected
		// UnsupportedOperationException 
		sel.deselectByIndex(7);
	}

}
