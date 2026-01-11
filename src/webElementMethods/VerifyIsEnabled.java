package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyIsEnabled {

	static ChromeDriver driver = new ChromeDriver() ; 
	
	public static void main(String[] args) throws Exception {

		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000) ;
		
		WebElement register = driver.findElement(By.className("ico-register")) ;
		
		if (register.isEnabled()) {
			System.out.println("Register element is enabled");
			register.click() ;
		} else {
			driver.close() ;
			throw new Exception("Register element is disabled");
		}
		driver.close() ;
		
	}
}
