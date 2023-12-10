package ActionClassesConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		driver.manage().window().maximize();
		WebElement Menu = driver.findElement(By.cssSelector("a.menulink"));
		Actions action = new Actions(driver);
		action.moveToElement(Menu).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("COURSES")).click();

	}

}
