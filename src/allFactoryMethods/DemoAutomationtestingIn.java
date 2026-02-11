package allFactoryMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoAutomationtestingIn {
	
	static ChromeDriver driver;
	static ChromeOptions options ;
	
	public static void preCondtion() {
		
		driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
	}
	
	public static void photo() {
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("K:\\Selenium\\Kuna1.jpg") ;
	}
	
	public static void names() {
		List<WebElement> names = driver.findElements(By.xpath("//input[@type='text']")) ;
		names.get(0).sendKeys("Kunal") ;
		names.get(1).sendKeys("Bhalerao") ;
	}
	
	public static void details() {
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Sadashiv Peth Pune") ;
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kunalbhalerao2004@gmail.com") ;
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876543219") ;
		driver.findElement(By.xpath("//input[@type='radio']")).click() ;
	}
	
	public static void hobbies() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    WebElement cricket = driver.findElement(By.id("checkbox1"));
	    WebElement movies = driver.findElement(By.id("checkbox2"));
	    WebElement hockey = driver.findElement(By.id("checkbox3"));

	    js.executeScript("arguments[0].click();", cricket);
	    js.executeScript("arguments[0].click();", movies);
	    js.executeScript("arguments[0].click();", hockey);
	}

	
	public static void Others() {

	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    WebElement language = driver.findElement(By.id("msdd"));
	    js.executeScript("arguments[0].click();", language);

	    WebElement english = driver.findElement(
	        By.xpath("//a[@class='ui-corner-all' and text()='English']")
	    );
	    js.executeScript("arguments[0].click();", english);

	    
	    driver.findElement(By.xpath("//select[@id='Skills']/option[text()='Java']")).click();
	    driver.findElement(By.xpath("//option[text()='India']")).click();
	}

	public static void dob() {
		driver.findElement(By.xpath("(//select[@type='text'])[3]")).sendKeys("2004") ;
		driver.findElement(By.xpath("(//select[@type='text'])[4]")).sendKeys("November") ;
		driver.findElement(By.xpath("(//select[@type='text'])[5]")).sendKeys("2") ;
	}
	
	public static void password() {
		driver.findElement(By.id("firstpassword")).sendKeys("12345678");
		driver.findElement(By.id("secondpassword")).sendKeys("12345678");
	}
	public static void submit() {
		driver.findElement(By.id("submitbtn")).click();
		}
	
	public static void postCondition() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		driver.quit(); 
		
	}
		
}
