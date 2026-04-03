package inClassRoomTask;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DigitalDownloadClickUsingSelectClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//*[contains(text(),'Digital')]")).click() ;
		
		Select sel = new Select(driver.findElement(By.id("products-orderby"))) ;
		
		int i = 0 ; 
		List<WebElement> options = sel.getOptions() ;
		
		//By Using the Try And Catch Block ;
		
		for (WebElement webElement : options) {
			try {
				Thread.sleep(2000) ;
				sel.selectByIndex(i++);
			} catch (StaleElementReferenceException e) {
				sel = new Select(driver.findElement(By.id("products-orderby")));
			}
		}
		
		
		// By Using the Refferseh Method 
		
//		for (WebElement webElement : options) {
//			sel = new Select(driver.findElement(By.id("products-orderby"))) ;
//			Thread.sleep(500) ;
//			sel.selectByIndex(i++) ;
//		}
		
		
	}
}
