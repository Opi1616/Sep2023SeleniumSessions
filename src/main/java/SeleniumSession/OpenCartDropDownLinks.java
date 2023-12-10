package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartDropDownLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By dropdown = By.xpath("//div[@class='col-sm-3']/ul/li/a");

		List<String> rightEleList = getAttributeList(dropdown);
		System.out.println(rightEleList);

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);

	}

	public static List<String> getAttributeList(By locator) {
		List<String> eleArrayList = new ArrayList<String>();
		List<WebElement> elementList = getElements(locator);
		System.out.println(elementList.size());

		for (WebElement e : elementList) {
			eleArrayList.add(e.getText());
		}
		return eleArrayList;

	}

}
