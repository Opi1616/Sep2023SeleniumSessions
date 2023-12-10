package AdvancedSeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement fn = driver.findElement(By.id("input-email"));
		fn.sendKeys("naveen@gmail.com");
		Thread.sleep(5000);

		driver.navigate().refresh();

		fn.sendKeys("gurujeet@gmail.com");

	}

}
