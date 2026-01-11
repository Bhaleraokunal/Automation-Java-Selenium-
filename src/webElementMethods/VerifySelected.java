package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySelected {

static ChromeDriver driver = new ChromeDriver() ; 
	
	public static void main(String[] args) throws Exception {

		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000) ;
		
		WebElement good = driver.findElement(By.id("pollanswers-2")) ;
		
		//good.click() ;
		
		if (good.isSelected()) {
			System.out.println("Good element is selected");
		} else {
			driver.close() ;
			throw new Exception("Good element is not selected.....") ;
		}
		
		driver.close() ;
	}
}
