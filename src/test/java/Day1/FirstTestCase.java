package Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		
		System.out.println("this is for testing");
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String act_title = driver.getTitle();
		if(act_title.equals("Your Store"))
		{
			System.out.println("Test passed");
		}
		
		else
		{
			System.out.println("Test failed");
		}

	}

}
