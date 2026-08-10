package Day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//capture full page screenshot
		/*TakesScreenshot ts =(TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\ScreenShots\\fullpage.png");
		sourcefile.renameTo(targetfile);*/
		//capture the screenshot of a section
		WebElement featuredProducts=   driver.findElement(By.xpath("//div[@class='blog-posts hfeed']"));
		File sourcefile= featuredProducts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\ScreenShots\\partial.png");
		sourcefile.renameTo(targetfile);
		
		
	}

}
