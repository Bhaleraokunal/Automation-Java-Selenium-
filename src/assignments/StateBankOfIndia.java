package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class StateBankOfIndia {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://sbi.bank.in/"); 
		
		try {
			Thread.sleep(9000) ;
		} catch (InterruptedException e) {
			e.printStackTrace() ;
		}
		
		driver.close() ;
	}
}


