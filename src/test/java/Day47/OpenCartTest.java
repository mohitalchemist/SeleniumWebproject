package Day47;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager; //log4j
import org.apache.logging.log4j.Logger; //log4j

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenCartTest {
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
		switch(br.toLowerCase())
		{
		case "chrome" : driver = new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;
		case " firefox": driver = new FirefoxDriver();  break;
		default : System.out.println("Invalid browser name...."); return;
		}
		//logger.info("***page launched");
		//driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja.com/demo/");//driver.get(p.getProperty("appURL2");
		driver.manage().window().maximize();
		//logger.info("***Title displayed");
		System.out.println(driver.getTitle());
	
	}
	@AfterClass
	void teardown()
	{
		driver.close();
	}
		
		
	}