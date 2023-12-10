package AdvancedSeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement slider = driver.findElement(By.id("slider"));
		slider.click();
		int width = slider.getSize().getWidth();
		System.out.println(width);// 441

		Actions act = new Actions(driver);
		act.moveToElement(slider, -((width / 2) - 90), 0).click().build().perform();

	}

}
