package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcepts {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com/");

		System.out.println(driver.getTitle());

		driver.navigate().to("https://amazon.com/");

		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().forward();
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().refresh();// refresh the page

	}

}
