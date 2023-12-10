package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElemenetNotPresent {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		boolean flagImg = driver.findElement(By.className("img-responsive")).isDisplayed();
		System.out.println(flagImg);
		
		
	}

}
