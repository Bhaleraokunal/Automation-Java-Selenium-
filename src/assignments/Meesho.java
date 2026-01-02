package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Meesho {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://www.meesho.com/");
		
		try {
			Thread.sleep(6000) ;
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		driver.close() ;
	}
}
