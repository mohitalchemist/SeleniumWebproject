package Day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		WebElement min_slider = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
		System.out.println("Location of the min slider: "+ min_slider.getLocation());
		Actions act = new Actions(driver);
		act.dragAndDropBy(min_slider, 100, 250).perform();
		System.out.println("Location of the min slider after moving: "+ min_slider.getLocation());
		//WebElement max_slider = driver.findElement(By.xpath("//div[@id='slider-range']/span[2]"));
		//System.out.println("Location of the max slider: "+ max_slider.getLocation());
		//act.dragAndDropBy(max_slider, -300, 250).perform();
		//System.out.println("Location of the min slider after moving: "+ max_slider.getLocation());
		
		
	}

}
