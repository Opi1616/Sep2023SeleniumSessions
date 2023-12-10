package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {

	// global preconditions
	// pre condition
	// test cases --> test steps --> act vs exp result --Assertion
	// post steps
	// post global steps

	@BeforeSuite
	public void startDBConnection() {
		System.out.println("BS - startDBCOnnection");
	}

	@BeforeTest
	public void CreateUser() {
		System.out.println("BT - CreateUser");
	}

	@BeforeClass
	public void LauchBrowser() {
		System.out.println("BC - LaunchBrowser");
	}

	@BeforeMethod
	public void LoginToApp() {
		System.out.println("BM - LoginToApp");

	}
	
	@Test
	public void homPageTitleTest() {
		System.out.println("homPageTitleTest");
	}
	
	@Test
	public void homPageSearchTest() {
		System.out.println("homPageTitleTest");
	}

	@AfterMethod
	public void LogOut() {
		System.out.println("AM - LogOut");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC - LogOut");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT - LogOut");
	}
	
	@AfterSuite
	public void disconnectedWithDB() {
		System.out.println("AS - LogOut");
	}

}
