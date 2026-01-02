package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		
		System.out.println("Power of Automation.........");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
}
