package assignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RegisterWithoutUsingwebElement {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");

        Actions act = new Actions(driver);

        // Navigate to Register link
        for (int i = 0; i < 2; i++) {
            act.sendKeys(Keys.TAB).perform();
            Thread.sleep(500);
        }

        act.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);

        // Navigate to Gender (Male)
        for (int i = 0; i < 24; i++) {
            act.sendKeys(Keys.TAB).perform();
            Thread.sleep(300);
        }

        act.sendKeys(Keys.SPACE).perform(); // select Male
        act.sendKeys(Keys.TAB).perform();
        act.sendKeys("Kunal").perform();

        act.sendKeys(Keys.TAB).perform();
        act.sendKeys("Bhalerao").perform();
    }
}
