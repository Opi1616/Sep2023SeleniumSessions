package AdvancedSeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_CharSeq {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement email =driver.findElement(By.id("input-email"));
		
		//StringBuilder, StringBuffer,String,Keys
		StringBuffer userName = new StringBuffer()
				.append("Naveen")
				.append(" ")
				.append("automation")
				.append(" ")
				.append("Labs")
				.append(" ")
				.append("Selenium");
		
		String space =" ";
		
		StringBuffer userInfo = new StringBuffer()
				.append("Test")
				.append(" ")
				.append("WebDriver");
		
		String author = "Naveen khunteta";
		email.sendKeys(userName, space, userInfo,space,author,Keys.TAB);
		
		
		
	}

}
