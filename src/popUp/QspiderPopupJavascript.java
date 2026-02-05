package popUp;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QspiderPopupJavascript {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		ChromeDriver driver = new ChromeDriver() ;
		Actions act = new Actions(driver ) ;
		driver.manage().window().maximize(); 
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000) ;
		
		driver.findElement(By.xpath("(//ul[@class='pt-2 pe-1']//li)[17]")).click() ;
		Thread.sleep(2000) ;
		
		driver.findElement(By.xpath("(//ul[@class='pt-2 pe-1']//li)[4]")).click() ;
		
		Thread.sleep(3000) ;
		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']")) ;
		
		System.out.println(checkBox);
		for (WebElement webElement : checkBox) {
			Thread.sleep(500) ;
			webElement.click() ;
		}
		
		Thread.sleep(3000) ;
		
		driver.findElement(By.id("deleteButton")).click() ;
		Thread.sleep(500) ;

		Alert alt = driver.switchTo().alert() ;
		Thread.sleep(500) ;

		alt.accept() ;
		Thread.sleep(500) ;

		driver.findElement(By.linkText("Prompt")).click()  ;
		
		Thread.sleep(3000) ;

		List<WebElement> promptCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']")) ;
		
		for (WebElement webElement : promptCheckBox) {
			Thread.sleep(500) ;
			webElement.click() ;
		}
		
		driver.findElement(By.xpath("//button[@id='deleteButton']")).click() ;
		Thread.sleep(500) ;

		
		alt.sendKeys("Hey I want to delet the the items") ;
		Thread.sleep(500) ;

		alt.accept() ;
		Thread.sleep(500) ;
		
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(3000) ;
		
		driver.findElement(By.xpath("(//ul[@class='pt-2 pe-1']//li)[7]")).click() ;
		Thread.sleep(2000) ;
		
		driver.findElement(By.xpath("//a[@target='_blank']")).click() ;
		Thread.sleep(3000) ;
		
		Robot ro = new Robot() ;
		Thread.sleep(3000) ;

		
		ro.keyPress(KeyEvent.VK_A) ;
		ro.keyPress(KeyEvent.VK_D) ;
		ro.keyPress(KeyEvent.VK_M) ;
		ro.keyPress(KeyEvent.VK_I) ;
		ro.keyPress(KeyEvent.VK_N) ;
		Thread.sleep(500) ;

		ro.keyPress(KeyEvent.VK_TAB) ;
		ro.keyPress(KeyEvent.VK_A) ;
		ro.keyPress(KeyEvent.VK_D) ;
		ro.keyPress(KeyEvent.VK_M) ;
		ro.keyPress(KeyEvent.VK_I) ;
		ro.keyPress(KeyEvent.VK_N) ;

		
		ro.keyPress(KeyEvent.VK_TAB) ;
		Thread.sleep(500) ;

		ro.keyPress(KeyEvent.VK_ENTER) ;
		
		ro.keyRelease(KeyEvent.VK_A) ;
		ro.keyRelease(KeyEvent.VK_D) ;
		ro.keyRelease(KeyEvent.VK_M) ;
		ro.keyRelease(KeyEvent.VK_I) ;
		ro.keyRelease(KeyEvent.VK_N) ;
		ro.keyRelease(KeyEvent.VK_TAB) ;
		ro.keyRelease(KeyEvent.VK_ENTER) ;
		
		Thread.sleep(3000) ;
		

		
		ro.keyPress(KeyEvent.VK_CONTROL) ;
		ro.keyPress(KeyEvent.VK_W) ;
	
		Thread.sleep(3000) ;
	
		ro.keyRelease(KeyEvent.VK_CONTROL) ;
		ro.keyRelease(KeyEvent.VK_W) ;
		
		Thread.sleep(4000) ;
		
		driver.findElement(By.xpath("(//ul[@class='pt-2 pe-1']//li)[8]")).click() ;
		Thread.sleep(1000) ;
		driver.findElement(By.id("fullName")).sendKeys("Kunal") ;
		driver.findElement(By.id("emailId")).sendKeys("Kunalbhalerao2004@gmail.com") ;
		driver.findElement(By.id("password")).sendKeys("Kunal") ;
		driver.findElement(By.id("mobile")).sendKeys("98765434210") ;
		driver.findElement(By.id("city")).sendKeys("Pune") ;
		
		Thread.sleep(3000) ;
		
		WebElement fileUpload = driver.findElement(By.xpath("//input[@type='file']")) ;
		
		fileUpload.sendKeys("K:\\Selenium\\IloveSelenium.docx") ;
		Thread.sleep(3000) ;
		
		List<WebElement> skills = driver.findElements(By.xpath("//select[@aria-invalid='false']//option")) ;
		Thread.sleep(500) ;
		
		for (WebElement webElement : skills) {
			ro.keyPress(KeyEvent.VK_CONTROL) ;
			webElement.click() ;
		}
		
		ro.keyRelease(KeyEvent.VK_CONTROL) ;
		Thread.sleep(500) ;
		driver.findElement(By.id("alert")).click() ;
		Thread.sleep(5000) ;
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']")) ;
		
		act.scrollToElement(submit).perform() ;
		
		Thread.sleep(500) ;
		
		submit.click() ;
		
		Thread.sleep(500) ;
		driver.close() ;
		

	}
}
