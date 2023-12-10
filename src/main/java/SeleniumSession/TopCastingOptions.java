package SeleniumSession;

public class TopCastingOptions {

	public static void main(String[] args) {

		// 1.browser specific:
		// ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver1 = new FirefoxDriver();

		// 2.WD = new CD - valid top casting - recommended
		// WebDriver driver = new ChromeDriver();

		// 3. SC = new CD() - valid but not recommended
		// SearchContext driver = new ChromeDriver();

		// 4.RWD = new CD(); - valid top casting - recommended
		// RemoteWebDriver driver = new ChromeDriver();

		// 5.WD = new RWD(); - valid top casting = recommended -GRID - used for remote execution
	
		//WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);

		//6. SC = new RWD(); - valid but not recommended
		//SearchContext driver = new RemoteWebDriver(remoteAddress,capabilities)
	
	
	
	}

}
