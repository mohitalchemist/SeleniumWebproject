package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		WebDriver  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		
		driver.manage().window().maximize();
		
		Set<String> windowIDs=   driver.getWindowHandles();
		//approach1
		/*List<String> windowList = new ArrayList(windowIDs);
		String parentID = windowList.get(0);
		String ChildID = windowList.get(1);
		driver.switchTo().window(ChildID);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());*/
		//approach2
		for (String winID:windowIDs)
		{
			String title =driver.switchTo().window(winID).getTitle();
			if(title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}
		}
		

	}

}
