package Day44;

import org.testng.annotations.Test;

public class PaymentsTest {
	
	@Test(priority=1,groups= {"sanity","regression","functional"})
	void paymentinrupee()
	{
		System.out.println("This is payment in rupess");
	}

	@Test(priority=1,groups= {"sanity","regression","functional"})
	void paymentinDollars()
	{
		System.out.println("This is payment in Dollars");
	}
	
	
}
