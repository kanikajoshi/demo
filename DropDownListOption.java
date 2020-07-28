package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListOption {

	public static void main(String[] args) throws InterruptedException {
		//to get the driver location 
				System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
				
				//to launch the web Browser
				WebDriver driver = new ChromeDriver();
				
				//to get the url 
				driver.get("https://www.ebay.ca/");
				
				
				//to set the windows property 
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				
		        //to locate the drop down
				Select select = new Select(driver.findElement(By.xpath("//select[@aria-label='Select a category for search']")));
				
				//to select the particular option from the drop down menu
				select.selectByVisibleText("Baby");
				Thread.sleep(3000);
	
				List<WebElement> option = driver.findElements(By.xpath("//select[@aria-label='Select a category for search']/option"));
				
				
				//to print the size as well the suggestions
				 for(int i = 0;i<option.size();i++) {
					
					System.out.println(i+"."+option.get(i).getText());
				
					if(option.get(i).isSelected()==true)
					{
						System.out.println(option.get(i).getText()+"is present");
						break;
					}
				 
				 }
				
				driver.quit();
	}

}
