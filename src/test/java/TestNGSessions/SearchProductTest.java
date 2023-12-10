package TestNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchProductTest {
	public WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}

	public void doSearch(String productBrand, String productName) {
		driver.findElement(By.cssSelector(".form-control")).sendKeys(productBrand);
		driver.findElement(By.cssSelector(".btn.btn-default.btn-lg")).click();
		driver.findElement(By.xpath("//a[text()='" + productName + "']")).click();
		driver.findElement(By.cssSelector(".form-control")).clear();

	}
	
	@DataProvider
	public Object[] [] getSearchTestData(){
		return new Object[][] {
			{"Samsung","Samsung SyncMaster 941BW"},	
			{"Sony","Sony VAIO"},
			{"apple","Apple Cinema 30\""},
			
		};
	}
	
	@Test(dataProvider ="getSearchTestData")
	public void registerTest(String productBrand, String productName) {
		doSearch(productBrand, productName);
		
	   }

	@AfterTest
	public void tearDown() {
		driver.quit();
	   }
}
