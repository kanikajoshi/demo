package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeTest2 {

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
		
		//to find the webelement search bar and input the value computer to it
		driver.findElement(By.xpath("//input[@label = 'Search for anything']")).sendKeys("computer");
		
		//to hold for 9 sec
		Thread.sleep(9000);
		
		//to get the value for the attribute as well as to check the input value
		System.out.println(driver.findElement(By.xpath("//input[@label = 'Search for anything']")).getAttribute("placeholder"));
		System.out.println(driver.findElement(By.xpath("//input[@label = 'Search for anything']")).getAttribute("value"));
		
		//to quit 
		driver.quit();
	
	}

}
