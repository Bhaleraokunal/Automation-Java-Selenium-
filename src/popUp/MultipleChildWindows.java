package popUp;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleChildWindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		Actions act = new Actions(driver) ;
		act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform() ;
		driver.findElement(By.linkText("Facebook")).click() ;
		driver.findElement(By.linkText("Twitter")).click() ;
		driver.findElement(By.linkText("YouTube")).click() ;
		driver.findElement(By.linkText("Google+")).click() ;
		String expected = "https://x.com/nopCommerce" ;
		String parent = driver.getWindowHandle() ;
		 Set<String> childWin = driver.getWindowHandles() ;
		 
		 for (String string : childWin) {
			driver.switchTo().window(string) ;
			if (expected.equals(driver.getCurrentUrl())) {
				driver.findElement(By.xpath("//span[text()='Create account']")).click() ;
				return  ;
			}
		}
		 driver.quit() ;
	}
}
