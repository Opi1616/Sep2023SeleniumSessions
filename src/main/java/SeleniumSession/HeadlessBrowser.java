package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		// browser is not visible
		// headless -testing is happening behind the same
		// faster than the normal mode
		
		//sanity test cases
		//for the complex html dom - it might not work

		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
