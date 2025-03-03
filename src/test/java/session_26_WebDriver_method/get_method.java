package session_26_WebDriver_method;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_method {

	public static void main(String[] args) {
	WebDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//get url
	driver.get("https://demo.opencart.com/");

	//fetch title
	String title = driver.getTitle();
	System.out.println("Title "+ title);

	//current url
	String url = driver.getCurrentUrl();
	System.out.println("current url "+ url);

	//page source
	String pagesource = driver.getPageSource();
	System.out.println(pagesource);

	driver.close();


	}

}
