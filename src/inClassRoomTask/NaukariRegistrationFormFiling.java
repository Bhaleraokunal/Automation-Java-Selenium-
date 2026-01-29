package inClassRoomTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariRegistrationFormFiling {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(2000) ;
		driver.findElement(By.linkText("Register")).click() ;
		Thread.sleep(2000) ;
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Kunal") ;
		Thread.sleep(2000) ;
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Kunalbhalerao204@gmail.com	") ;
		Thread.sleep(2000) ;
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456789") ;
		Thread.sleep(2000) ;
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9234327979") ;
		Thread.sleep(2000) ;
		
		driver.findElement(By.xpath("//div[@class='focusable optionWrap  ']")).click() ;
		Thread.sleep(2000) ;
		
		WebElement sendResume = driver.findElement(By.xpath("//input[@type='file']")) ;
		Thread.sleep(500) ;
		
		sendResume.sendKeys("K:\\Selenium\\KunalBhalerao.docx") ;
		Thread.sleep(500) ;
	
		driver.close() ;
	}
}
