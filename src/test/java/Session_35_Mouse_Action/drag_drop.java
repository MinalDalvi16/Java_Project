package Session_35_Mouse_Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://demoqa.com/droppable");

	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	Actions builder = new Actions(driver);

	WebElement from=driver.findElement(By.id("draggable"));
	WebElement to =driver.findElement(By.id("droppable"));

	builder.dragAndDrop(from, to).perform();

	//verify result text
	String textto=to.getText();

	System.out.println(textto);

//	if(textto.equals("Dropped!")) {
//		System.out.println("Pass");
//	}else {
//		System.out.println("Fail");
//	}
driver.close();

}

}
