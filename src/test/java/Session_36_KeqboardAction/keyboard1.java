package Session_36_KeqboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
		Actions act =new Actions(driver);
		WebElement min_slider=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));


		System.out.println(min_slider.getLocation()); //(59, 257)

		act.dragAndDropBy(min_slider, 100,249).perform();











//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500);");



	}


}
