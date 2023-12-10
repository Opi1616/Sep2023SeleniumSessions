package AdvancedSeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int headerCount = getTableHeaderCount();
		System.out.println(headerCount);

		int rowCount = getRowCount();
		System.out.println(rowCount);

		// table[@id="customers"]/tbody/tr[2]/td[1]
		// table[@id="customers"]/tbody/tr[3]/td[1]
		// table[@id="customers"]/tbody/tr[7]/td[1]

		// table[@id="customers"]/tbody/tr[2]/td[2]
		// table[@id="customers"]/tbody/tr[2]/td[3]

		String befpreXpath = "//table[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[";
		String endXpath = "]";

		for (int row = 2; row <= 7; row++) {
			for (int col = 1; col <= 3; col++) {
				String xPath = befpreXpath + row + afterXpath + col + endXpath;
				String val = driver.findElement(By.xpath(xPath)).getText();
				System.out.print(val+" ");
			}
			System.out.println("");

		}

	}

	public static int getTableHeaderCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	}

	public static int getRowCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tr")).size() - 1;
	}

}
