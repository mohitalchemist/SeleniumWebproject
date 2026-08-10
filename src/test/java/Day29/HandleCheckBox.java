package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		//System.out.println(driver.findElement(By.xpath("//input[@id='sunday']")).isSelected());
		
		List<WebElement> checkboxes=  driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		*/
		/*for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}*/
		//select last three check boxes
		/*for(int i= 4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		//select first three check boxes
		/*for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click(); 
		}*/
		//unselect checkboxes if they are selected
		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		Thread.sleep(5000);
		for(int i=0;i<3;i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
		}
		//driver.quit();
		

	}

}
