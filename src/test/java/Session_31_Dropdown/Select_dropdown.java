package Session_31_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_dropdown {

public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://testautomationpractice.blogspot.com/");

JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,500);");

WebElement dropdown = driver.findElement(By.id("country"));
Select countrydrop = new Select(dropdown);
//countrydrop.selectByIndex(2);
//countrydrop.selectByValue("United states");
//countrydrop.selectByVisibleText("Japan");

//capture no of options in dropdown
List<WebElement> options= countrydrop.getOptions();
System.out.println("No of options in dropdown " + options.size());

//print all options
for (WebElement option : options) {
	System.out.println(option.getText());
}


driver.close();






}

}
