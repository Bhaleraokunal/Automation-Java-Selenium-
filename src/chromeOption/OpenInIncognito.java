package chromeOption;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import utilityClass.BaseClass;

public class OpenInIncognito{

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions() ;
		option.addArguments("--incognito") ;
		ChromeDriver driver = new ChromeDriver(option) ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("I am in DWS page........");
		driver.findElement(By.className("ico-login")).click() ;
		driver.findElement(By.id("Email")).sendKeys("kunalbhalerao2004@gmail.com"); 
		driver.findElement(By.name("Password")).sendKeys("123456");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		
		System.out.println("Loging Successful..........");
	}
}
