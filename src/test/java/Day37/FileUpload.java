package Day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		// single file upload
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\mohit\\OneDrive\\Desktop\\fileupload\\file1.txt");
		if(driver.findElement(By.xpath("//ul[@id='fileList']/li")).getText().equals("file1.txt")) 
		{
			System.out.println("File is successfully uploaded");
		}
		else
		{
			System.out.println("File upload failed");
		}*/
		
		String file1 ="C:\\Users\\mohit\\OneDrive\\Desktop\\fileupload\\file1.txt";
		String file2 = "C:\\Users\\mohit\\OneDrive\\Desktop\\fileupload\\file2.txt";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		int noOfFilesUploaded = driver.findElements(By.xpath("//ul[@id='fileList']/li")).size();
		if(noOfFilesUploaded==2)
		{
			System.out.println("All files are uploaded");
		}
		
		else
		{
			System.out.println("Files are not uploaded");
		}

	}

}
