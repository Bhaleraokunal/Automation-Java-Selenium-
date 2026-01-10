package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptFroDWSHomePage {

	public static void main(String[] args) throws InterruptedException {
		
		String exp_Url ="https://demowebshop.tricentis.com/" ;
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String act_Url= driver.getCurrentUrl() ;
		
		if (exp_Url.equals(act_Url)) {
			
			System.out.println("I am in DWS home Page and the test case is passed"); 
			
			List<WebElement> socialLinks = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a")) ;
			
			
			for (WebElement webElement : socialLinks) {
				
				if (!driver.getCurrentUrl().equals(exp_Url)) {
					
					Thread.sleep(2000) ;
					driver.navigate().back() ;
				} 
				
				webElement.click() ;
				Thread.sleep(2000) ;
			}
			
		} else {
			System.out.println("I am not in DWS home page and the testCase is fail");
		}
		driver.quit() ;
	}
}
