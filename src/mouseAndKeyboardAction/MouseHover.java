package mouseAndKeyboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(3000) ;
		
		Actions act = new Actions(driver) ; 
		
		WebElement gen = driver.findElement(By.xpath("//a[@data-group='genz']")) ;
		
		act.moveToElement(gen).perform() ;
		
		WebElement jeansOfMen = driver.findElement(By.xpath("//a[@data-reactid=\"878\"]")) ;
		
		Thread.sleep(2000) ;
		
		act.click(jeansOfMen).perform() ;
		
		Thread.sleep(2000) ;
		
		driver.close() ;
	
	}
}
