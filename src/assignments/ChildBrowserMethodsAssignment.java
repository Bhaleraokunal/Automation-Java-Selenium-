package assignments;

import java.io.File;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ChildBrowserMethodsAssignment {

	static WebDriver driver ; 
	
	
	public static void preCondition() {
		driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)) ;
		driver.manage().window().maximize(); 
		driver.get("https://demowebshop.tricentis.com/");
		
	
	}
	
	public static void facebook () {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)) ;
		String parent = driver.getWindowHandle() ;
		driver.findElement(By.linkText("Facebook")).click() ;
		Set<String> facebook = driver.getWindowHandles() ;
		for (String string : facebook) {
			if (!parent.equals(string)) {
				driver.switchTo().window(string) ;
				break;
			}
		}
		driver.findElement(By.xpath("//input[@name='email' and @tabindex='0']")).sendKeys("kunalbhalerao2004@gmail.com") ;
		driver.findElement(By.xpath("//input[contains(@id,'_r_') and @type='password']")).sendKeys("123456") ;
		driver.close() ;
		driver.switchTo().window(parent) ;
		
	}
	
	public static void twitter() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)) ;
		String parent = driver.getWindowHandle() ;
		driver.findElement(By.linkText("Twitter")).click() ;
		Set<String> twitter = driver.getWindowHandles() ;
		for (String string : twitter) {
			if (!parent.equals(string)) {
				driver.switchTo().window(string) ;
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Create account']")).click() ;
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Kunal") ;
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Bhalerao@gmail.com") ;
		driver.findElement(By.xpath("//option[text()='November']")).click() ;
		driver.findElement(By.xpath("//option[@value='2' and text()='2']")).click() ;
		driver.findElement(By.xpath("//option[text()='2004']")).click() ;
		
		driver.close() ;
		driver.switchTo().window(parent) ;
	}
	
	public static void youtube() {

	    String parent = driver.getWindowHandle();
	    driver.findElement(By.linkText("YouTube")).click();

	    Set<String> allWindows = driver.getWindowHandles();
	    for (String id : allWindows) {
	        if (!parent.equals(id)) {
	            driver.switchTo().window(id);
	            break;
	        }
	    }

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.elementToBeClickable(By.name("search_query")));
	    driver.findElement(By.name("search_query")).sendKeys("Giorgia Meloni");
	    driver.findElement(By.cssSelector("button[title='Search']")).click();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	    driver.close();
	    driver.switchTo().window(parent);
	}
	
	public static void googel() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)) ;
		String parent = driver.getWindowHandle() ;
		driver.findElement(By.linkText("Google+")).click() ;
		Set<String> google = driver.getWindowHandles() ;
		for (String string : google) {
			if (!parent.equals(string)) {
				driver.switchTo().window(string) ;
				break;
			}
		}
		
		driver.findElement(By.className("header__search")).sendKeys("Giorgia Meloni"); 
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		driver.close();
		driver.switchTo().window(parent) ;
		
	}
	
	public static void takeScreenshot() {

	    try {
	    	
	    		WebElement logo = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")) ;
	    		

	        File from = logo.getScreenshotAs(OutputType.FILE);

	        File to = new File("K:\\Selenium\\demo_icon.png");

	       org.openqa.selenium.io.FileHandler.copy(from, to);

	        System.out.println("Logo screenshot saved.");

	    } catch (Exception e) {
	        System.out.println("Screenshot failed: " + e.getMessage());
	    }
	}
	
	public static void postCondition() {
		driver.quit(); 
	}
}
