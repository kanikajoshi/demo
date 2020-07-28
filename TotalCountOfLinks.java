package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalCountOfLinks {

	public static void main(String[] args) {
		//to get the driver location 
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		
		//to launch the web Browser
		WebDriver driver = new ChromeDriver();
		
		//to set the windows property 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//to get the url 
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		

		List<WebElement> find = driver.findElements(By.linkText("Fashion"));
		
		if(find.size()>0) {
			System.out.println("element is present");
			System.out.println(find.size());
		}
		else
		{
			System.out.println("there is no element ");
		}
		driver.quit();
	}

}
