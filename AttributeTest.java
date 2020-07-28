package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeTest {

	public static void main(String[] args) {
		
		//to launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//to enter the url 
		driver.get("https://www.ebay.ca/");
		System.out.println(driver.findElement(By.xpath("//input[@id='gh-ac']")).getAttribute("label"));
		
		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("iphone");
		System.out.println(driver.findElement(By.xpath("//input[@id='gh-ac']")).getAttribute("value"));
		
		driver.quit();

	}

}
