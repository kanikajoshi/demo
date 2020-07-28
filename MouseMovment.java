package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://book.spicejet.com/");
		
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.id("Login"))).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Travel Agent Login")).click();
		Thread.sleep(10000);
		
		
		driver.quit();
		
		
		
		
	}

}
