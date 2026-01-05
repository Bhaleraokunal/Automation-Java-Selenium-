package assignments;

import java.util.Random;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterAndLogin {

	public static void main(String[] args) {
		
		Random num = new Random() ;
		int numver = num.nextInt(100) ;
		String email = "Kunal"+numver+"@gmail.com" ;
		String pass = "123456" ;
		ChromeDriver driver = new ChromeDriver() ;
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();


		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();

       // driver.findElement(By.xpath("/html/body/div/div/div[4]/div/div/div[2]/form/div/div[2]/div/div/div[1]/div/input")).click();

		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/input"))
		      .sendKeys("Kunal");

		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/input"))
		      .sendKeys("Bhalerao");

		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input"))
		      .sendKeys(email);

		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div/input")).sendKeys(pass) ;
		
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input")).sendKeys(pass) ;
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[4]/input")).click();



//		driver.
	
	}
}
