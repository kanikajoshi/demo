package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayElementsInFooter {

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
				
				WebElement box = driver.findElement(By.xpath("//div[@id='hlGlobalFooter']"));
	
				List<WebElement> link = box.findElements(By.tagName("a"));
				
				System.out.println(link.size());
				
	
				
				 Thread.sleep(9000);
				
				 //to print the size as well the suggestions
				 for(int i = 0;i<link.size();i++) {
					
					System.out.println(i+"."+link.get(i).getText());
					
				}
			
				driver.quit();
	}

}
