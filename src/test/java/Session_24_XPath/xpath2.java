package Session_24_XPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath2 {
	public static void main(String[] args) {

	WebDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("da");
	driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
	driver.findElement(By.xpath("//i[@class='oxd-icon bi-stopwatch']")).click();
	driver.navigate().back();
	driver.navigate().refresh();
	driver.close();




}
}
