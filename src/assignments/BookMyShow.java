package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://in.bookmyshow.com/"); 
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace() ;
		}
		
		driver.close() ;
	}
}
