package popUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Notification {

	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize(); 
		driver.get("https://www.easemytrip.com/");
		
		Thread.sleep(10000) ;
		Actions act = new Actions(driver) ;
		
		Robot rob = new Robot() ;
		
		rob.keyPress(KeyEvent.VK_TAB) ;
		Thread.sleep(500);
		
		rob.keyPress(KeyEvent.VK_TAB) ;
		Thread.sleep(500);
		
		rob.keyPress(KeyEvent.VK_TAB) ;
		Thread.sleep(500);
		
		rob.keyPress(KeyEvent.VK_ENTER) ;
		Thread.sleep(500);
		
		rob.keyRelease(KeyEvent.VK_TAB) ;
		rob.keyRelease(KeyEvent.VK_ENTER) ;
	}
}
