package assignments;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		
		Random num = new Random() ;
		int number = num.nextInt(1000) ;
		String email = "Kunal"+number+"@gmail.com" ;
		String pass = "Kunal12345"  ;
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000) ;
		
		driver.findElement(By.cssSelector("a[class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click() ;
		
		driver.findElement(By.cssSelector("input[name=\"firstname\"]")).sendKeys("Kunal") ; 
		driver.findElement(By.cssSelector("input[name=\"lastname\"]")).sendKeys("Bhalerao") ; 
		driver.findElement(By.cssSelector("select[name=\"birthday_day\"]")).sendKeys("02") ; 
		driver.findElement(By.cssSelector("select[name=\"birthday_month\"]")).sendKeys("Nov") ; 
		driver.findElement(By.cssSelector("select[name=\"birthday_year\"]")).sendKeys("2004") ; 
		driver.findElement(By.cssSelector("input[value=\"2\"]")).click() ; 
		driver.findElement(By.cssSelector("input[name=\"reg_email__\"]")).sendKeys(email) ; 
		driver.findElement(By.cssSelector("input[name=\"reg_passwd__\"]")).sendKeys(pass) ;
		
		driver.findElement(By.cssSelector("button[class=\"_6j mvm _6wk _6wl _58mi _3ma _6o _6v\"]")).click() ;
		
		Thread.sleep(20000) ;
		driver.close() ;
	}
}
