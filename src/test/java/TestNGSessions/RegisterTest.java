package TestNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterTest {
	public WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}

	public void doRegister(String fn, String ln, String email, String phone, String password) {
		driver.findElement(By.id("input-firstname")).sendKeys(fn);
		driver.findElement(By.id("input-lastname")).sendKeys(ln);
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).sendKeys(phone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(password);

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
		doRegister(fn, ln, email, phone, password);
		}

		@AfterTest
		public void tearDown() {
			driver.quit();
		}

}
