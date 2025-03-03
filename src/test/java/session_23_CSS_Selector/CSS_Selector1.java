package session_23_CSS_Selector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector1 {

public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://practicetestautomation.com/practice-test-login/");
driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Minal");

//#id name
//=tagname
//.classname
//tag name[attribute='attribute value']


}



}
