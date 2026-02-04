package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendFile {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.ilovepdf.com/word_to_pdf"); 
		
		WebElement sendFile = driver.findElement(By.xpath("//input[@type='file']")) ;
		
		sendFile.sendKeys("K:\\Selenium\\IloveSelenium.docx") ;
		
	}
}
