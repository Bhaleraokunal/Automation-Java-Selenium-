package inClassRoomTask;

import java.awt.AWTException;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopupViaUrl {

public static void main(String[] args) throws AWTException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
	}
}
