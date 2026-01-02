package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookRegister {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(100);
		
		driver.findElement(By.name("firstname")).sendKeys("Ramesh");
		
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		
		driver.findElement(By.id("day")).sendKeys("3");
		
		driver.findElement(By.id("month")).sendKeys("Jan");
		
		driver.findElement(By.id("year")).sendKeys("2003");
		
		driver.findElement(By.className("_8esa")).getAttribute("value");
		
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("123@ramesh");
		
		Thread.sleep(5000);
		
		driver.close();
		
	}
}
