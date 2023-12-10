package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		// By Language = By.xpath("//div[@id='SIvCob']/a");

//		List<String> elemetlist = getTotalElementList(Language);
//		System.out.println(elemetlist);

//		List<String> attributelist = getTotalAttributeList(Language, "href");
//		System.out.println(attributelist);

//		List<String> elemetExpectedlist = getElementListUpTOExpected(Language, "मराठी");
//		System.out.println(elemetExpectedlist);

		By footerLinks = By.xpath("//div[@class='KxwPGc SSwjIe']/div/a");

//		List<String> elemetlist = getTotalElementList(footerLinks);
//		System.out.println(elemetlist);

//		List<String> attributelist = getTotalAttributeList(footerLinks, "href");
//		System.out.println(attributelist);

		List<String> elemetExpectedlist = getElementListUpTOExpected(footerLinks, "How Search works");
		System.out.println(elemetExpectedlist);

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static List<String> getTotalElementList(By locator) {
		List<String> TextList = new ArrayList<String>();
		List<WebElement> Elementlist = getElements(locator);
		int TotalElement_count = Elementlist.size();
		System.out.println("Total elements count: " + TotalElement_count);

		for (WebElement e : Elementlist) {
			String text = e.getText();
			TextList.add(text);
		}
		return TextList;
	}

	public static List<String> getElementListUpTOExpected(By locator, String Expectedstring) {
		List<String> TextList = new ArrayList<String>();
		List<WebElement> Elementlist = getElements(locator);
		int TotalElement_count = Elementlist.size();
		System.out.println("Total elements count: " + TotalElement_count);

		for (WebElement e : Elementlist) {
			String text = e.getText();
			TextList.add(text);
			if (text.contains(Expectedstring)) {
				break;
			}

		}
		return TextList;
	}

	public static List<String> getTotalAttributeList(By locator, String AttributeName) {
		List<String> attributeList = new ArrayList<String>();

		List<WebElement> Elementlist = getElements(locator);
		int TotalElement_count = Elementlist.size();
		System.out.println("Total elements count: " + TotalElement_count);

		for (WebElement e : Elementlist) {
			String text = e.getAttribute(AttributeName);
			attributeList.add(text);
		}
		return attributeList;
	}

}
