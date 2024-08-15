package TestNGTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;
public class logintest {
	WebDriver driver;
	@BeforeTest
	
	@BeforeMethod
	
	public  void beforeMethod() {
		if(driver==null) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
	}
	}
	
	@Test
	@Parameters({"username"})
	public void loginappwithvaliduser (String username) throws InterruptedException {
		// when we use before method all the activities given under the before method
		// get executed
		// before each test

		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		// driver.get("https://selenium-prd.firebaseapp.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("email_field")).sendKeys(username);
	}
	
	@AfterMethod
	public void aftermethod() {
        driver.close();
        driver=null;
	}
	
	@Test
	public void loginappwithinvaliduser() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("email_field")).sendKeys("admin1234@gmail.com");

	}





}