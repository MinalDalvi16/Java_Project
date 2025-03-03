package Session_24_XPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {
	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
        search.sendKeys("plant");
	  	driver.findElement(By.xpath("//span[text()='Grocery']")).click();








}
}
