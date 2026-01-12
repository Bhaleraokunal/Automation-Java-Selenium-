package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibilityOfElement {

	static ChromeDriver driver = new ChromeDriver() ; 
	
	public static void main(String[] args) throws Exception {

		driver.manage().window().maximize(); 
		
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(2000) ;
		
		 WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']")) ;
		 
		 //driver.findElement(By.className("dropbtn")).click() ;
		 
		 Thread.sleep(4000) ;
		 
		 if (facebook.isDisplayed()) {
			System.out.println("Facebook Element is displayed");
		} else {
			driver.close() ;
			throw new Exception("Facebook element is not displayed and test case is failed") ;
		}
		
		 driver.close() ;
	}

}
