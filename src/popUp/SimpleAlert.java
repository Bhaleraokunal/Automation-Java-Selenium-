package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click() ;
		
		//driver.switchTo().alert().accept() ;
		
		 Alert alert = driver.switchTo().alert() ;
		 System.out.println(alert.getText());
		alert.accept() ;
		
		
		driver.findElement(By.className("ico-login")).click() ;
		
		Thread.sleep(2000 );
		
		driver.close() ;
		
		
	}
}
