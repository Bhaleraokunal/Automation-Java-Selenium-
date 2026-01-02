package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/"); 
		
		try {
			Thread.sleep(5000) ;
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		driver.close() ;
	}
}
