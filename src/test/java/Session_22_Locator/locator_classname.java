package Session_22_Locator;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_classname {

public static void main(String[] args) {
WebDriver driver  = new ChromeDriver();

driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.className("inputtext")).sendKeys("test@gmail.com");
driver.findElement(By.name("pass")).sendKeys("test");
driver.close();

}

}
