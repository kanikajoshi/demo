package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) throws InterruptedException {
	
		//to get the driver location 
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		
		//to launch the web Browser
		WebDriver driver = new ChromeDriver();
		
		//to get the url 
		driver.get("https://www.ebay.ca/");
		
		
		//to set the windows property 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
        //to locate the element
		Select select = new Select(driver.findElement(By.xpath("//select[@aria-label='Select a category for search']")));
		
		//selecting a specific value from the drop down 
		select.selectByVisibleText("Books");
				
		Thread.sleep(3000);
		
		
		
		//to exist the window
		driver.quit();
	
	
	
	}

}
