package TestNGTraining;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("This is the Before suite");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("This is the after suite");
	}
	
	
	
	@BeforeTest
	public void beforetest() {
		System.out.println("This is the Before test");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("This is the after test");
	}
@BeforeMethod
public void beforemethod() {
	System.out.println("This is the Before method");
}
@AfterMethod
public void aftermethod() {
	System.out.println("This is the Aftermethod");
}
@Test(priority=2)
	public void Automation1() {
		System.out.println("This is the Automation1");
	}

	@Test(priority=1)
	public void Automation2() {
		System.out.println("This is the Automation2");
	}
	@Test
	public void Automation3() {
		System.out.println("This is the Automation3");
	}

}
