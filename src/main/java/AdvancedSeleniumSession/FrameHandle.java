package AdvancedSeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		// driver.switchTo().frame(2);
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));

		// driver.switchTo().frame("main");

		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);

		driver.switchTo().defaultContent();

	}

}
