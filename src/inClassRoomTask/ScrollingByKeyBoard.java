package inClassRoomTask ;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingByKeyBoard {

	public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");

        Actions act = new Actions(driver);
        
        act.keyDown(Keys.PAGE_DOWN).perform() ;
        act.keyDown(Keys.PAGE_DOWN).perform() ;
        
        Thread.sleep(2000) ;
        
        driver.close() ;
	}
}
