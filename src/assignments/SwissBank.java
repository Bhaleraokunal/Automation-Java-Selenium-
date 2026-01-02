package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwissBank {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://www.snb.ch/en/"); 
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.close();
	}
}
