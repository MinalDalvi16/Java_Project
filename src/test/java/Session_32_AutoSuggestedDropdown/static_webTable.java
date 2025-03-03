	package Session_32_AutoSuggestedDropdown;

	import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class static_webTable {

		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://testautomationpractice.blogspot.com/");

			JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("window.scrollBy(0,1000);");

	        //find total no of row

	      int rows=  driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	      System.out.println("no of rows=" + rows); //7

	     //driver.navigate

	      //find total no of column

	      int column=driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
	      System.out.println("no of column ="+column);

	     //print specific data from static table
	    List<WebElement> data=  driver.findElements(By.xpath("//table[@name='BookTable']"));

	    for (WebElement element : data) {
	    	System.out.print(element.getText());
	    }
	    System.out.println();

	      driver.close();



		}

	}
