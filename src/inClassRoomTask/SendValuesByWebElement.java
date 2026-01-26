package inClassRoomTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendValuesByWebElement {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions act = new Actions(driver) ;
		
		WebElement searchField = driver.findElement(By.id("small-searchterms")) ;
		
		act.sendKeys(searchField,"Aniket").perform() ;
}
}
