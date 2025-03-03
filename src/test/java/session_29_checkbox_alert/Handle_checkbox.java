package session_29_checkbox_alert;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_checkbox {

public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");

	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500);");

	//single checkbox
	driver.findElement(By.id("sunday")).click();

	//select all checkbox
	List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

//	for(int i=0; i<checkbox.size();i++) {
//		checkbox.get(i).click();
//	}

	//enhanced for loop
	/*for(WebElement checkboxes:checkbox) {
		checkboxes.click();
	}*/


	//last 3 checkboxes
	for(int i=4; i<checkbox.size(); i++) {
		checkbox.get(i).click();
	}

	//driver.close();



}

}
