package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QSDDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize(); 
		driver.get("https://demoapps.qspiders.com/");
		
		Actions act = new Actions(driver) ; 
		Thread.sleep(1000) ;
		driver.findElement(By.xpath("//a[@class='block w-[100%] h-full']")).click() ;
		Thread.sleep(3000) ;
		driver.findElement(By.xpath("(//section[@class='poppins text-[15px]'])[8]")).click() ;
		
		Thread.sleep(2000) ;
		WebElement dragAndDrop = driver.findElement(By.xpath("//li[@class='no-use relative hover:bg-orange-50']")) ;
		dragAndDrop.click() ;
		Thread.sleep(2000) ;
		WebElement dragMe = driver.findElement(By.xpath("//div[text()='Drag Me']")) ;
		Thread.sleep(1500) ;
		
		act.dragAndDropBy(dragMe, 350,140 ).perform() ;
		Thread.sleep(1000) ;
		driver.quit() ;
	}
}
