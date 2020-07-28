package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.src=ym&.lang=en-CA&.intl=ca&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		
		//to locate the sign up id element and input id
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("test43");
		//to hit enter key
		driver.findElement(By.id("login-signin")).sendKeys(Keys.ENTER);
		//to pause the screen
		Thread.sleep(9000);
		
		//to locate the password element 
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("true");
		//to press the enter key
		driver.findElement(By.id("login-passwd")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		String rmsg = driver.findElement(By.xpath("//p[@class='error-msg']")).getText();
		
		Thread.sleep(3000);
		
		
		//verification point
		String emsg = "Invalid password. Please try again";
		
		
			
		if(rmsg.equals(emsg)) {
		System.out.println("Correct result");	
			
	} 
		
		else{
			
		System.out.println("incorrect check");
		}
		
		driver.quit();
	
	}

}
