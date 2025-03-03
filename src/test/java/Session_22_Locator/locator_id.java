package Session_22_Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class locator_id {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://practicetestautomation.com/practice-test-login/");
driver.findElement(By.id("username")).sendKeys("student");
driver.findElement(By.id("password")).sendKeys("Password123");
driver.findElement(By.id("submit")).click();
driver.close();

}

}
