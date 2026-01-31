package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TryError {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize(); 
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=3");
		Actions act = new Actions( driver) ;
		
		Thread.sleep(5000);
		WebElement mobileCharger = driver.findElement(By.xpath("//div[@class='draggable-column bg-slate-100 p-2 min-h-[400px]']//div[1]")) ;
		WebElement laptopCharger = driver.findElement(By.xpath("//div[@class='draggable-column bg-slate-100 p-2 min-h-[400px]']//div[2]")) ;
		WebElement mobileCover = driver.findElement(By.xpath("//div[@class='draggable-column bg-slate-100 p-2 min-h-[400px]']//div[3]")) ;
		WebElement laptopCover = driver.findElement(By.xpath("//div[@class='draggable-column bg-slate-100 p-2 min-h-[400px]']//div[4]")) ;
		WebElement mobileAccessories = driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']")) ;
		WebElement laptopAccessories = driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100']")) ;
		
		act.click(mobileCharger).click(mobileCover).clickAndHold().release(mobileAccessories).perform();
		
		driver.quit() ;
	}
}
