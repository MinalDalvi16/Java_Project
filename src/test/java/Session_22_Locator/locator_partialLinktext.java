package Session_22_Locator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_partialLinktext {

public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://practicetestautomation.com/practice-test-login/");
driver.findElement(By.partialLinkText("Practice")).click();
driver.close();



}

}
