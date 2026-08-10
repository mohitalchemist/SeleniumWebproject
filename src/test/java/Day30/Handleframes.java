package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleframes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		//driver.switchTo().frame("SingleFrame"); // using iframe name
		driver.switchTo().frame(0); //using iframe index
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//h1[.='Automation Demo Site ']")).getText());
		

	}

}
