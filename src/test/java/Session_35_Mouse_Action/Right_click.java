package Session_35_Mouse_Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Right_click {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://demoqa.com/buttons");
	WebElement rightclick=driver.findElement(By.xpath("//button[text()='Right Click Me']"));
	Actions act = new Actions(driver);
	act.moveToElement(rightclick).contextClick().perform();

	WebElement resulttext =driver.findElement(By.id("rightClickMessage"));
	System.out.println(resulttext.getText());
	driver.close();








	}

}
