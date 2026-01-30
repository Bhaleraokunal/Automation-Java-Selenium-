package popUp;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DismissAndSendKey {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
//		 List<WebElement> submenu = driver.findElements(By.xpath("//ul[@class='nav nav-tabs nav-stacked']//li"));
//		 
//		 for (WebElement webElement : submenu) {
//			 webElement.click() ;
//			 Thread.sleep(2000) ;
//			 
//		}
		
		driver.findElement(By.xpath("(//ul[@class='nav nav-tabs nav-stacked']//li)[1]")).click() ;	
		Thread.sleep(2000) ;
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click() ;
		driver.switchTo().alert().accept() ;
		
		driver.findElement(By.xpath("(//ul[@class='nav nav-tabs nav-stacked']//li)[2]")).click() ;	
		Thread.sleep(2000) ;
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click() ;
		driver.switchTo().alert().dismiss() ;
		
		driver.findElement(By.xpath("(//ul[@class='nav nav-tabs nav-stacked']//li)[3]")).click() ;	
		Thread.sleep(2000) ;
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click() ;
		driver.switchTo().alert().sendKeys("Aniket") ;
		Thread.sleep(2000) ;
		driver.switchTo().alert().accept() ;
		Thread.sleep(2000) ;
		
		driver.close() ;
		}
}
