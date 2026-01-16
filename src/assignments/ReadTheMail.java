package assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilityClass.BaseClass;
public class ReadTheMail extends  BaseClass{

	public static void main(String[] args) {
		preCondition();
		login();
		
		WebElement mail = driver.findElement(By.cssSelector(".ico-register"));
		
		System.out.println(mail.getText());	
		
		postConditon(); 
	}
}
