package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLink {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Naveen automation labs");
		Thread.sleep(3000);
		By suggetion = By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span");
		String suggestionMesg = "naveen automation labs github";
		doSearch(suggetion, suggestionMesg);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void doSearch(By locator, String sugestion) {
		List<WebElement> suggesList = getElements(locator);
		System.out.println(suggesList.size());

		for (WebElement e : suggesList) {
			String text = e.getText();
			if (text.length() > 0) {
				System.out.println(text);
			}
			if (text.contains(sugestion)) {
				e.click();
				break;
			}
		}
	}

}
