package Day39;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import sun.net.www.protocol.http.HttpURLConnection;

public class BrokenLink {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+links.size());
		int noOfBrokenLinks = 0;
		for(WebElement linkElement : links)
		{
			String hrefattValue =linkElement.getAttribute("href");
			
			if(hrefattValue==null || hrefattValue.isEmpty())
			{
				System.out.println("Not possible to check");
				continue;
			}
			try
			{
			URL linkURL = new URL(hrefattValue);
			HttpURLConnection conn =(HttpURLConnection) linkURL.openConnection();
			conn.connect();
			if(conn.getResponseCode()>=400)
			{
				System.out.println("Broken link");
				noOfBrokenLinks++;
				
			}
			
			else
			{
				System.out.println("Not a broken link");
			}
		}
		
		catch(Exception e)
		{
			
		}

	}
		System.out.println("Number of broker link:"+noOfBrokenLinks);

}
}
