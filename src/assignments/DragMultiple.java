package assignments;

import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragMultiple {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		
		for(int i = 0 ; i < 3 ; i++)
		{
		act.keyDown(Keys.TAB).perform();
		}
		
		act.keyDown(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Drag Multiple')]")).click();		
		
		Thread.sleep(1000);
		
//		List<WebElement> mob = driver.findElements(By.xpath("//div[contains(text(),'Mobile')]"));
		
//		List<WebElement> lap = driver.findElements(By.xpath("//div[contains(text(),'Laptop')]"));
		
		WebElement mob1 = driver.findElement(By.xpath("//div[contains(text(),'Mobile Charger')]"));

		WebElement mob2 = driver.findElement(By.xpath("//div[contains(text(),'Mobile Cover')]"));
		
		WebElement lap1 = driver.findElement(By.xpath("//div[contains(text(),'Laptop Charger')]"));

		WebElement lap2 = driver.findElement(By.xpath("//div[contains(text(),'Laptop Cover')]"));

		
		WebElement source = driver.findElement(By.xpath("//section[@id='draggable-container']"));
				
		WebElement Mobile = driver.findElement(By.id("dropZone1"));
		
		WebElement Laptop = driver.findElement(By.id("dropZone2"));
		
		Thread.sleep(3000);
	
		act.keyDown(Keys.CONTROL).click(lap1).click(lap2).dragAndDrop(source, Laptop).perform();
		
		Thread.sleep(3000);
		
		act.keyDown(Keys.CONTROL).click(mob1).click(mob2).perform();
		
		Thread.sleep(900) ;
		act.dragAndDrop(source, Mobile).perform();
		
		Thread.sleep(4000);
		
		
		
		
		
		
	}
}
