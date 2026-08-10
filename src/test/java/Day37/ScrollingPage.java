package Day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		// JS ELEMENT IS VISIBLE
		//WebElement ele = driver.findElement(By.xpath("//td[text()='Venezuela']"));
		
		//js.executeScript("window.scrollBy(0,3000)","");
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		//System.out.println(js.executeScript("return window.pageYoffset)");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYoffset;"));
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		

	}

}
