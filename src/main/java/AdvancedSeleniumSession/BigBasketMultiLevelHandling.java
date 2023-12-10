package AdvancedSeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		selectProoductLevel4Handling("Snacks & Branded Foods", "Indian Mithai", "Fresh Sweets");

	}

	public static void selectProoductLevel4Handling(String L2, String L3, String L4) throws InterruptedException {
		WebElement shopParentEle = driver.findElement(By.xpath("(//span[text()='Shop by'])[2]"));

		Actions act = new Actions(driver);
		act.click(shopParentEle).build().perform();
		Thread.sleep(2000);

		WebElement L2Ele = driver.findElement(By.linkText(L2));
		act.moveToElement(L2Ele).build().perform();
		Thread.sleep(2000);

		WebElement L3El = driver.findElement(By.linkText(L3));
		act.moveToElement(L3El).build().perform();
		Thread.sleep(2000);

		WebElement L4El = driver.findElement(By.linkText(L4));
		act.click(L4El).build().perform();

	}

}
