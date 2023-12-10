package AdvancedSeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators_Concept {

	public static void main(String[] args) throws InterruptedException {
//         above
// near
//  left   .   right       		
//
//		below

// sel 4.x: 

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");

		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.linkText("Quebec City, Canada"));

		String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightIndex);

		String leftValue = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftValue);

		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);

		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		
		String nearCitye=driver.findElement(with(By.tagName("a")).near(ele)).getText();
		System.out.println(nearCitye);
	
	
	
	
	
	
	}

}
