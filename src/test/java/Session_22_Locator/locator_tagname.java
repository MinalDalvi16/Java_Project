package Session_22_Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class locator_tagname {

public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://practicetestautomation.com/practice-test-login/");
driver.manage().window().maximize();

WebElement usernameField = driver.findElement(By.tagName("input"));
usernameField.sendKeys("student");

WebElement passwordField = driver.findElement(By.tagName("input"));
passwordField.sendKeys("Password123");

WebElement submitButton = driver.findElement(By.tagName("button"));
submitButton.click();

driver.close();


}

}
