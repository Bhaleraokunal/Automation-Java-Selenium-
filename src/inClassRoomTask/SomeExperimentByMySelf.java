package inClassRoomTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SomeExperimentByMySelf {

	public static void main(String[] args) throws InterruptedException{
		
	ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demoapps.qspiders.com/");
		
		Actions act = new Actions(driver) ; 
		
		Thread.sleep(1000) ;
		
		driver.findElement(By.xpath("//a[@class='block w-[100%] h-full']")).click() ;
		Thread.sleep(3000) ;
		
		  List<WebElement> sideNavBar = driver.findElements(By.xpath("//section[contains(@class,'poppins')]")) ;
		  
		  System.out.println(sideNavBar.size());
//		  
//		  for (int i = 0; i < sideNavBar.size(); i++) {
//			
//			  if (i==7) {
//				
//				  act.click(sideNavBar.get(i)).perform() ;
//				  break ;
//			}
//		}
		  
	}
	
}
