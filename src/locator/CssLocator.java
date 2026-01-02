package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000) ;
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Cake") ;
		
		driver.findElement(By.cssSelector("input[value='Search']")).click() ;
		
		driver.close() ;
		
		
	}
}
