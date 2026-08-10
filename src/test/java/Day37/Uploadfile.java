package Day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
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

	}

}
