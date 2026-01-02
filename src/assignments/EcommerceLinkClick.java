package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class EcommerceLinkClick {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		 
		 driver.manage().window().maximize(); 
		 
		 driver.get("https://demowebshop.tricentis.com/"); 
		 
		 Thread.sleep(3000);
		 
		
		 Thread.sleep(100) ;
		 
		 driver.findElement(By.linkText("Twitter")).click() ;
		 
		 Thread.sleep(100) ;

		 
		 driver.findElement(By.linkText("Facebook")).click();
		 
		
		 driver.findElement(By.linkText("RSS")).click();
		 
		 driver.navigate().back();
		 //driver.get("https://demowebshop.tricentis.com/"); 
		 
		 driver.findElement(By.linkText("YouTube")).click() ;
		 
		 Thread.sleep(100) ;

		 
		 driver.findElement(By.linkText("Google+")).click();
		 
		 Thread.sleep(100) ;

		 
		 
		 Thread.sleep(100) ;
		 
		 driver.close() ;
	}
}
