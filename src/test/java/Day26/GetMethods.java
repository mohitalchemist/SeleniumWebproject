package Day26;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//get window handle -->single brower windows
		
		/*String windhand=driver.getWindowHandle();
		System.out.println(windhand);*/
		Thread.sleep(5000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windows =driver.getWindowHandles(); //set collection is unique
		
		System.out.println(windows);
		//Conditional methods -> is Displayed, isEnabled, isSeleted-returns boolean value(true/false)
		
		
		
		
	}

}
