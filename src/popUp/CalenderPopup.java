package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {

	public static void main(String[] args)  throws InterruptedException{
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		Thread.sleep(2000);
		
		//Calendar by textfield
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.id("datepicker2")).sendKeys("05/23/2026") ;
		
		Thread.sleep(3000) ;
		
		driver.findElement(By.className("col-xs-4")).click() ;
		Thread.sleep(3000) ;
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click() ;
	
		
		
	}
}
