package AdvancedSeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderHandle {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();

		// selectCalanderDate("14");
		selectFutureDate("May 2024", "31");
	}

	public static void selectFutureDate(String expMonthYear, String day) {

		if (expMonthYear.contains("February") && Integer.parseInt(day) > 29) {
			System.out.println("wrong day/date passed....please pass the right day/date for feb month... " + day);
			return;
		}
		if (Integer.parseInt(day) > 31) {
			System.out.println("wrong day/date passed....please pass the right day/date... " + day);
			return;

		}
		String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);

		while (!actMonthYear.equalsIgnoreCase(expMonthYear)) {
			// click on next icon:
			driver.findElement(By.xpath("//span[text()='Next']")).click();

			actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			System.out.println(actMonthYear);

		}

		selectDate(day);

	}

	public static void selectCalanderDate(String day) {
		List<WebElement> dayList = driver.findElements(By.cssSelector("table.ui-datepicker-calendar a"));
		System.out.println(dayList.size());
		for (WebElement e : dayList) {
			String text = e.getText();
			if (text.equals(day)) {
				e.click();
				break;
			}
		}
	}

	public static void selectDate(String day) {
		driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
	}

}
