package Session_37_javscript_uploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_files {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");

		driver.findElement(By.xpath("//input[@name=\"filesToUpload\"]")).sendKeys("C:\\Users\\ADMIN\\Documents\\KYC Doc\\test.jpeg");

		if(driver.findElement(By.xpath("ul[id='fileList'] li")).getText().equals("test.jpeg")) {
			System.out.println("file correct");
		}else {
			System.out.println("file is incorrect");
		}


	}

}
