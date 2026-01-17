package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AndOperator {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(2000) ;
		
		driver.findElement(By.xpath("//a[text() = 'Men' and @data-group='men']")).click() ;
		
		driver.close() ;
	}
}
