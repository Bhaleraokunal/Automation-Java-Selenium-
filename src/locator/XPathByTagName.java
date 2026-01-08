package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByTagName {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com"); 
		
		driver.findElement(By.xpath("//input")).sendKeys("Ram") ;
		
		driver.findElement(By.xpath("(//input)[2]")).click() ;
		
		driver.close() ;
	}
}
