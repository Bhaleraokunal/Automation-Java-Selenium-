package popUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderDemoScript {

	static ChromeDriver driver  ;

	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		preCondition();
		handleJavascriptAlert();
		Thread.sleep(1000);
		handlePromptAlert(); 
		Thread.sleep(1000); 
		handleAuthenticationPopup();
		Thread.sleep(2000);
		handleFileUploadAndForm();
		Thread.sleep(1000);
		postCondition();
	}
	
	public static void clickMenu(int index) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@class='pt-2 pe-1']//li)[" + index + "]")).click() ;
	}
	
	public static void handleJavascriptAlert() throws InterruptedException {
		clickMenu(17);
        clickMenu(4);
        selectAllCheckboxes();
        
        driver.findElement(By.id("deleteButton")).click();
        
        acceptAlert(); 
	}
	
	 public static void handlePromptAlert() throws InterruptedException, AWTException {
		 	
	        driver.findElement(By.linkText("Prompt")).click();
	        Thread.sleep(1500);
	        selectAllCheckboxes();
	        Thread.sleep(1500);
	        driver.findElement(By.id("deleteButton")).click();
	        Alert alt =  driver.switchTo().alert()  ; 
	        Thread.sleep(1500);
	        alt.sendKeys("Hey i want to delete the items");
//	        Robot ro = new Robot() ;
//	        ro.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(1500);
	        alt.accept(); 
	        Thread.sleep(1500);
	    }
	
	 private static void handleAuthenticationPopup() throws AWTException, InterruptedException {
 		
		 	Thread.sleep(2000);
	        clickMenu(7);
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//a[@target='_blank']")).click();
	        Thread.sleep(2000);
	        
	        Robot ro = new Robot() ;
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
			closeCurrentTab(ro ) ;
	    }
	 
	 static void handleFileUploadAndForm() throws InterruptedException, AWTException {
		 
		 Thread.sleep(2000);
	        clickMenu(8);

	        Thread.sleep(2000);
	        driver.findElement(By.id("fullName")).sendKeys("Kunal");
	        Thread.sleep(500);
	        driver.findElement(By.id("emailId")).sendKeys("kunal@gmail.com");
	        Thread.sleep(500);
	        driver.findElement(By.id("password")).sendKeys("1234567890");
	        Thread.sleep(500);
	        driver.findElement(By.id("mobile")).sendKeys("9987654321");
	        Thread.sleep(500);
	        driver.findElement(By.id("city")).sendKeys("Pune");
	        Thread.sleep(500);

	        driver.findElement(By.xpath("//input[@type='file']"))
	              .sendKeys("K:\\Selenium\\IloveSelenium.docx");
	        Thread.sleep(500);
	        selectSkills() ;
	        Thread.sleep(500);
	        driver.findElement(By.id("alert")).click();
	        Thread.sleep(500);
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        Thread.sleep(500);
	    }
	 
	 private static void selectAllCheckboxes() throws InterruptedException {
		 Thread.sleep(2000);
	        List<WebElement> checkboxes =driver.findElements(By.xpath("//input[@type='checkbox']"));

	        for (WebElement checkbox : checkboxes) {
	            checkbox.click();
	        }
	    }
	
	public static void acceptAlert() throws InterruptedException {
		Thread.sleep(2000);
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
	}
	
	public static void closeCurrentTab(Robot robot) {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }
	
	public static void selectSkills() throws AWTException, InterruptedException {
		Robot ro = new Robot() ;
		List<WebElement> skills = driver.findElements(By.xpath("//select[@aria-invalid='false']//option")) ;
		Thread.sleep(500) ;
		
		for (WebElement webElement : skills) {
			ro.keyPress(KeyEvent.VK_CONTROL) ;
			webElement.click() ;
		}
		ro.keyRelease(KeyEvent.VK_CONTROL) ;
	}
	public static void preCondition() {
		driver = new ChromeDriver() ;
		driver.manage().window().maximize(); 
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	}
	
	public static void postCondition() {
		driver.quit(); 
	}
}
