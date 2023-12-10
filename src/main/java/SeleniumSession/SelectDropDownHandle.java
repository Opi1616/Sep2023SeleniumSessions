package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");

		// WebElement country_ele = driver.findElement(Country);

		// dropdown -- htmltag ==> <select>
		// use select class in selenium

//		Select select = new Select(country_ele);
//		// select.selectByIndex(5);
//		// select.selectByValue("Austria");
//		select.selectByVisibleText("Bahrain");

		By Country = By.id("Form_getForm_Country");
		doSelectDropDownByIndex(Country, 7);
		Thread.sleep(5000);
		doSelectDropDownByValue(Country, "Benin");
		Thread.sleep(5000);
		doSelectDropDownByVisibleText(Country, "India");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectDropDownByValue(By locator, String Value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(Value);
	}

	public static void doSelectDropDownByVisibleText(By locator, String VisibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(VisibleText);
	}

}
