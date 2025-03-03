package Session_37_javscript_uploadFile;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_page {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		//scroll down page by pixel number
		//js.executeScript("window.scrollBy(0,500);");


		//scroll till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Thread.sleep(5000);

		//scroll upto initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");




	}

}
