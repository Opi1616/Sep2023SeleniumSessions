package TestNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest {

	public WebDriver driver;

	public boolean doLogin(String userName, String password) {
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		String errorMesg = driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		System.out.println(errorMesg);
		if (errorMesg.contains("No match for E-Mail Address and/or Password")) {
			return true;
		}

		return false;
	}

	public void doRegister(String fn,String ln,String email,String phone,String password) {
		driver.findElement(By.id("input-firstname")).sendKeys(fn);
		driver.findElement(By.id("input-lastname")).sendKeys(ln);
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).sendKeys(phone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(password);

	
	
	}
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	@DataProvider
	public Object[][] getLoginNegativeData() {
		return new Object[][] { { "abcccc@gmail.com", "test@1233" }, { "abcccc21@gmail.com", "tet@1233" },
				{ "", "test@1233" }, { "test@gmail.com", "" } };
	}

	@Test(dataProvider = "getLoginNegativeData")
	public void loginTest(String userName, String password) {
		boolean flag = doLogin(userName, password);
		Assert.assertTrue(flag);

	}

	@DataProvider
	public Object[] [] getRegTestData(){
		return new Object[][] {
			{"Heena","Vaghla", "heena@gmail.com","989045098","heena@123"},	
			{"Vinutha","Ravindra", "Vinu@gmail.com","989045098","Vinu@123"},	
		};
	}
	
	
	@Test(dataProvider ="getRegTestData")
	
public void registerTest(String fn,String ln,String email,String phone,String password) {
		
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
