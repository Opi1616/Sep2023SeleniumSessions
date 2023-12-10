import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOutConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String zoomChrome = "document.body.style.zoom ='400.0%';";// edge, safari, chrome
//		String zoomFireFox = "document.body.style.MozTransform ='scale(0.5)';";// firefox

		zoomChrome("0.5");

	}

	public static void zoomChrome(String zoomPercantage) {
		String zoomChrome = "document.body.style.zoom ='" + zoomPercantage + "';";// edge, safari, chrome
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(zoomChrome);
	}

	public static void zoomFirefox(String zoomPercantage) {

		String zoomFireFox = "document.body.style.MozTransform ='scale(" + zoomPercantage + ")';";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(zoomFireFox);
	}

}
