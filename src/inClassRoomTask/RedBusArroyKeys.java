package inClassRoomTask;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBusArroyKeys {

		public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("	https://www.redbus.in/");

        Actions act = new Actions(driver); 
        
        for (int i = 0; i < 8; i++) {
			act.keyDown(Keys.TAB).perform() ;
			Thread.sleep(400) ;
		}
        
        act.sendKeys("Bhusawal").perform() ;
        Thread.sleep(2000) ;
        act.keyDown(Keys.ARROW_DOWN).perform() ;
        act.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform() ;
        
        act.sendKeys("Pune").perform() ;
        Thread.sleep(2000) ;
        act.keyDown(Keys.ARROW_DOWN).perform() ;
        act.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform() ;
        
	}
}
