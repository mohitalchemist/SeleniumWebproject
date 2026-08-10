package Day36;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Set<String> windowsid=driver.getWindowHandles();
		List<String> windowList = new ArrayList(windowsid);
		String parentid = windowList.get(0);
		driver.switchTo().window(parentid);
		String childid= windowList.get(1);
		
		

	}

}
