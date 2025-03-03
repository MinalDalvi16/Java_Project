package Session_31_Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrap_dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");

		WebElement drop=driver.findElement(By.xpath("//button[@type='button']"));
		drop.click();

		//driver.findElement(By.xpath("//input[@value=\"jQuery\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multisel')]//label"));
		System.out.println(options.size());


		for(WebElement op:options) {
			System.out.println(op.getText());
		}

		driver.close();
	}





}
