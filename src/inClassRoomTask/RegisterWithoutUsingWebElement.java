package inClassRoomTask;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RegisterWithoutUsingWebElement {

	public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");

        Actions act = new Actions(driver);

        
        for (int i = 0; i < 2; i++) {
            act.sendKeys(Keys.TAB).perform();
            Thread.sleep(500);
        }

        act.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);

        for (int i = 0; i < 24; i++) {
            act.sendKeys(Keys.TAB).perform();
         
        }
        
        act.keyDown(Keys.TAB).keyDown(Keys.SPACE).keyUp(Keys.SPACE).perform() ;
        
        act.keyDown(Keys.TAB).perform() ;
        act.sendKeys("Kunal").perform() ;
        
        act.keyDown(Keys.TAB).perform() ;
        act.sendKeys("Bhalerao").perform() ;
        
        act.keyDown(Keys.TAB).perform() ;
        act.sendKeys("kunalbhaleao20@gmail.com").perform() ;
        
        act.keyDown(Keys.TAB).perform() ;
        act.sendKeys("123456").perform() ;
        
        act.keyDown(Keys.TAB).perform() ;
        act.sendKeys("123456").perform() ;
        
        act.keyDown(Keys.TAB).sendKeys(Keys.ENTER).perform() ;
        
    }
}
