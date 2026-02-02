package popUp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EasyMyTrip {

	static ChromeDriver driver  ;
	static ChromeOptions opt  ;
	
	public static void main(String[] args) throws InterruptedException {
		preCondition();
		Thread.sleep(2000);
		departureDate();
		Thread.sleep(2000);
		returnDate();
		Thread.sleep(2000);
		postCondition();
		Thread.sleep(2000);
		
		System.out.println(todaysDate());
	}
	
	private static void preCondition() throws InterruptedException {
		opt = new ChromeOptions() ;
		opt.addArguments("--disable-notifications") ;
		driver = new ChromeDriver(opt) ;
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize() ;
	}
	
	private static void postCondition() {
		driver.quit(); 
	}
	
	private static void departureDate() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("dvfarecal")).click(); 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String todaysDate = todaysDate() ;
		driver.findElement(By.xpath("//li[contains(@id,'"+todaysDate+"')]")).click() ;
	}
	
	private static void returnDate() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("divRtnCal")).click();
		Thread.sleep(2000);
		String returnDate = afterDate(90) ;
		
		for(;;) {
			Thread.sleep(500);
			try {
				driver.findElement(By.xpath("//li[contains(@id,'"+returnDate+"')]")).click();
				break ;
			} catch (Exception e) {
				driver.findElement(By.id("img2Nex")).click() ;
			}
		}
	}
	
	private static String todaysDate() {
		LocalDate todays = LocalDate.now()  ;
		//LocalDate afterDays = todays.plusDays() ;
		
		DateTimeFormatter formator = DateTimeFormatter.ofPattern("dd/MM/yyyy") ;
		
		String todayDate = formator.format(todays) ;
		//String afterDate = formator.format(afterDays) ;
		
		return todayDate ;
		
	}
	
	private static String afterDate(int num) {
		LocalDate todays = LocalDate.now()  ;
		LocalDate plusDays = todays.plusDays(num) ;
		
		DateTimeFormatter formator = DateTimeFormatter.ofPattern("dd/MM/yyyy") ;
		String returnDate = formator.format(plusDays) ;
		return returnDate ;
	}
	
}
