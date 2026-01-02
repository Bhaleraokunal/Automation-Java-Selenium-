package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnRegister {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("	https://demowebshop.tricentis.com/"); 
		
		Thread.sleep(4000) ;
		
		WebElement registerClick = driver.findElement(By.className("ico-register")) ;
		
		registerClick.click() ;
		
		Thread.sleep(4000) ;
		
		driver.close();
	}
}
