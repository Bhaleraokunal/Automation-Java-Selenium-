package webdriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAllTheLinkOfHeader {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com");
		
		List<WebElement> web = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		
		for (WebElement webElement : web) {
			
			webElement.click() ;
			driver.navigate().back() ;
			Thread.sleep(1000) ;
		}
		
		Thread.sleep(1000) ;

		driver.close() ;
	}
}
