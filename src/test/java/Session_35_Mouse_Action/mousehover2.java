package Session_35_Mouse_Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class mousehover2 {

public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.meesho.com/?srsltid=AfmBOoo66-PaWOw42qHq9teY85YR3sHRmv5NGAvM_h90HVvbeONYZks2");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement womenEthic = driver.findElement(By.xpath("//span[text()='Women Ethnic']"));
Actions act = new Actions(driver);
act.moveToElement(womenEthic).build().perform();

WebElement allsari=driver.findElement(By.xpath("//p[text()='All Sarees']"));
act.moveToElement(allsari).click().perform();

//Thread.sleep(1000);
//driver.close();




}

}
