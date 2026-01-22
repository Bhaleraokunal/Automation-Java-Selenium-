package inClassRoomTask;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenInDifferentTab {

	public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");

        Actions act = new Actions(driver);

        
        for (int i = 0; i < 8; i++) {
            act.sendKeys(Keys.TAB).perform();
            Thread.sleep(500);
        }      
        act.keyDown(Keys.CONTROL).keyDown(Keys.ENTER).perform() ;
	}
}
