package Day44;

import org.testng.annotations.Test;

public class LoginTests {

	
	@Test(priority=1,groups= {"sanity"})
	void loginByEmail()
	{
		System.out.println("This is login in by email ");
	}
	
	@Test(priority=1,groups= {"sanity"})
	void loginByFacebook()
	{
		System.out.println("This is login in by facebook");
	}
	@Test(priority=1,groups= {"sanity"})
	void loginByTwitter()
	{
		System.out.println("This is login in by twitter ");
	}
	
	
	
}
