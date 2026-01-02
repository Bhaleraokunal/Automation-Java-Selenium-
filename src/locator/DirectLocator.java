package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocator {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver() ;
		 
		 driver.manage().window().maximize(); 
		 
		 driver.get("https://demowebshop.tricentis.com/"); 
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.name("q")).sendKeys("toy") ;
		 
		 Thread.sleep(3000) ;
		 
			 driver.close() ;
			 
	}
}
