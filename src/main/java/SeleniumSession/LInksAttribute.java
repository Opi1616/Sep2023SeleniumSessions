package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LInksAttribute {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		By links = By.tagName("a");
		By images = By.tagName("img");

//		List<WebElement> linkList = getElements(links);
//		System.out.println("total links: " + linkList.size());
//
//		for (WebElement e : linkList) {
//			String hrefVal = e.getAttribute("href");
//			String linkText = e.getText();
//
//			System.out.println(hrefVal + ":::::" + linkText);
//
//		}

//		List<WebElement> imagesList = getElements(images);
//		System.out.println("total images: " + imagesList.size());
//
//		for (WebElement e : imagesList) {
//			String srcVal = e.getAttribute("src");
//			System.out.println(srcVal);
//
//		}

		getElementsAttribute(images, "src");
		getElementsAttribute(links, "href");
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void getElementsAttribute(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		System.out.println("Total count: " + eleList.size());
		for (WebElement e : eleList) {
			String attrVal = e.getAttribute(attrName);
			System.out.println(attrVal);
		}
	}

}
