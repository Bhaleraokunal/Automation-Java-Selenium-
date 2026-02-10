package allFactoryMethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AgodaBaseTest {

	static ChromeDriver driver ;
	static ChromeOptions opt ;
	
	public static void preCondtion() {
		opt = new ChromeOptions() ;
		opt.addArguments("--disable-notifications") ;
		driver = new ChromeDriver(opt) ;
		driver.manage().window().maximize() ;
		driver.get("https://www.agoda.com/");
	}
	
	public static void departureDate() throws InterruptedException {
		String todayDate = todaysDate() ;
		Thread.sleep(2000) ;
		driver.findElement(By.xpath("(//div[@tabindex='0'])[5]")).click() ;
		Thread.sleep(2000) ;
		for(;;) {
		try {
			driver.findElement(By.xpath("//span[@data-selenium-date='"+todayDate+"']")).click(); 
			break ;
			} catch (Exception e) {
				Thread.sleep(500) ;
				driver.findElement(By.xpath("//button[@aria-label='Previous Month']")).click() ;
			}
		}
		
	}

	public static void returnDate() throws InterruptedException {
		String afterDate = afterDate(90) ;
		for(;;) {
			try {
				Thread.sleep(2000) ;
				driver.findElement(By.xpath("//span[@data-selenium-date='"+afterDate+"']")).click() ;
				break ;
			} catch (Exception e) {
				Thread.sleep(500) ;
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click() ;
			}
		}
	}
	public static String todaysDate() {
		LocalDate todays = LocalDate.now()  ;	
		DateTimeFormatter formator = DateTimeFormatter.ofPattern("yyyy-MM-dd") ;
		
		String todayDate = formator.format(todays) ;
		return todayDate ;
		
	}
	
	public static String afterDate(int num) {
		LocalDate todays = LocalDate.now()  ;
		LocalDate plusDays = todays.plusDays(num) ;
		
		DateTimeFormatter formator = DateTimeFormatter.ofPattern("yyyy-MM-dd") ;
		String returnDate = formator.format(plusDays) ;
		return returnDate ;
	}
	
	public static void postCondition() {
		driver.quit(); 
	}
}
