package AdvancedSeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement twitter = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		twitter.click();
//get the window ids
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		System.out.println("parent Window Id :" + parentWindowId);

		String childWindowId = it.next();
		System.out.println("child Window Id :" + childWindowId);

		// switching to window:
		driver.switchTo().window(childWindowId);
		System.out.println("child window url: " + driver.getCurrentUrl());

		driver.close();// close the child window

		driver.switchTo().window(parentWindowId);

		System.out.println("parrnt window url: " + driver.getCurrentUrl());
		driver.quit();
	}

}
