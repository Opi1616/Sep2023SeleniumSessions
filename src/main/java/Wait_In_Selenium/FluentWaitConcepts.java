package Wait_In_Selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcepts {
	static WebDriver driver;
	public static void main(String[] args) {

		// WebDriverWait ---> FluentWait ----> Wait
		 driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		By FreeTrial = By.xpath("//a[text()='Free trial']");
		waitForElementPresenceWithFluentWait(10, 2, FreeTrial).click();
		
		
	}
	
	public static WebElement waitForElementPresenceWithFluentWait(int timeout,int pollingTime,By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.withMessage("element is not found on the page....");

		 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	public static void waitForAlertWithFluentWait(int timeout,int pollingTime,By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.ignoring(NoAlertPresentException.class)
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.withMessage("..Alert is not found on the page....");

		  wait.until(ExpectedConditions.alertIsPresent());
		
	}

}
