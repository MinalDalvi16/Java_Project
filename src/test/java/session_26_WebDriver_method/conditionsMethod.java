package session_26_WebDriver_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionsMethod {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("demo.nopcommerce.com/register?returnUrl=%2F");

    //isDisplayed
    boolean logostatus = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]")).isDisplayed();
    System.out.println(logostatus);

    //isEnabled
  //  driver.findElement(By.xpath("//a[text()='Register']")).click();
    boolean enable=driver.findElement(By.id("FirstName")).isEnabled();
    System.out.println(enable);

    driver.close();

}

}
