package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySearchFiled {

static ChromeDriver driver = new ChromeDriver() ; 
	
	public static void main(String[] args) throws Exception {
		String exp_Data ="Processor" ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000) ;
		
		WebElement searchFeild = driver.findElement(By.id("small-searchterms")) ;
		
		//searchFeild.sendKeys(exp_Data) ;
		
		if (!(searchFeild.getAttribute("value").equals(exp_Data))) {
			driver.close() ;
			throw new Exception("Data is not passed");
		} else {
			System.out.println("Data is passed sucessfully ");
		}
		driver.close() ;
	}
}
