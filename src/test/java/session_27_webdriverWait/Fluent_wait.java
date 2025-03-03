package session_27_webdriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_wait {

public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();


    //fluent wait declaration

    Wait<WebDriver> mywait = new FluentWait<>(driver)
    		.withTimeout(Duration.ofSeconds(30))
    		.pollingEvery(Duration.ofSeconds(5))
    		.ignoring(NoSuchElementException.class);  //declaration of fluent wait

    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();

    WebElement textusername = mywait.until(new Function <WebDriver , WebElement>(){
    @Override
	public WebElement apply(WebDriver driver) {
    return driver.findElement(By.xpath("//input[@name='username']"));
    	}
    });

    textusername.sendKeys("Admin");





}

}
