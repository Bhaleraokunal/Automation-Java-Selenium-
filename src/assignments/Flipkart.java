package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		//Open the browser.
		ChromeDriver driver = new ChromeDriver() ;
		
		//Maximize the Windows
		driver.manage().window().maximize(); 
		
		//Enter to the web page.
		driver.get("https://www.flipkart.com/"); 
		
		//waiting for sec.
		Thread.sleep(2000) ;
		
		//Close the windows.
		driver.close() ;
	}
}
