package inClassRoomTask;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendValuesInSearchFiled {
	public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");

        Actions act = new Actions(driver);

        
        for (int i = 0; i < 6; i++) {
            act.sendKeys(Keys.TAB).perform();
            Thread.sleep(500);
        }      
        
        Thread.sleep(2000) ;
        act.sendKeys("Aniket Tia").perform() ;
        Thread.sleep(2000);
        
        act.sendKeys(Keys.TAB).perform();
        act.sendKeys(Keys.ENTER).perform() ;
	}
}
