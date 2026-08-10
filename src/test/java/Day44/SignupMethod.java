package Day44;

import org.testng.annotations.Test;

public class SignupMethod {
	
	@Test(priority=1,groups= {"regression"})
	void signupbyemail()
	{
		System.out.println("This is sign up email");
	}

	
	@Test(priority=1,groups= {"regression"})
	void signupbyfacebook()
	{
		System.out.println("This is sign up facebook");
		
	}
	
	
	@Test(priority=1,groups= {"regression"})
	void signupbytwitter()
	{
		System.out.println("This is sign up twitter");
	}
}
