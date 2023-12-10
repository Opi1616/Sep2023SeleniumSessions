package Wait_In_Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForJsAlertPopup {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();
		
		

	}
	

	public static Alert waitForAlertPresence(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public static String getAlertText(int timeout) {
		return waitForAlertPresence(timeout).getText();
	}

	public static void acceptAlert(int timeout) {
		waitForAlertPresence(timeout).accept();
	}

	public static void dismissAlert(int timeout) {
		waitForAlertPresence(timeout).dismiss();
	}

	public static void alertSendKeys(int timeout, String value) {
		waitForAlertPresence(timeout).sendKeys(value);
	}

}
