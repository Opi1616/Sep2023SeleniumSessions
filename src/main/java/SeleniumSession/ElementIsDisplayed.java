package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By img = By.className("img-responsive");

		boolean imgdisplayed = is_Displayed(img);
		System.out.println(imgdisplayed);

		By search = By.xpath("//input[@placeholder='Search']");
		By searchButton = By.xpath("//button[@class='btn btn-default btn-lg']");
		boolean searchBar = is_Displayed(search);
		if (searchBar) {
			System.out.println(searchBar);
			doSendKeys(search, "iphone");
			doClick(searchButton);

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

	public static boolean is_Displayed(By locator) {
		return getElement(locator).isDisplayed();
	}

}
