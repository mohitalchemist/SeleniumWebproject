package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

public class DatePickerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String requiredYear ="2021";
		String requiredMonth = "Jun";
		String requiredDate ="15";
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		WebElement selectMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select selectMonthDropd = new Select(selectMonth);
		selectMonthDropd.selectByContainsVisibleText(requiredMonth);
		WebElement selectYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectYearDropd = new Select(selectYear);
		selectYearDropd.selectByVisibleText(requiredYear);
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr//a"));
		for(WebElement dt:dates)
		{
			if(dt.getText().equals(requiredDate))
			{
				dt.click();
				break;
			}

	

}
}
}