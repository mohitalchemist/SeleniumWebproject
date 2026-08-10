package Day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		WebDriver  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		int row=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(row);
		int col= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(col);
		int sum =0;
		//System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]")).getText());
		//System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]/td[3]")).getText());
		/*for(int r=2;r<=row;r++)
		{
			for(int c=1;c<=col;c++)
			{
				System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText());
				System.out.print("   ");
			}
			
		System.out.println();
		}*/
		
		/*for (int i=2;i<=row;i++)
		{
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[2]")).getText();
			if(authorName.equals("Mukesh"))
			{
				System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[1]")).getText());
			}*/
		
	for(int i=2;i<=row;i++)
	{
		System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[4]")).getText());
		String s = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[4]")).getText();
		sum = sum+Integer.valueOf(s);

	}
	
	System.out.println("Sum of values :"+sum);

}

}