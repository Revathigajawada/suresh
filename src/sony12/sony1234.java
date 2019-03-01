package sony12;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sony1234{
	@BeforeClass
	public static void login()
	{
		System.out.println("Logging In...");
	}
	@AfterClass
	public static void logout()
	{
		System.out.println("Logging out...");
	}
	@Test
	public void method3()
	{
		
		Assert.assertEquals(11, 11);
		System.out.println("Method3");
	}
	@Test
	public void method4()
	{
		Assert.assertEquals(11, 11);
		System.out.println("Method4");
	}
}

