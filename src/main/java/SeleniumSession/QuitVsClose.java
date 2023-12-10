package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		// SID -session id

		WebDriver driver = new ChromeDriver();// 123
		driver.get("https://www.google.com");// 123
		String title = driver.getTitle();// 123
		System.out.println(title);

		System.out.println(driver.getCurrentUrl());// 123

		//driver.quit();// 123
		driver.close();
		//NoSuchSessionException: invalid session id
		//sid =123 --invalid
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		// NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?

	}

}
