package AdvancedSeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import JavaScriptExecutorConcept.JavaScriptUtil;

public class ScrollIntoViewConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//h2[text()='Shop activity trackers and smartwatches']"));
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		// jsUtil.scrollIntoView(element);
		
		//click --UI --click on middle of the element
		//action click -- move to element  --click on middle of the element
		//js click  --click from DOM
		
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Beauty picks']"));
		jsUtil.clickElementByJS(ele);
		
		
		
	}

}
