package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.ca/");
	
		//to select the down element 
		Select select = new Select(driver.findElement(By.id("gh-cat")));
		select.selectByVisibleText("Books");
	}

}
