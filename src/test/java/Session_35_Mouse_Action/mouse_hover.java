package Session_35_Mouse_Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouse_hover {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");
        driver.navigate().refresh();  // Refresh the page
        Thread.sleep(2000);

        // Wait for elements to load before interacting
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement lan = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='icp-nav-link-inner']")));

        Actions act = new Actions(driver);
        act.moveToElement(lan).build().perform();
        System.out.println("Done Mouse hover on 'country' from Menu");

        // Wait for the Marathi language element and click
        WebElement languagemarathi = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='nav-flyout-icp']//span[contains(@dir,'ltr')][contains(text(),'मराठी')]")));
        act.moveToElement(languagemarathi).click().perform();

        Thread.sleep(2000);  // Wait before next action

        // Wait for the Hindi language element and click
        WebElement languageHindi = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='nav-flyout-icp']//span[contains(@dir,'ltr')][contains(text(),'हिन्दी')]")));
        act.moveToElement(languageHindi).click().perform();


    }
}
