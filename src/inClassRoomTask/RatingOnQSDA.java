package inClassRoomTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RatingOnQSDA {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		
		Actions act = new Actions(driver) ; 
		
		Thread.sleep(1000) ;
		
		driver.findElement(By.xpath("//a[@class='block w-[100%] h-full']")).click() ;
		Thread.sleep(1000) ;

		
		driver.findElement(By.xpath("(//section[@class='poppins text-[15px]'])[8]")).click() ;
		Thread.sleep(1000) ;

		
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[2]")).click() ;
		Thread.sleep(1000) ;

		
		driver.findElement(By.linkText("Ratings")).click() ;
		Thread.sleep(1000) ;

		
		WebElement rating = driver.findElement(By.xpath("//div[@class='flex justify-center pt-2']")) ;
		Thread.sleep(1000) ;

		act.contextClick(rating).perform() ;
	}
}
