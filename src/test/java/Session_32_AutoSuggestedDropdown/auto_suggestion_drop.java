package Session_32_AutoSuggestedDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto_suggestion_drop {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.findElement(By.name("q")).sendKeys("testing");
	Thread.sleep(1000);

	List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
	System.out.println(list.size());


	//print all options from auto suggested dropdown
	for (WebElement element : list) {
		System.out.println(element.getText());
	}

	driver.close();







	}

}
