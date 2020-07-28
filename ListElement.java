package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListElement {

	public static void main(String args[]) throws InterruptedException {
				
				//1.To provide the path of the driver
				System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
				
				//2.To launch the browser
				ChromeDriver driver = new ChromeDriver();
				
				//3.To change the windows settings
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				//4.To set the url
				driver.get("https://www.amazon.ca/");
				
				//5.To pause
				Thread.sleep(3000);
		
				driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
				//6.
				List<WebElement> option = driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));
				Thread.sleep(3000);
				
				//7.
				for (int i = 0 ;i<option.size();i++) {
					System.out.println(option.get(i).getText());
					
				}
				
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Toy");
				
				Thread.sleep(3000);
				
				List<WebElement> option2 = driver.findElements(By.xpath("//div[@id='suggestions']/div"));
				Thread.sleep(3000);
				System.out.println(option2.size());
				
				for (int i = 0 ;i<option2.size();i++) {
					System.out.println(option2.get(i).getText());
					
				}
				driver.quit();
		
	}
}
