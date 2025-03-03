package session_26_WebDriver_method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowHandle1 {


	    public static void main(String[] args) throws InterruptedException {

	    ChromeOptions options =new ChromeOptions();
	    options.addArguments("disable-notifications");

	    WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/train-search");

      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.findElement(By.xpath("//div[@class='row col-sm-12 h_head1']//strong[contains(text(),'DAILY DEALS')]")).click();

    //  String parentwindow=driver.getWindowHandle();
    //  Set<String> allwindow=driver.getWindowHandles();

     driver.findElement(By.xpath("//a[text()=' HELP & SUPPORT ']")).click();






	}
}
