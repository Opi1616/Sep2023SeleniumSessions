package ActionClassesConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActonsClickSendKeys {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By fn = By.id("input-firstname");
		By ln = By.id("input-lastname");
		By continueBtn = By.cssSelector("input[type='submit']");

//		Actions action = new Actions(driver);
//		action.sendKeys(driver.findElement(fn), "naveen").build().perform();
//		action.sendKeys(driver.findElement(ln), "naveen").build().perform();
//		action.click(driver.findElement(continueBtn)).build().perform();

		// ElementNotInteractableException
		// ElementNotInterceptedException
		doActionSendKeys(fn, "Hello");
		doActionSendKeys(ln, "Naveen");
		doActionsClick(continueBtn);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doActionSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();

	}

	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}

}
