package Wait_In_Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindow {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		ElementUtil eleUtil = new ElementUtil(driver);

		By twitter = By.xpath("//a[contains(@href,'twitter')]");
		eleUtil.ClickWhenReady(twitter, 10);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		String parentWindowId = it.next();
		System.out.println("parent window id: " + parentWindowId);

		String childWinowId = it.next();
		System.out.println("child window id: " + childWinowId);

		//switching to window:
		driver.switchTo().window(childWinowId);
		System.out.println("child window url: "+driver.getCurrentUrl());
		
		driver.close();//close the child window
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url: "+driver.getCurrentUrl());		
	}

}
