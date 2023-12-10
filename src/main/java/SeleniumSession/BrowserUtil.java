package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	private WebDriver driver;

	/**
	 * This method is used to initialize the driver on the basis of given browser
	 * name
	 * 
	 * @param browserName
	 * @return This returns the specific browser driver
	 */
	public WebDriver intiDriver(String browserName) {
		System.out.println("browser name is :" + browserName);
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("please pass the right browser");
			break;
		}
		return driver;
	}

	public void launchURL(String url) {
		if (url == null) {
			System.out.println("url can not be null");
		}
		if (url.indexOf("https") == 0) {
			driver.manage().window().maximize();
			driver.get(url);
		}

	}

	public String gtPageTitle() {
		String title = driver.getTitle();
		System.out.println("print title : " + title);
		return title;
	}

	public String getPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("page Current Url : " + url);
		return url;
	}

	public void closeBrowser() {
		if (driver != null) {
			driver.close();
		}

	}

	public void quitBrowser() {
		if (driver != null) {
			driver.quit();
		}

	}

}
