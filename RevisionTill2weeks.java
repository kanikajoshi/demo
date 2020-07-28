package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class RevisionTill2weeks {

	public static void main(String[] args) throws InterruptedException {
		
		
		//1.To provide the path of the driver
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
		
		//2.To launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//3.To change the windows settings
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//4.To provide the url
		driver.get("https://outlook.live.com/owa/");
		Thread.sleep(9000);
		
		//5.To click on link sign in 
		driver.findElement(By.linkText("Sign in")).click();
		//6.To pause
		Thread.sleep(9000);
	
		//7.To enter the id by locating it
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Diya");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Keys.ENTER);
		
		//8.To pause
		Thread.sleep(3000);
	
		//9.
		driver.findElement(By.xpath("//input[@name= 'passwd']")).sendKeys("pass");
		driver.findElement(By.xpath("//input[@name= 'passwd']")).sendKeys(Keys.ENTER);
		
		//10.
		Thread.sleep(3000);
		
		//11.
		driver.findElement(By.xpath("//div[@id='passwordError']")).sendKeys("ops");
		driver.findElement(By.xpath("//div[@id='passwordError']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		//12.
		String rmsg = driver.findElement(By.xpath("//div[@id='passwordError']")).getText();
		Thread.sleep(3000);
		
		System.out.println(rmsg);
		
		//12.
		
		
		driver.quit();
	
	}

}
