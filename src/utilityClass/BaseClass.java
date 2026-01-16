package utilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static ChromeDriver driver ;
	
	public static  void preCondition( ) {
		
		driver = new ChromeDriver() ;
		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	
	public static  void login() {
		driver.findElement(By.className("ico-login")).click() ;
		driver.findElement(By.id("Email")).sendKeys("kunalbhalerao2004@gmail.com"); 
		driver.findElement(By.name("Password")).sendKeys("123456");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
	}
	
	public static  void logout() {
		driver.findElement(By.linkText("Log out")).click(); 
	}
	
	public static  void postConditon() {
		driver.close(); 
	}
}
