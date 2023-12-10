package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationFields {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		By textField = By.className("form-control");

		List<WebElement> TextFieldList = getElementsList(textField);
		int countTextFiled = TextFieldList.size();
		System.out.println(countTextFiled);
		int count = 1;
		for (WebElement e : TextFieldList) {
			System.out.println(count + ":" + e.getAccessibleName());
			count++;
		}
	}

	public static List<WebElement> getElementsList(By locator) {
		return driver.findElements(locator);
	}

}
