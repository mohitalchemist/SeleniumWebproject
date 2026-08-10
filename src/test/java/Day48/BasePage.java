package Day48;


import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.apache.logging.log4j.LogManager; //log4j
import org.apache.logging.log4j.Logger; //log4j
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasePage {
//public Logger logger;
public Properties p;

	WebDriver driver;
	@Test
	@Parameters({"os","browser"})
	void AppPage(String os, String br) throws IOException
	{
		
		FileReader file =  new FileReader("./src//test/resources//config.properties");
		p= new Properties();
		p.load(file);
		//logger = LogManager.getLogger(this.getClass());
		if(p.getProperty("execution_env").equalsIgnoreCase("local"))
		{
			DesiredCapabilities capabilities = new DesiredCapabilities();
			if(os.equalsIgnoreCase("windows"))
					{
			capabilities.setPlatform(Platform.WIN11);
					}
			else
			{
				System.out.println("No matching os");
				return;
			}
			switch(br.toLowerCase())
			{
			case "chrome": capabilities.setBrowserName("chrome"); break;
			case "edge": capabilities.setBrowserName("MicrosoftEdge"); break;
			default: System.out.println("No matching browsser"); return;
			}
			
		}
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities capabilities = new DesiredCapabilities();
			if(os.equalsIgnoreCase("windows"))
					{
			capabilities.setPlatform(Platform.WIN11);
					}
			else
			{
				System.out.println("No matching os");
				return;
			}
			switch(br.toLowerCase())
			{
		case "chrome" : driver = new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;
		case " firefox": driver = new FirefoxDriver();  break;
		default : System.out.println("Invalid browser name...."); return;
		}
			driver = new RemoteWebDriver(new URL("http://192.168.0.103:4444/ui/"),capabilities);
		}
		//logger.info("***page launched");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja.com/demo/");//driver.get(p.getProperty("appURL2");
		driver.manage().window().maximize();
		//logger.info("***Title displayed");
		System.out.println(driver.getTitle());
	
	}
/*	@AfterClass
	void teardown()
	{
		driver.quit();
	}*/
		
		
	}