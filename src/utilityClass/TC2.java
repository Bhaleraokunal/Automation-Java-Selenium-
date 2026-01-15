package utilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		preCondition();
		Thread.sleep(2000);

		login();
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.className("account"));
		System.out.println(email.getText());
		Thread.sleep(2000);
		
		logout();
		
		postConditon();
	}
}
