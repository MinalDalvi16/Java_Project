package IRCTC;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class test1 {
	
	public static void main (String [] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	//Title
	System.out.println("Title of main page "+ driver.getTitle());
	
	//How many logo
	List<WebElement> logos = driver.findElements(By.tagName("img"));
	System.out.println("No of logo found " + logos.size() );
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
	driver.findElement(By.xpath("//button[normalize-space()='Upgrade']")).click();
	
	driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']//span[1]")).click();
	
	
	
	

	

	
	}

}
