package ActionClassesConcept;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickHadle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action = new Actions(driver);
		action.contextClick(ele).build().perform();

		List<WebElement> doubleClickList = driver.findElements(By.cssSelector("ul.context-menu-list span"));
		System.out.println(doubleClickList.size());
		for (WebElement e : doubleClickList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("Copy")) {
				e.click();
				Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();
				break;
			}
		}

	}

}
