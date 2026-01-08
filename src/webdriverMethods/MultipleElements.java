package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class MultipleElements {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
		Thread.sleep(2000) ;
		
		// List<WebElement> poll =	driver.findElements(By.name("pollanswers-1")) ; ----> First way {Using Common Attribute}
		
		List<WebElement> poll =	driver.findElements(By.xpath("//ul[@class='poll-options']/li/input")) ; //----> Second Way{Traversing from parent to child elements}
		
		for (WebElement web : poll) {
			web.click() ;
		}
		
		Thread.sleep(2000) ;
		
		driver.close() ;
	}
}
