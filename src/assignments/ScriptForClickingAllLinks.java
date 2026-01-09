package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptForClickingAllLinks {

	public static void main(String[] args) throws InterruptedException {
		
		String exp_Url = "https://demowebshop.tricentis.com/" ;
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String act_Url = driver.getCurrentUrl() ;
		
		if (act_Url.equals(exp_Url)) {
			
			int count  = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a")).size() ;
			
			//System.out.println(count);
			
			for (int i = 0; i < count ; i++) {
				
				if (!driver.getCurrentUrl().equals(exp_Url)) {
					
					Thread.sleep(2000) ;
					driver.navigate().back() ;
				} 
				
				List<WebElement> link = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a")) ;
				
				WebElement clickLinks = link.get(i) ;
				
				Thread.sleep(2000) ;
				
				clickLinks.click() ;
				
				Thread.sleep(2000) ;
			}
		}
		else {
			System.out.println("I am not in DWS HomePage and the TestCase is failed");
		}
		
		Thread.sleep(2000) ;
		
		driver.quit() ;
	}
}
