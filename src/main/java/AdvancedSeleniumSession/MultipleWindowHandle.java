package AdvancedSeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentWindowId = driver.getWindowHandle();
		Thread.sleep(3000);
		WebElement twitter = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));

		WebElement linkedin = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));

		WebElement facebook = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));

		WebElement youtube = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));

		twitter.click();
		linkedin.click();
		facebook.click();
		youtube.click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while (it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(1500);
			if (!windowId.equals(parentWindowId))
				driver.close();
		}

		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url: " + driver.getCurrentUrl());

	}

}
