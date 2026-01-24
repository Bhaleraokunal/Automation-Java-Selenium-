package inClassRoomTask;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendValues {


	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions act = new Actions(driver) ;
		
		for (int i = 0; i < 8; i++) {
			
			act.keyDown(Keys.TAB).perform() ;

			if (i==5) {
				Thread.sleep(2000) ;
				act.sendKeys("Aniket").perform() ;
			}
			
			if (i==6) {
				act.keyDown(Keys.ENTER).perform() ;
			}
		}
	}
}
