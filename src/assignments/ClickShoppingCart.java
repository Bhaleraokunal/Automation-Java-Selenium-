package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilityClass.BaseClass;

public final class ClickShoppingCart extends BaseClass{

	public static void main(String[] args) throws InterruptedException{
		
		preCondition(); 
		login(); 
		WebElement shoppringCart = driver.findElement(By.className("cart-label")) ;
		shoppringCart.click(); 
		postConditon();
	}
}
