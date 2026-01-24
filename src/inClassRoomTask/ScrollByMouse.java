package inClassRoomTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByMouse {

public static void main(String[] args) throws InterruptedException{
		
		ChromeDriver driver = new ChromeDriver()  ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demo.automationtesting.in/Static.html");
		
		Thread.sleep(2000) ;
		
		WebElement seleniumSybol = driver.findElement(By.xpath("//img[@id='node']")) ;
		
		Actions act = new Actions(driver) ;
		
		act.scrollToElement(seleniumSybol).perform() ;
	}
}
