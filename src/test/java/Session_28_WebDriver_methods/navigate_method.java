package Session_28_WebDriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_method {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

	    driver.manage().window().maximize();
	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	    driver.navigate().refresh();
	    driver.navigate().back();
	    driver.navigate().forward();



}
}
