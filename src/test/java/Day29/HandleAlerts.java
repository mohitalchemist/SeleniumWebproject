package Day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		Alert mylert=driver.switchTo().alert();
		System.out.println(mylert.getText());
		mylert.accept();*/
		/*driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss(); //will close alert using cancel button*/
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert myalert=driver.switchTo().alert();
		
		myalert.sendKeys("welcome");
		Thread.sleep(2000);
		myalert.accept();
		driver.quit();
		

	}

}
