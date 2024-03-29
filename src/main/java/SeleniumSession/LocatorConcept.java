package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// create a webelement + perform action(click, sendkeys, gttext, is
		// displayed....)

		// create a webelement: need a locator

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1.id
		// 1st
//		driver.findElement(By.id("//input[@id='input-email']")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("//input[@id='input-password']")).sendKeys("naveen@123");

		// 2nd:
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//
//		emailId.sendKeys("naveen@gmail.com");
//		password.sendKeys("naveen@123");

		// 3rd: By locator
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//
//		WebElement eid = driver.findElement(emailId);
//		WebElement pwd = driver.findElement(password);
//
//		eid.sendKeys("naveen@gmail.com");
//		pwd.sendKeys("naveen@123");

		// 4th: By locator + generic method
//
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//
//		getElement(emailId).sendKeys("naveen@gmail.com");
//		getElement(password).sendKeys("naveen@123");

		// 5th: By locator + generic method for webelement and actions

//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//
//		doSendKeys(emailId, "naveen@gmail.com");
//		doSendKeys(password, "naveen@123");

		// 6th: By locator + generic method for webelement and actions in a ElemenetUtil
		// class

		By emailId = By.id("input-email");
		By password = By.id("input-password");

		ElementUtil eutil = new ElementUtil(driver);
		eutil.doSendKeys(emailId, "naveen@gmail.com");
		eutil.doSendKeys(password, "naveen@123");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
