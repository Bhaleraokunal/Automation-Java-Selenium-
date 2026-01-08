package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndpenedentAndDependentXpath {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demowebshop.tricentis.com/digital-downloads"); 
		
		WebElement pri1 = driver.findElement(By.xpath("//a[text()='3rd Album']/../following-sibling::div[3]/div/span")) ;
		
		WebElement pri2 = driver.findElement(By.xpath("//a[text()='Music 2']/../following-sibling::div[3]/div/span")) ;
		
		WebElement pri3 = driver.findElement(By.xpath("//a[text()='Music 2']/../../../../following-sibling::div/div/div[2]/div[3]/div/span")) ;

		
		System.out.println(pri1.getText());
		System.out.println(pri2.getText());
		System.out.println(pri3.getText());
	}
}
