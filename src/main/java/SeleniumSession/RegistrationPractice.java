package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPractice {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		// 1.
//		driver.findElement(By.id("input-firstname")).sendKeys("arprita");
//		driver.findElement(By.id("input-lastname")).sendKeys("shukla");
//		driver.findElement(By.id("input-email")).sendKeys("arprita@gmail.com");
//		driver.findElement(By.id("input-telephone")).sendKeys("9887888");
//		driver.findElement(By.id("input-password")).sendKeys("Arprita@123");
//		driver.findElement(By.id("input-confirm")).sendKeys("Arprita@123");

		// 2.

//		WebElement firstName = driver.findElement(By.id("input-firstname"));
//		WebElement lastName = driver.findElement(By.id("input-lastname"));
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement telephone = driver.findElement(By.id("input-telephone"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		WebElement confirmPwd = driver.findElement(By.id("input-confirm"));

//		firstName.sendKeys("arprita");
//		lastName.sendKeys("shukla");
//		emailId.sendKeys("arprita@gmail.com");
//		telephone.sendKeys("9887888");
//		password.sendKeys("Arprita@123");
//		confirmPwd.sendKeys("Arprita@123");

//		// 3.By Locator
//		By firstName = By.id("input-firstname");
//		By lastName = By.id("input-lastname");
//		By emailId = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By password = By.id("input-password");
//		By confirmPwd = By.id("input-confirm");
//
//		WebElement fName = driver.findElement(firstName);
//		WebElement lName = driver.findElement(lastName);
//		WebElement eId = driver.findElement(emailId);
//		WebElement tphone = driver.findElement(telephone);
//		WebElement pwd = driver.findElement(password);
//		WebElement cPwd = driver.findElement(confirmPwd);
//
//		fName.sendKeys("arprita");
//		lName.sendKeys("shukla");
//		eId.sendKeys("arprita@gmail.com");
//		tphone.sendKeys("9887888");
//		pwd.sendKeys("Arprita@123");
//		cPwd.sendKeys("Arprita@123");

		// 4th: By locator + generic method

//		By firstName = By.id("input-firstname");
//		By lastName = By.id("input-lastname");
//		By emailId = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By password = By.id("input-password");
//		By confirmPwd = By.id("input-confirm");

//		getElemenet(firstName).sendKeys("arprita");
//		getElemenet(lastName).sendKeys("shukla");
//		getElemenet(emailId).sendKeys("arprita@gmail.com");
//		getElemenet(telephone).sendKeys("9887888");
//		getElemenet(password).sendKeys("Arprita@123");
//		getElemenet(confirmPwd).sendKeys("Arprita@123");

		// 5th : By locator + genric method +action method

//		By firstName = By.id("input-firstname");
//		By lastName = By.id("input-lastname");
//		By emailId = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By password = By.id("input-password");
//		By confirmPwd = By.id("input-confirm");

//		doSendKeys(firstName, "arprita");
//		doSendKeys(lastName, "shukla");
//		doSendKeys(emailId, "arprita@gmail.com");
//		doSendKeys(telephone, "9887888");
//		doSendKeys(password, "Arprita@123");
//		doSendKeys(confirmPwd, "Arprita@123");

		// 6th : By locator + generic method for webelement and actions in a
		// ElemenetUtil class

		ElementUtil eutil = new ElementUtil(driver);

		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailId = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPwd = By.id("input-confirm");

		eutil.doSendKeys(firstName, "arprita");
		eutil.doSendKeys(lastName, "shukla");
		eutil.doSendKeys(emailId, "arprita@gmail.com");
		eutil.doSendKeys(telephone, "9887888");
		eutil.doSendKeys(password, "Arprita@123");
		eutil.doSendKeys(confirmPwd, "Arprita@123");

	}

	public static WebElement getElemenet(By locator) {
		return driver.findElement(locator);

	}

	public static void doSendKeys(By locator, String value) {
		getElemenet(locator).sendKeys(value);

	}

}
