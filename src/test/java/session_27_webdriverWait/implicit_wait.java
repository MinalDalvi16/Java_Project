package session_27_webdriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://testautomationpractice.blogspot.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	    driver.findElement(By.id("name")).sendKeys("Minal dalvi");
	    driver.findElement(By.id("email")).sendKeys("test@gmail.com");
	    driver.close();

	}

}
