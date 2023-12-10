package AdvancedSeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElementConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/");

		Thread.sleep(4000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

		String svgXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";
		Actions action = new Actions(driver);
		List<WebElement> findElements = driver.findElements(By.xpath(svgXpath));
		System.out.println(findElements.size());

		for (WebElement e : findElements) {
			String stateName = e.getAttribute("name");
			System.out.println(stateName);

			if (stateName.equals("Colorado")) {
				Thread.sleep(2000);

//				int x = e.getSize().getWidth();
//				int y = e.getSize().getHeight();
//				System.out.println(x + " : " + y);
//				action.moveToElement(e, (x/2)-40, 0).click().build().perform();
				// action.click(e).build().perform();
				e.click();
				break;
			}
		}
	}

}
