package Day45;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	@BeforeClass
	
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="dp")
	void testLogin(String email, String pwd)
	{
		
	}
	
	void tearDown()
	{
		
	}
	
	@DataProvider(name="dp")
	Object[][] loginData()
	{
		Object data [][] = { {"abc@gmail.com","test123"},
				             {"xyz@gmail.com","test012"},
				             {"john@gmail.com","test@123"},
				             {"pavanol123@gmail.com","test@123"},
				             {"johncanedy@gmail.com","test"}
				  
				
				
				
		};
		return data ;
	}

}
