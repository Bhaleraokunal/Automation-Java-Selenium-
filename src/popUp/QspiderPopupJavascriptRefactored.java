package popUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QspiderPopupJavascriptRefactored {

    static ChromeDriver driver;
    static WebDriverWait wait;

    public static void main(String[] args) throws AWTException, InterruptedException {

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(1000));

        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/ui?scenario=1");

        Thread.sleep(1500) ;
        handleJavascriptAlert();
        Thread.sleep(1500) ;
        handlePromptAlert();
        Thread.sleep(1500) ;
        handleAuthenticationPopup();
        Thread.sleep(1500) ;
        handleFileUploadAndForm();
        Thread.sleep(1500) ;

        driver.quit();
    }

    // ------------------- JavaScript Alert -------------------
    private static void handleJavascriptAlert() {

        clickMenu(17);
        clickMenu(4);

        selectAllCheckboxes();

        driver.findElement(By.id("deleteButton")).click();
        acceptAlert();
    }

    // ------------------- Prompt Alert -------------------
    private static void handlePromptAlert() throws InterruptedException {

        driver.findElement(By.linkText("Prompt")).click();
        Thread.sleep(1500);
        selectAllCheckboxes();
        Thread.sleep(1500);
        driver.findElement(By.id("deleteButton")).click();
        sendTextToPrompt("Hey I want to delete the items");
        Thread.sleep(1500);
    }

    // ------------------- Authentication Popup -------------------
    private static void handleAuthenticationPopup() throws AWTException {
    		
        driver.navigate().back();
        driver.navigate().back();

        clickMenu(7);
        driver.findElement(By.xpath("//a[@target='_blank']")).click();

        Robot robot = new Robot();

        typeText(robot, "admin");
        robot.keyPress(KeyEvent.VK_TAB);
        typeText(robot, "admin");
        robot.keyPress(KeyEvent.VK_ENTER);

        closeCurrentTab(robot);
    }

    // ------------------- File Upload & Form -------------------
    private static void handleFileUploadAndForm() {

        clickMenu(8);

        driver.findElement(By.id("fullName")).sendKeys("Kunal");
        driver.findElement(By.id("emailId")).sendKeys("kunal@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Kunal");
        driver.findElement(By.id("mobile")).sendKeys("9876543210");
        driver.findElement(By.id("city")).sendKeys("Pune");

        driver.findElement(By.xpath("//input[@type='file']"))
              .sendKeys("K:\\Selenium\\IloveSelenium.docx");

        driver.findElement(By.id("alert")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    // ------------------- Utility Methods -------------------

    private static void clickMenu(int index) {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//ul[@class='pt-2 pe-1']//li)[" + index + "]"))).click();
    }

    private static void selectAllCheckboxes() {
        List<WebElement> checkboxes =
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.xpath("//input[@type='checkbox']")));

        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }
    }

    private static void acceptAlert() {
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }

    private static void sendTextToPrompt(String text) {
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys(text);
        alert.accept();
    }

    private static void typeText(Robot robot, String text) {
        for (char c : text.toUpperCase().toCharArray()) {
            robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
            robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
        }
    }

    private static void closeCurrentTab(Robot robot) {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }
}
