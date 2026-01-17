package inClassRoomTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

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
		
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[3]")).click() ;
		Thread.sleep(1000) ;
		
		WebElement clickAndHold = driver.findElement(By.id("circle")) ;
		
		act.clickAndHold(clickAndHold).perform() ;
		Thread.sleep(5000) ;
		
		act.release(clickAndHold).perform() ;
		Thread.sleep(2000) ;
		
		driver.quit() ;
}
}
