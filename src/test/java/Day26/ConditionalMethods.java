package Day26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		driver.manage().window().maximize();
	    System.out.println(driver.findElement(By.xpath("//input[@value='male']")).isEnabled());
	    System.out.println(driver.findElement(By.xpath("//input[@value='male']")).isSelected());
	    driver.findElement(By.xpath("//input[@value='male']")).click();
	    System.out.println(driver.findElement(By.xpath("//input[@value='male']")).isSelected());
	    

	}

}
