package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class session2 {
public static void main(String[] args) {
	
	//1.to launch firefox driver 
	System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	//enter the url
	driver.get("https://www.google.com/");
	
	String Title = driver.getTitle();
	System.out.println(Title);
	
	String t1 = driver.getCurrentUrl();
	System.out.println(t1);
	
	String t2 = driver.getPageSource();
	System.out.println(t2);
	
	//verification point
		
	if(Title.equals("Google")) {
		System.out.println("correct page");
		
	}
		else {
		System.out.println("wrong page");
	}
	driver.quit();// to quit the browser
										}
}
