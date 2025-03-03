package Session_37_javscript_uploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_click {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		//sendkeys method
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));

		//javaScriptExecutor sendkeys
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Minal')",name);

		//JavascriptExecutor click
		WebElement button=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()",button);

		//scroll down



	}

}
