package inClassRoomTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropt {

	public static void main(String[] args) throws InterruptedException{
		
		ChromeDriver driver = new ChromeDriver()  ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demo.automationtesting.in/Static.html");
		
		Thread.sleep(2000) ;
		
		WebElement source = driver.findElement(By.id("angular")) ;
		
		WebElement target = driver.findElement(By.id("droparea")) ;
		
		Actions act = new Actions(driver) ;
		
		//act.dragAndDrop(source, target).perform() ;
		
		//By Using click and hold 
		WebElement seleniumSybol = driver.findElement(By.xpath("//img[@id='node']")) ;
		act.scrollToElement(seleniumSybol) ;
		
		act.clickAndHold(source).release(target).perform() ;

		
		
	}
}
