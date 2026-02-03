package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Easmytrip {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions() ;
		opt.addArguments("--disable-notifications") ;
		ChromeDriver driver =  new ChromeDriver(opt) ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://www.easemytrip.com/");
		
		driver.findElement(By.xpath("//input[@class='input_cld']")).click() ;
		Thread.sleep(3000) ;
		driver.findElement(By.linkText("28")).click();
		Thread.sleep(3000) ;

		driver.findElement(By.xpath("//input[@class='input_cld hide-ddate round-but1']")).click() ;
		Thread.sleep(500) ;
		driver.findElement(By.linkText("14")).click() ;
		Thread.sleep(3000) ;

	}
}

