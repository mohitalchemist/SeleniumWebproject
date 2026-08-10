package Day2;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/feature");
		driver.manage().window().maximize();
		driver.findElement(By.name("search")).sendKeys("Mac");
		boolean logoDisplaystatus= driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logoDisplaystatus);
		driver.findElement(By.linkText("Tablets")).click();
		List<WebElement> headerlinks = driver.findElements(By.className("list-inline-item"));
		headerlinks.size();
		

	}

}
