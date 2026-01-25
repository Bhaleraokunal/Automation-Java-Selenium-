package inClassRoomTask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticationPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		
		Robot rob = new Robot() ;
		Thread.sleep(4000) ;
		
		rob.keyPress(KeyEvent.VK_A);
		rob.keyPress(KeyEvent.VK_D);
		rob.keyPress(KeyEvent.VK_M);
		rob.keyPress(KeyEvent.VK_I);
		rob.keyPress(KeyEvent.VK_N);
		
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_A);
		rob.keyPress(KeyEvent.VK_D);
		rob.keyPress(KeyEvent.VK_M);
		rob.keyPress(KeyEvent.VK_I);
		rob.keyPress(KeyEvent.VK_N);
		
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_ENTER) ;
		
		rob.keyRelease(KeyEvent.VK_A);
		rob.keyRelease(KeyEvent.VK_D);
		rob.keyRelease(KeyEvent.VK_M);
		rob.keyRelease(KeyEvent.VK_I);
		rob.keyRelease(KeyEvent.VK_N);
		rob.keyRelease(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
}
