package mouseAndKeyboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(3000) ;
		
		Actions act = new Actions(driver) ; 
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]")) ;
		
		act.moveToElement(doubleClick).doubleClick().perform() ;
	}
}
