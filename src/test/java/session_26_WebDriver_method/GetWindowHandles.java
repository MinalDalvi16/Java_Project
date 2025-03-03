package session_26_WebDriver_method;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetWindowHandles {

    public static void main(String[] args) {
        // Set up ChromeDriver and maximize the browser window
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Set an implicit wait for the elements to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Click on the link that opens a new window/tab
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        // Get the parent window handle
        String parentId = driver.getWindowHandle();

        // Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();

        // Switch to the child window (the new window opened)
        for (String handle : windowHandles) {
            if (!handle.equals(parentId)) {
                driver.switchTo().window(handle);
                break;  // Only switch to the first child window (if there's only one)
            }
        }

        // Wait for the dropdown element to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement drop = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='locale']")));

        // Select an option from the dropdown
        Select dropdown = new Select(drop);
        dropdown.selectByIndex(1);  // Select the second option (index 1)

        // Optional: close the child window after interacting with it
        driver.close();

        // Switch back to the parent window to perform further actions
        driver.switchTo().window(parentId);

        // Perform actions in the parent window (if necessary)

        // Optionally, quit the driver and close all windows
        driver.quit();
    }
}
