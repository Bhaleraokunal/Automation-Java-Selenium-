package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextLocator {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		 
		 driver.manage().window().maximize(); 
		 
		 driver.get("https://demowebshop.tricentis.com/"); 
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.name("q")).sendKeys("toy") ;
		 
		 Thread.sleep(3000) ;
		 
		 //LinkText
		// driver.findElement(By.linkText("Shopping cart")).click() ;
		 
		 //Partical LinkText 
		 driver.findElement(By.partialLinkText("Shopping")).click();
		 Thread.sleep(3000) ;
		 
		 driver.close() ;
	}
}
