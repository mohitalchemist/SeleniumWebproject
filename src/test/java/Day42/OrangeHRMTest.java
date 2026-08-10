package Day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMTest {
	
	WebDriver driver = new ChromeDriver();
  
	@Test(priority =1)
	
	void openApp()
	{
		//WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	@Test (priority =2)
	void testLogo()
	{
		System.out.println(driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed());
	}
	@Test(priority =3)
	void testLogin()
	
	{  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	
	@Test (priority =4)
	void testLogout()
	{
		driver.quit();
	}
	
	
	
	
}
