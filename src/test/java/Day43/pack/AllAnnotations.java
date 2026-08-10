package Day43.pack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class AllAnnotations {
	
	@BeforeSuite
	void bs()
	{
		System.out.println("This is before suite method...");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("This is after suite method...");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("This is before test method...");
	}
	
	@BeforeSuite
	void at()
	{
		System.out.println("This is after test method...");
	}
	
	@BeforeClass
	void bc()
	{
		System.out.println("This is before class method...");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("This is after class method...");
	}

}
