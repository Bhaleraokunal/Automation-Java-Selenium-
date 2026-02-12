package popUp;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildBrowserPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)) ;
		driver.get("https://demowebshop.tricentis.com/");
		String parent = driver.getWindowHandle() ;
		Actions act = new Actions(driver) ;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)) ;
		act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform() ;
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Facebook']"))) ;
		driver.findElement(By.xpath("//a[text()='Facebook']")).click() ;
		Set<String> multi = driver.getWindowHandles() ;
		
		for (String win : multi) {
			if (!win.equals(parent)) {
				driver.switchTo().window(win) ;
			}
		}
		
		driver.findElement(By.xpath("//input[contains(@id,'_r_')]")).sendKeys("Kunabhalerao2004@gmail.com") ;
		
	}
}
