package AdvancedSeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandleOpe {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String PWID = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("https://www.google.com");
		System.out.println("child window title: " + driver.getTitle());

		driver.close();
		driver.switchTo().window(PWID);
		System.out.println("parent window title: " + driver.getTitle());

		// random pop up: can't be handled
		// QA/Stage/test --block these pop ups
		
		
	}

}
