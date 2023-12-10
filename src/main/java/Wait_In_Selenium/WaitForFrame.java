package Wait_In_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrame {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		// waitForFrameAndSwitchToItByIDOrName(10, "main");
		waitForFrameAndSwitchToItByFrameElement(10, driver.findElement(By.xpath("//frame[@src='top.html']")));
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);

	}

	public static void waitForFrameAndSwitchToItByIDOrName(int timeout, String idOrName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
	}

	public static void waitForFrameAndSwitchToItByIndex(int timeout, int frameIndex) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}

	public static void waitForFrameAndSwitchToItByFrameElement(int timeout, WebElement FrameElement) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameElement));
	}

	public static void waitForFrameAndSwitchToItByFrameLocator(int timeout, WebElement FrameLocator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameLocator));
	}

}
