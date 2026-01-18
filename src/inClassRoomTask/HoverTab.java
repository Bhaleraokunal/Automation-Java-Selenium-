package inClassRoomTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverTab {

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
		
		WebElement men = driver.findElement(By.xpath("//li[@class='Men p-4 relative']")) ;
		WebElement women = driver.findElement(By.xpath("//li[@class='Women p-4 relative']")) ;
		WebElement kid = driver.findElement(By.xpath("//li[@class='kids p-4 relative']")) ;
		WebElement home = driver.findElement(By.xpath("//li[@class='HomeAndLiving relative']")) ;		
		WebElement beuty = driver.findElement(By.xpath("//li[@class='beauty relative']")) ;
		
		act.moveToElement(men).perform() ;
		Thread.sleep(3000) ;

		act.moveToElement(women).perform() ;
		Thread.sleep(3000) ;

		act.moveToElement(kid).perform() ;
		Thread.sleep(3000) ;

		act.moveToElement(home).perform() ;
		Thread.sleep(3000) ;

		act.moveToElement(beuty).perform() ;
		Thread.sleep(3000) ;

		

	}
}
