package inClassRoomTask;

import java.awt.AWTException;import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.awt.Robot;

import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysByRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Robot rob = new Robot() ;
		
		Thread.sleep(6000) ;
		for (int i = 0; i < 6; i++) {
			rob.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500) ;
		}
		
		rob.keyPress(KeyEvent.VK_K) ;
		rob.keyPress(KeyEvent.VK_U) ;
		rob.keyPress(KeyEvent.VK_N) ;
		rob.keyPress(KeyEvent.VK_A) ;
		rob.keyPress(KeyEvent.VK_L) ;
		
		rob.keyRelease(KeyEvent.VK_K);
		rob.keyRelease(KeyEvent.VK_U);
		rob.keyRelease(KeyEvent.VK_N);
		rob.keyRelease(KeyEvent.VK_A);
		rob.keyRelease(KeyEvent.VK_L);
	}
	
}

