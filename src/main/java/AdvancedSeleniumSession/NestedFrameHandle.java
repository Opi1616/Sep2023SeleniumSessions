package AdvancedSeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		driver.manage().window().maximize();

		// nested iframes
		// f1--ele
		// f2--ele
		// f3--ele

		driver.switchTo().frame("pact1").switchTo().frame("pact2");// 2
		driver.findElement(By.id("jex")).sendKeys("PQR");

//		driver.switchTo().frame("pact1");
//		driver.findElement(By.id("inp_val")).sendKeys("ABC");
//
//		driver.switchTo().frame("pact2");
//		driver.findElement(By.id("jex")).sendKeys("PQR");
//
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("inp_val")).sendKeys("ABC---new");
//
//		driver.switchTo().frame("pact2");
//		driver.switchTo().frame("pact3");
//		driver.findElement(By.id("glaf")).sendKeys("XYZ");
//
//		driver.switchTo().parentFrame();// f2
//		driver.switchTo().parentFrame();// f1
//
//		// driver.switchTo().defaultContent();
//		driver.findElement(By.id("inp_val")).sendKeys("ABC456");
//
//		driver.switchTo().defaultContent();
	}

}
