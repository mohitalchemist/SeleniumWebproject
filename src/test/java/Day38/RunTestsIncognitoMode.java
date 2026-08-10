package Day38;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RunTestsIncognitoMode {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito"); //execution in incognito mode
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://text-compare.com/");
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL);
		
		driver.quit();

	}

	}


