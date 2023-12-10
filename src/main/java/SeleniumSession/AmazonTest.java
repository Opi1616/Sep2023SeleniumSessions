package SeleniumSession;

public class AmazonTest {

	public static void main(String[] args) {
		String browserName = "chrome";
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.intiDriver(browserName);
		brUtil.launchURL("https://www.amazon.com");

		String actTitle = brUtil.gtPageTitle();
		if (actTitle.contains("Amazon")) {
			System.out.println("title ----- pass");
		} else {
			System.out.println("title ----fail");
		}
		String actUrl = brUtil.getPageURL();
		if (actUrl.contains("amazon")) {
			System.out.println("page url ---pass");
		} else {
			System.out.println("page url ---fail");
		}

		brUtil.closeBrowser();
	}

}
