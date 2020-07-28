package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to launch the firefox 
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		//to enter the url 
		driver.get("https://community.ebay.com/t5/Half-com/bd-p/21000000002");
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("Tom");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Pass");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pass");
		//driver.findElement(By.xpath("//button[@id='sgnBt']")).click();
		
		driver.findElement(By.linkText("create an account"));
		
	
	}

}
