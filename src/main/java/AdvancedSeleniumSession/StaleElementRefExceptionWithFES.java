package AdvancedSeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionWithFES {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		List<WebElement> linkList = driver
				.findElements(By.xpath("(//ul[@class='sc-ace17a57-0 sc-4f15dcd9-0 kTjuIu gkmXaP'])[3]//a"));
		for (int i = 0; i < linkList.size(); i++) {
			linkList.get(i).click();
			linkList = driver.findElements(By.xpath("(//ul[@class='sc-ace17a57-0sc-4f15dcd9-0 kTjuIu gkmXaP'])[3]//a"));
		}

	}

}
