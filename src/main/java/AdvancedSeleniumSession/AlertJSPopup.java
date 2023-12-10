package AdvancedSeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopup {

	public static void main(String[] args) throws InterruptedException {

		// js alert -alert, prompt,confirm
		// auth pop up
		// browser window pop up
		// file upload pop up

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// driver.findElement(By.xpath("//button[text()='Click for JS
		// Alert']")).click();
		// driver.findElement(By.xpath("//button[text()='Click for JS
		// Confirm']")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert();
		// NoAlertPresentException: no such alert

		String text = alert.getText();
		System.out.println(text);
		alert.sendKeys("Naveen");
		Thread.sleep(3000);
		alert.accept();
		// alert.dismiss();

	}

}
