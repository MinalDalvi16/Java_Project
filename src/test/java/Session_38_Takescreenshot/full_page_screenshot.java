package Session_38_Takescreenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class full_page_screenshot {
	
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("https://demo.nopcommerce.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//1. capture full page screenshot
	TakesScreenshot ts = (TakesScreenshot) driver;
	
	File sourcefile=ts.getScreenshotAs(OutputType.FILE);
	
	File destinationfile =new File(System.getProperty("user.dir")+"\\Screenshot\\s1.png");
	
	//copy sourcefile into our location 
	sourcefile.renameTo(destinationfile);
	
	
	
	
	
	
	}

}
