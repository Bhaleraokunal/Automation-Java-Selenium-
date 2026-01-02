package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		WebElement searchElement = driver.findElement(By.tagName("input")) ;
		
		searchElement.sendKeys("Processor") ;
		
		Thread.sleep(3000); 
		
		driver.close() ;
	}
}
