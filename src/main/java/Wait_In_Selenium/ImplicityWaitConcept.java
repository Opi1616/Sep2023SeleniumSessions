package Wait_In_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWaitConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// global Wait: 10 Secs
		// it will be applied for all the element by default
		// FE -- imp wait will be applied automatically

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("naveen@gmail.com");
	//	driver.findElement(By.xpath("//input[@value='Login']")).click();
		// e4---10
		// e5---10
		// e6---10

		// home page:20secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// global wait: 20 secs
		// e7 e8 e9 -20 secs

		// login page: 20secs --> 10secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// login page: 20secs --> 5secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// only for web element : svg,iframe,wes
		// it does not support non web elements: title, url, alerts-js

		//cy/pw --auto wait
		//cy vs selenium
		
	}

}
