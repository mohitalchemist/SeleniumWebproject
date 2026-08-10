package Day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		WebElement sourceEle = driver.findElement(By.id("angular"));
		WebElement targetEle = driver.findElement(By.id("droparea"));
		Actions act = new Actions(driver);
		act.dragAndDrop(sourceEle, targetEle).build().perform();
		Thread.sleep(5000);

	}

}
