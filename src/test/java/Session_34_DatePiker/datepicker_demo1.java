package Session_34_DatePiker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker_demo1 {


	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");

		//1. using sendkeys method
		//driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//input[@class=\"hasDatepicker\"]")).sendKeys("03/02/2025");

		//2. Using date picker element
		String year ="2025";
		String month ="May";
		String date="15";

		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();





	}

}
