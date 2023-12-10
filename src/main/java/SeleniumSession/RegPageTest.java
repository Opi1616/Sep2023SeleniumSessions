package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) {
		String browserName = "edge";
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.intiDriver(browserName);
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = brUtil.gtPageTitle();
		System.out.println(title);

		// by locators: OR
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By ConPassword = By.id("input-confirm");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "Vijay");
		eleUtil.doSendKeys(lastName, "Singh");
		eleUtil.doSendKeys(email, "Amrita@gmail.com");
		eleUtil.doSendKeys(telephone, "9822564896");
		eleUtil.doSendKeys(password, "Amrita@123");
		eleUtil.doSendKeys(ConPassword, "Amrita@123");

	}

}
