package inClassRoomTask;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PressRegister {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions act = new Actions(driver) ;
		
		for (int i = 0; i < 2; i++) {
			act.keyDown(Keys.TAB).perform() ;
		}
		act.keyDown(Keys.ENTER).perform() ;
		
		driver.quit() ;
	}
}
