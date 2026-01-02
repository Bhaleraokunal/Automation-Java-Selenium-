package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginShoppingCartWhishlist {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement login = driver.findElement(By.className("ico-login")) ;
		
		Thread.sleep(3000);
		
		login.click() ;
		
		WebElement shoppingCart = driver.findElement(By.className("cart-label")) ;
		
		shoppingCart.click() ;
		
		Thread.sleep(3000) ;
		
		WebElement wishList = driver.findElement(By.className("cart-label")) ;
		
		wishList.click() ;
		
		Thread.sleep(3000) ;
		
		driver.close() ;
	}
}
