package Session_35_Mouse_Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltip {

public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://demoqa.com/tool-tips/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(3));
	WebElement tooptipbutton=driver.findElement(By.id("toolTipButton"));
	Actions act =new Actions(driver);
	act.moveToElement(tooptipbutton).build().perform();
	String tooltipText = tooptipbutton.getText();
	System.out.println(tooltipText);

	//Verification if tooltip text is matching expected value
			if(tooltipText.equalsIgnoreCase("Hover me to see")){
				System.out.println("Pass : Tooltip matching expected value");
				}
			else{
				System.out.println("Fail : Tooltip NOT matching expected value");
			}
	driver.close();
}

}
