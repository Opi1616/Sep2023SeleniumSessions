package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		// find all links on the page

		List<WebElement> linkList = driver.findElements(By.tagName("a"));

		int linkscount = linkList.size();
		// print the total links count
		System.out.println("total links: " + linkscount);

		// print the text of each link
//		for (int i = 0; i < linkscount; i++) {
//			String text = linkList.get(i).getText();
//
//			if (!text.isBlank()) {
//				System.out.println(text);
//			}
//
//		}

		// for each:
		int count = 0;
		for (WebElement e : linkList) {
			String text = e.getText();
			if (!text.isBlank()) {
				System.out.println(count + ":" + text);
			}
			count++;
		}

	}

}
