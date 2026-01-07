package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTextFunction {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();  
		
		driver.get("https://demowebshop.tricentis.com/"); 
		
//		WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']")) ;
//		
//		System.out.println(poll.getText());
//		
		
		driver.findElement(By.xpath("//a[text()='Digital downloads']")).click() ;
		
		driver.close() ;
	}
}
