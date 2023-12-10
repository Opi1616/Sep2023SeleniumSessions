package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasic {

	public static void main(String[] args) {

		// 1. open browser: chrome,ff,safri,edge
		// ChromeDriver driver = new ChromeDriver();
		String browser = "chrome";
		WebDriver driver = null;

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("please pass the right browser...");
		}

		// 2.enter the url
		driver.get("https://www.google.com");

		// 3.get the title
		String actTitle = driver.getTitle();
		System.out.println("page title: " + actTitle);

		// 4.validation point/checkpoint:

		if (actTitle.equals("Google")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		// Automation steps + validation/assertions = Automation Testing

		// 5.close the browser
		driver.close();

	}

}
