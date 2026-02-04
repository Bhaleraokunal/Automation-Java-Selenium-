package inClassRoomTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RegisterTask {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--disable-cookies");
		
		ChromeDriver driver = new ChromeDriver(opt) ;
		driver.manage().window().maximize(); 
		driver.get("https://demo.automationtesting.in/Register.html");
		Actions act = new Actions(driver) ;
		Thread.sleep(1000) ;
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("K:\\Selenium\\Kuna1.jpg") ;
		Thread.sleep(1000) ;
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Kunal") ;
		Thread.sleep(1000) ;
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Bhalerao") ;
		Thread.sleep(1000) ;
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Pune") ;
		Thread.sleep(1000) ;
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kunalbhalerao2004@gmail.com") ;
		Thread.sleep(1000) ;
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876543219") ;
		Thread.sleep(2000) ;
		driver.findElement(By.xpath("//input[@name='radiooptions']")).click() ;
		Thread.sleep(4000) ;
		driver.findElement(By.xpath("//input[@type='checkbox']")).click() ;
		Thread.sleep(4000) ;
		driver.findElement(By.xpath("//body[@ng-app='Registerform']")).click() ;
		Thread.sleep(4000) ;
		driver.findElement(By.xpath("//input[@type='checkbox']")).click() ;
		Thread.sleep(8000) ;
		driver.findElement(By.xpath("//body[@ng-app='Registerform']")).click() ;
		Thread.sleep(6000) ;
		driver.findElement(By.id("msdd")).click() ;
		Thread.sleep(8000) ;
		driver.findElement(By.linkText("English")).click() ;
		Thread.sleep(4000) ;
		WebElement scroll = driver.findElement(By.xpath("(//label[@class='col-md-3 col-xs-3 col-sm-3 control-label'])[10]")) ;
		act.scrollToElement(scroll) ;
		driver.findElement(By.xpath("//body[@ng-app='Registerform']")).click() ;
		Thread.sleep(4000) ;
		driver.findElement(By.xpath("(//select[@type='text'])[1]")).click() ;
		Thread.sleep(3000) ;
		
		driver.findElement(By.xpath("//select[@type='text']")).sendKeys("java") ;
		Thread.sleep(1000) ;
		
		driver.findElement(By.xpath("//option[text()='India']")).click() ;
		Thread.sleep(6000) ;
		driver.findElement(By.xpath("(//select[@type='text'])[3]")).sendKeys("2004") ;
		Thread.sleep(6000) ;
		driver.findElement(By.xpath("//option[text()='November']")).click() ;
		Thread.sleep(6000) ;
		driver.findElement(By.xpath("//option[text()='2']")).click() ;
		Thread.sleep(6000) ;
		act.scrollToElement(scroll).perform() ;
		driver.findElement(By.id("firstpassword")).sendKeys("1234567") ;
		Thread.sleep(6000) ;
		driver.findElement(By.id("secondpassword")).sendKeys("1234567") ;
		Thread.sleep(6000) ;
		
		driver.findElement(By.id("submitbtn")).click() ;
		
	}
	
}
