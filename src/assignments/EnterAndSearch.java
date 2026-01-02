package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterAndSearch {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement search = driver.findElement(By.className("search-box-text")) ;	
		search.sendKeys("shoes") ;
		
		Thread.sleep(5000) ;
		
		driver.findElement(By.className("button-1")).click() ;
		
		
		Thread.sleep(3000) ;
		
		driver.close() ;
	}
}
