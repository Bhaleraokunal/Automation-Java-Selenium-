package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QSDDragAndDropMultiple {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize(); 
		driver.get("https://demoapps.qspiders.com/");
		
		Actions act = new Actions(driver) ; 
		Thread.sleep(1000) ;
		driver.findElement(By.xpath("//a[@class='block w-[100%] h-full']")).click() ;
		Thread.sleep(5000) ;
		driver.findElement(By.xpath("(//section[@class='poppins text-[15px]'])[8]")).click() ;
		
		Thread.sleep(2000) ;
		WebElement dragAndDrop = driver.findElement(By.xpath("//li[@class='no-use relative hover:bg-orange-50']")) ;
		dragAndDrop.click() ;
		Thread.sleep(4000) ;
		
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click() ;
		Thread.sleep(1500);
		WebElement mobileCharger = driver.findElement(By.xpath("//div[@class='draggable-column bg-slate-100 p-2 min-h-[400px]']//div[1]")) ;
		WebElement laptopCharger = driver.findElement(By.xpath("//div[@class='draggable-column bg-slate-100 p-2 min-h-[400px]']//div[2]")) ;
		WebElement mobileCover = driver.findElement(By.xpath("//div[@class='draggable-column bg-slate-100 p-2 min-h-[400px]']//div[3]")) ;
		WebElement laptopCover = driver.findElement(By.xpath("//div[@class='draggable-column bg-slate-100 p-2 min-h-[400px]']//div[4]")) ;
		WebElement mobileAccessories = driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']")) ;
		WebElement laptopAccessories = driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100']")) ;
		
//		act.click(mobileCharger);
//		Thread.sleep(500) ;
//		act.clickAndHold(mobileCover) ;
//		Thread.sleep(500) ;
//		act.release(mobileAccessories).perform() ;
		
		act.keyDown(Keys.CONTROL).click(mobileCharger).click(mobileCover).keyUp(Keys.CONTROL).clickAndHold(mobileCover).moveToElement(mobileAccessories).release().perform();
	
		
		Thread.sleep(5000) ;
		driver.quit() ;
	}
}
