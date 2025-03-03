package session_29_checkbox_alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		// Set the path to your ChromeDriver executable
		//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		// Initialize WebDriver and maximize the window
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// URL with embedded username and password for basic authentication
		driver.get("https://username:password@the-internet.herokuapp.com/basic_auth");

		// Optionally, print the page title to confirm successful login
		System.out.println("Page title: " + driver.getTitle());

		// Close the browser after testing
		//driver.quit();
	}
}
