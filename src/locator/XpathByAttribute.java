package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com/"); 
		
		//By using the xPath By Attibute.
		//driver.findElement(By.xpath("//span[@class='cart-label']")).click() ;
		
		
		driver.findElement(By.xpath("(//span[@class='cart-label'])[2]")).click() ;
		
		WebElement communityPoll = driver.findElement(By.xpath("//strong[text()='Community poll']")) ;
		
		System.out.println(communityPoll.getText());
		driver.close() ;
	}
}
