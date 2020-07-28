package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySearchBoxSuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		//to launch the browser
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		
		//to set object for the browser
		WebDriver driver = new ChromeDriver();
		
		//to set the window
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		
		//to get the url
		driver.get("https://www.ebay.ca/");
	
		//to find the elements that appear in the suggestion
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ipod");
		 Thread.sleep(9000);
		 
		 List<WebElement> suggestions = driver.findElements(By.xpath("//div[@id='gAC']/ul/li"));
		 Thread.sleep(9000);
		
		 //to print the size as well the suggestions
		 for(int i = 0;i<suggestions.size();i++) {
			
			System.out.println(i+"."+suggestions.get(i).getText());
			
		}
	
	
		 	driver.quit();
	
	}

}
