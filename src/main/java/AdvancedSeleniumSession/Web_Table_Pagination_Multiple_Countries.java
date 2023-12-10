package AdvancedSeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table_Pagination_Multiple_Countries {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();

		while (true) {

			if (driver.findElements(By.xpath("//td[text()='Denmark']")).size() > 0) {
				selectMultipleCountry("Denmark");

			}
			// pagination logic:
			WebElement next = driver.findElement(By.linkText("Next"));

			if (next.getAttribute("class").contains("disabled")) {
				System.out.println("pagination is over...country is not  found....");
				break;
			}
			next.click();
			Thread.sleep(1000);

		}

	}

	public static void selectMultipleCountry(String countryName) {
		List<WebElement> checkBoxList = driver.findElements(
				By.xpath("(//td[text()='" + countryName + "'])/preceding-sibling::td/input[@type='checkbox']"));

		for (WebElement e : checkBoxList) {
			e.click();

		}

	}

}
