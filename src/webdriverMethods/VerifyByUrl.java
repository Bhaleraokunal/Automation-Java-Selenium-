package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByUrl {

	public static void main(String[] args) throws InterruptedException {
		
		String expected_Url = "https://demowebshop.tricentis.com/" ;
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		String atucal_Url = driver.getCurrentUrl() ;
		
		if (expected_Url.equals(atucal_Url)) {
			System.out.println("i am in dws homepage and TestCase is pass");
		}
		else {
			System.out.println("i am not in dws homepage and TestCase is faied");
		}
		
		Thread.sleep(2000) ;
		
		driver.close() ;
	}
}
