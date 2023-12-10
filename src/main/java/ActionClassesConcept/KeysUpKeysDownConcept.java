package ActionClassesConcept;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysUpKeysDownConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions action = new Actions(driver);
		// scroll down using action class
		action.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();

		Thread.sleep(1000);

		// scroll up using action class
		action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	}

}
