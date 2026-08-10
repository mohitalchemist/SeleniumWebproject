package Day38;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessTesting {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new"); //setting for headless mode of execution
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\mohit\\OneDrive\\Desktop\\fileupload\\file1.txt");
		if(driver.findElement(By.xpath("//ul[@id='fileList']/li")).getText().equals("file1.txt"))
		{
			System.out.println("File uploaded sucessfully");
		}
		else
		{
			System.out.println("File upload failed");
		}
		
		driver.quit();

	}

	}


