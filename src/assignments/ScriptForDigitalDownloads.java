package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptForDigitalDownloads {

	
	
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
		
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click()  ;
		
		driver.findElement(By.xpath("(//input[@class=\"button-2 product-box-add-to-cart-button\"])")).click()  ; 
		
		Thread.sleep(2000) ;
		
		driver.findElement(By.xpath("//input[@onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/51/1/1    ');return false;\"]")).click() ;
		
		Thread.sleep(2000) ;
		
		driver.findElement(By.xpath("//input[@onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/52/1/1    ');return false;\"]")).click() ; 
		
		Thread.sleep(2000) ;
		
		driver.findElement(By.xpath("//span[@class=\"cart-label\"]")).click() ; 
		
		Thread.sleep(2000) ;
		
			

		driver.findElement(By.xpath("//input[@value=\"6199038\"]")).click() ;
		
		driver.findElement(By.xpath("//input[@value=\"6198730\"]")).click() ;
		
		driver.findElement(By.xpath("//input[@value=\"6198732\"]")).click() ;
				
		driver.findElement(By.xpath("//input[@value=\"Update shopping cart\"]")).click() ;
		
		driver.findElement(By.xpath("//a[@class=\"ico-logout\"]")).click() ;
		
		driver.close() ;
		
	}
		
	}

