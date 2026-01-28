package ownCollection;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExceptions {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//driver.switchTo().alert().accept() ;
		
		NoAlertPresentException np = new NoAlertPresentException() ;
		
		System.out.println(np.getClass());
	}
}
