package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement mouseHover = driver.findElement(By.xpath("//button[@class='dropbtn']"));
		WebElement mobiles = driver.findElement(By.linkText("Mobiles"));
		Actions act = new Actions(driver);
		act.moveToElement(mouseHover).build().perform();

	}

}
