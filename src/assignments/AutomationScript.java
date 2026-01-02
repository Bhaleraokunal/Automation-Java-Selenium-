package assignments;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationScript {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		 
		 driver.manage().window().maximize(); 
		 
		 driver.get("https://demowebshop.tricentis.com/"); 
		 
		 Thread.sleep(3000);
		 
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 for (int i = 0; i < 5; i++) {
			 
			 Random r = new Random() ;
				
				int num = r.nextInt(1000) ;
				
				String emai = "Kunal"+num+"@gmail.com" ;
				
				
			 driver.findElement(By.linkText("Register")).click() ;
			  
			 driver.findElement(By.id("gender-male")).click() ;
			 
			 driver.findElement(By.id("FirstName")).sendKeys("Kunal ") ;
			 
			 driver.findElement(By.id("LastName")).sendKeys("Bhalerao") ;
			 
			 driver.findElement(By.id("Email")).sendKeys(emai) ;
			 
			 driver.findElement(By.id("Password")).sendKeys("123456") ;
			 
			 driver.findElement(By.id("ConfirmPassword")).sendKeys("123456") ;
			 
			 
			 
			 driver.findElement(By.id("register-button")).click();
			 
			 driver.findElement(By.linkText("Log out")).click();
			 
			 driver.findElement(By.linkText("Register")).click() ;
			 
		}
		 Thread.sleep(4000) ;
		 
		 driver.close() ;
	}
	
	 
}
