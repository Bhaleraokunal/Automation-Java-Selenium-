package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByTitle {

	public static void main(String[] args) throws InterruptedException {
		
		String expected_Title = "Demo Web Shop" ;
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		String atucal_Ttile = driver.getTitle() ;
		
		if (expected_Title.equals(atucal_Ttile)) {
			System.out.println("i am in dws homepage and TestCase is pass");
		}
		else {
			System.out.println("i am not in dws homepage and TestCase is faied");
		}
		
		Thread.sleep(2000) ;
	}
}
