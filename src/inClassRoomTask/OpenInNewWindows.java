package inClassRoomTask;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenInNewWindows {

	public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");

        Actions act = new Actions(driver);
        
        WebElement books =driver.findElement(By.xpath("//a[contains(text(),'Books')]")) ;        
        
        act.keyDown(Keys.SHIFT).click(books).perform() ;
       
        
        
        // Second Way without using the web element methods.
        
//      for (int i = 0; i < 8; i++) {
//      act.sendKeys(Keys.TAB).perform();
//      Thread.sleep(500);
//  }      
//act.keyDown(Keys.SHIFT).keyDown(Keys.ENTER).perform() ;

	}
}
