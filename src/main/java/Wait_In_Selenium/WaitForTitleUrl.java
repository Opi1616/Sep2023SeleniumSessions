package Wait_In_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		// driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// driver.findElement(By.linkText("Forgotten Password")).click();

		// String title = driver.getTitle();// loading... cheking...

		// System.out.println(driver.getTitle());

//		String title = WaitForTitleContainsAndFetch(10, "Password?");
//		if (title.contains("Forgot Your Password?")) {
//			System.out.println("PASS");
//		}

		driver.navigate().to("https://www.amazon.com/");
		driver.findElement(By.xpath("(//img[@alt='Shop now'])[1]")).click();
		if (WaitForURLContains(10, "fashion")) {
			System.out.println("url is correct");
		} else {
			System.out.println("url  is in-correct");
		}
	}

	public static String WaitForTitleContainsAndFetch(int timeout, String titleFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.titleContains(titleFractionValue));
		return driver.getTitle();
	}

	public static String WaitForTitleIsAndFetch(int timeout, String titleValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.titleIs(titleValue));
		return driver.getTitle();
	}

	public static boolean WaitForURLContains(int timeout, String urlFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.urlContains(urlFractionValue));

	}

}
