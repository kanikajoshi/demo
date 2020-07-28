package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();//to click on ok button
		
		/*alert.dismiss();
		to click on dismiss button 
		*/
	}

}
