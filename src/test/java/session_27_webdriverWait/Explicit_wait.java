package session_27_webdriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();


	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	    WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));//declartion explicit wait
	    WebElement user=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
	    user.sendKeys("Admin");


	   // driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");




	    //driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();



	    driver.close();

	}

}
