package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPageTest {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By fName = By.id("input-firstname");
		By lName = By.xpath("//input[@name='lastname']");
		By email = By.id("input-email");
		By Telephone = By.id("input-telephone");
		By pwd = By.id("input-password");
		By cpwd = By.id("input-confirm");
		By submit = By.xpath("//input[@value='Continue']");
		By agree = By.xpath("//input[@name='agree']");

		By accountCreated = By.tagName("h1");

		By orderHistory = By.xpath("(//a[text()='Order History'])[2]");

		doSendKeys(fName, "Vijayar");
		doSendKeys(lName, "Rohiter");
		doSendKeys(email, "Vijay20r@gmail.com");
		doSendKeys(Telephone, "9821485788");
		doSendKeys(pwd, "pwd@12238");
		doSendKeys(cpwd, "pwd@12238");
		doClick(agree);
		doClick(submit);
		doClick(orderHistory);

		String accountVerify = doGetText(accountCreated);
		System.out.println(accountVerify);

		if (accountVerify.contains("Your Account Has Been Created!")) {
			System.out.println("Your Account has been successfully created!");
		} else {
			System.out.println("failed");
		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}

}
