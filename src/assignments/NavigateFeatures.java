package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateFeatures {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(1000) ;
		
		driver.navigate().to("https://www.makemytrip.com/");
		
		Thread.sleep(1000) ;
		
		driver.navigate().back() ;
		
		Thread.sleep(1000) ;
		
		driver.navigate().refresh() ;
		
		Thread.sleep(1000) ;
		
		driver.navigate().forward() ;
		
		Thread.sleep(1500);
		
		driver.close() ;
	}
}
