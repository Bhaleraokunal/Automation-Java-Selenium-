package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptForBuildYourOwnCheapComputer  {

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
		
		WebElement loginButt = driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]"))  ;
		
		loginButt.click() ;
		
		driver.findElement(By.xpath("//input[@onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/72/1/1    ');return false;\"]")).click() ;
		
		Thread.sleep(3000) ;
		
		driver.findElement(By.id("product_attribute_72_5_18_65")).click() ;
		
		driver.findElement(By.id("product_attribute_72_6_19_55")).click();
		
		driver.findElement(By.id("product_attribute_72_3_20_58")).click() ;
		
		driver.findElement(By.id("product_attribute_72_8_30_93")).click() ;
		driver.findElement(By.id("product_attribute_72_8_30_94")).click() ;
		driver.findElement(By.id("product_attribute_72_8_30_95")).click() ;
		
		driver.findElement(By.id("addtocart_72_EnteredQuantity")).sendKeys("3") ;
		
		driver.findElement(By.id("add-to-cart-button-72")).click() ;
		
		Thread.sleep(3000) ;
		
		driver.findElement(By.xpath("//a[@href=\"/cart\"]")).click() ; 
		
		driver.findElement(By.name("removefromcart")).click() ;
		
		driver.findElement(By.xpath("//input[@value=\"Update shopping cart\"]")).click() ;
		
		driver.findElement(By.xpath("//a[@class=\"ico-logout\"]")).click() ;
		
		Thread.sleep(2000) ;
		driver.close() ;
	}
}
