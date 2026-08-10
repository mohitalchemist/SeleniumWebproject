package Day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriver  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		List<WebElement> hylink=    driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']"));
		System.out.println(hylink.size());
		//System.out.println(hylink);
		for(int i=0;i<hylink.size();i++)
			
			
		{ 
			hylink.get(i).click();
			
		
		}
		
		
		


	}

}
