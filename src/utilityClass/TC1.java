package utilityClass;

import org.openqa.selenium.By;

public class TC1 extends BaseClass{

	public static void main(String[] args)  throws InterruptedException{
		preCondition();
		login();
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Aniket");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		
		logout();
		postConditon();
		
	}
}
