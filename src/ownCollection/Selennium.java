package ownCollection;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selennium {

	 static ChromeDriver driver = new ChromeDriver() ;
	
	public static void main(String[] args) {
		
		String expected_Url = "https://demowebshop.tricentis.com/";
		
		driver.manage().window().maximize(); 
		
		driver.get("https://github.com/Bhaleraokunal");
		
		if (isExpectedPage(expected_Url)) {
			System.out.println("Test case is passed");
		}
		else {
			System.out.println("Test case is failed");
		}
	}
	
	public static boolean isExpectedPage(String url) {
		
		return url.equals(driver.getCurrentUrl()) ;
	}
	
}
