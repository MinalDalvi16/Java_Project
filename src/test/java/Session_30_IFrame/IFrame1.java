package Session_30_IFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame1 {

public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//frame1
	WebElement frame1=driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("Test selenium");
	driver.switchTo().defaultContent();

	//frame2
	WebElement frame2=driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
	driver.switchTo().frame(frame2);
	driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("java test");
	driver.switchTo().defaultContent();


	//frame3
	WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame(frame3);
	driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("test test");
	driver.switchTo().defaultContent();






}

}
