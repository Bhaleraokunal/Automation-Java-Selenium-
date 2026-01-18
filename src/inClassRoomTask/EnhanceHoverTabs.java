package inClassRoomTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnhanceHoverTabs {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demoapps.qspiders.com/");
		
		Actions act = new Actions(driver) ; 
		
		Thread.sleep(1000) ;
		
		driver.findElement(By.xpath("//a[@class='block w-[100%] h-full']")).click() ;
		Thread.sleep(3000) ;

		
		driver.findElement(By.xpath("(//section[@class='poppins text-[15px]'])[8]")).click() ;
		Thread.sleep(3000) ;

		
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[2]")).click() ;
		Thread.sleep(1000) ;
		
		driver.findElement(By.xpath("//a[text()='Tab']")).click() ;
		Thread.sleep(3000) ;
		
		List<WebElement> tabElements = driver.findElements(By.xpath("//div[@class='bg-slate-800 h-10']//ul/li")) ;
		
		for (WebElement webElement : tabElements) {
			
			act.moveToElement(webElement).perform() ;
		}
		
		driver.quit() ;
	}
}
