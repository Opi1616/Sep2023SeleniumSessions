package AdvancedSeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUpHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\ADMIN\\Desktop\\2023-10-01 13_17_00-Greenshot.png");
		//<tag type="file"> -- this is mandatory attribute
		//autoIT/sikuli--not recommended
		// input[@type='submit']

	}

}
