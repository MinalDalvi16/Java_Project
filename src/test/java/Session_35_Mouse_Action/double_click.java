package Session_35_Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/buttons");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500);");

        WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
        Actions act = new Actions(driver);
        act.moveToElement(doubleclick).doubleClick().perform();

        WebElement resultText = driver.findElement(By.id("doubleClickMessage"));
        System.out.println("Text after double click: " + resultText.getText());


        driver.close();
    }
}
