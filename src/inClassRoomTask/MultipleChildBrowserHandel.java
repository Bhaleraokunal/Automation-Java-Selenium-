package inClassRoomTask;

import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleChildBrowserHandel {

	static ChromeOptions op ;
	static Actions act ;
	static WebDriver driver ;
	static String parent ;
	static String barbequ = "https://www.barbequenation.com/" ;
	static String oliv = "https://www.olivegarden.com/home" ;
	static String giallo = "https://www.giallozafferano.com/" ;
	
	public static void preCondition() {
		op = new ChromeOptions() ;
		op.addArguments("--disable-notifications") ;
		driver = new ChromeDriver(op) ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)) ;
		driver.manage().window().maximize(); 
		driver.get("file:///C:/Users/hp/Downloads/MultipleWindow.html");
		parent = driver.getWindowHandle();
	}
	
	public static void clickOpenFoodSite() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)) ;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@type='button']")).click() ;
	}
	
	public static Set<String> getAllWindowHandles() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)) ;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<String> allUrl = driver.getWindowHandles();
		return allUrl ;
	}
	
	public static String[] readAllUrl() {

	    Set<String> allWin = getAllWindowHandles();

	    String[] urls = new String[allWin.size()];
	    int i = 0;

	    for (String handle : allWin) {

	        driver.switchTo().window(handle);
	        String currentUrl = driver.getCurrentUrl();

	        urls[i] = currentUrl;
	        i++;
	    }
	    return urls ;
	}
	
	public static void barbeq() {

	    Set<String> handles = driver.getWindowHandles();

	    for (String handle : handles) {

	        driver.switchTo().window(handle);
	        String currentUrl = driver.getCurrentUrl();

	        if (currentUrl.contains("barbequenation")) {

	            driver.manage().window().maximize();
	           
	        } else if (!handle.equals(parent)) {

	            driver.close();
	        }
	    }

	    driver.switchTo().window(parent);
	
	}
	
	public static void postCondition() {
		driver.quit(); 
	}
	
	
	public static void maximizeAllChild() {

	    Set<String> handles = driver.getWindowHandles();

	    for (String handle : handles) {

	        if (!handle.equals(parent)) {

	            driver.switchTo().window(handle);
	            driver.manage().window().maximize();
	        }
	    }
	    driver.switchTo().window(parent);
	    driver.manage().window().minimize();

	    driver.close();
	}
	
	public static void olivLogin() throws InterruptedException {
	
		 Set<String> handles = driver.getWindowHandles();

		    for (String handle : handles) {

		        driver.switchTo().window(handle);
		        String currentUrl = driver.getCurrentUrl();

		        if (currentUrl.contains("olivegarden")) {

		            driver.manage().window().maximize();
		            driver.switchTo().window(handle);
		            break ;
		           
		        }
		    }
		    
		    act = new Actions(driver) ;
		    act.keyDown(Keys.TAB).perform(); 
		    act.keyDown(Keys.TAB).perform(); 
		    act.keyDown(Keys.TAB).perform(); 
		    act.keyDown(Keys.TAB).perform(); 
		    act.keyDown(Keys.ENTER).perform(); 
		    act.keyUp(Keys.TAB).perform();
		    
		    driver.findElement(By.xpath("//a[text()='Log In']")).click() ;
		    Thread.sleep(3000) ;
		    
		    driver.findElement(By.id("signInName")).sendKeys("Kunal@gmail.com") ;
		    driver.findElement(By.id("password")).sendKeys("123456") ;
		    takeScreenshot() ;
		    
	}
	public static void takeScreenshot() {

	    try {
	    	
	    		TakesScreenshot ts = (TakesScreenshot)driver;
	        File from = ts.getScreenshotAs(OutputType.FILE);

	        File to = new File("K:\\Selenium\\olio_icon.png");

	       org.openqa.selenium.io.FileHandler.copy(from, to);

	        System.out.println("Logo screenshot saved.");

	    } catch (Exception e) {
	        System.out.println("Screenshot failed: " + e.getMessage());
	    }
	}
	
}
