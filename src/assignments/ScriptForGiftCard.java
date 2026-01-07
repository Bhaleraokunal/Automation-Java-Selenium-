package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptForGiftCard {

public static void main(String[] args) throws InterruptedException {
		
		String email = "kunalbhalerao2004@gmail.com" ;
		String pass = "123456" ;
	
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click() ;
		
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys(email)  ;
		
		driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys(pass)  ; 
		
		driver.findElement(By.xpath("//input[@name=\"RememberMe\"]")).click()  ;
		
		driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click()  ;
		
		driver.findElement(By.xpath("//input[@class=\"button-2 product-box-add-to-cart-button\"]")).click() ;
		
		Thread.sleep(3000) ;

		driver.findElement(By.xpath("//input[@id='giftcard_2_RecipientName']")).sendKeys("Aniket") ;
//		
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys(email) ;
		
		driver.findElement(By.className("message")).sendKeys("Hey, happy birthday ") ;
		
		driver.findElement(By.className("qty-input")).sendKeys("") ;
		
		driver.findElement(By.id("add-to-cart-button-2")).click() ;
		
		Thread.sleep(4000) ;
		
		driver.findElement(By.xpath("//span[@class=\"cart-label\"]")).click() ; 
		
		Thread.sleep(2000) ;
		
		driver.findElement(By.name("removefromcart")).click() ;
		
		Thread.sleep(2000) ;

		
		driver.findElement(By.xpath("//input[@value=\"Update shopping cart\"]")).click() ;
		
		driver.findElement(By.className("ico-logout")).click() ;
		
		driver.close() ;
	}
}
