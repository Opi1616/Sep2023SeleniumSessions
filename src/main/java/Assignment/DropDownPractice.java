package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		By dropDown = By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select");

		getSelectByIndex(dropDown, 5);
		Thread.sleep(5000);
		getSelectByValue(dropDown, "CXR");
		Thread.sleep(5000);
		getSelectByVisibleText(dropDown, "India");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void getSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void getSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public static void getSelectByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

}
