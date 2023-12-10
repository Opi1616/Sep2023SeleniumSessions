package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest {

	@Test(priority = 1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title: " + title);
		Assert.assertEquals(title, "Your Store");

	}

	@Test(priority = 2)
	public void searchExistTest() {
		boolean flag = driver.findElement(By.cssSelector(".form-control.input-lg")).isDisplayed();
		Assert.assertTrue(flag);
	}

}
