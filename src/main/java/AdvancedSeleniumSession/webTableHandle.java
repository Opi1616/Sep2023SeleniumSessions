package AdvancedSeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTableHandle {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		selectUser("Airi Satou");
		GetselectdUserPosition("Brenden Wagner");
		GetselectdUserOffice("Angelica Ramos");
		GetselectdUserAge("Ashton Cox");
		GetselectdUserSalary("Angelica Ramos");

		// (//td[text()='Airi Satou']/following-sibling::td)[1]

	}

	public static void selectUser(String userName) {
		driver.findElement(
				By.xpath("//td[text()='" + userName + "']/preceding-sibling::td[@class='  select-checkbox']")).click();

	}

	public static void GetselectdUserPosition(String userName) {
		String position = driver.findElement(By.xpath("(//td[text()='" + userName + "']/following-sibling::td)[1]"))
				.getText();
		System.out.println(position);

	}

	public static void GetselectdUserOffice(String userName) {
		String Office = driver.findElement(By.xpath("(//td[text()='" + userName + "']/following-sibling::td)[2]"))
				.getText();
		System.out.println(Office);

	}

	public static void GetselectdUserAge(String userName) {
		String Age = driver.findElement(By.xpath("(//td[text()='" + userName + "']/following-sibling::td)[3]"))
				.getText();
		System.out.println(Age);
	}

	public static void GetselectdUserSalary(String userName) {
		String Salary = driver.findElement(By.xpath("(//td[text()='" + userName + "']/following-sibling::td)[4]"))
				.getText();
		System.out.println(Salary);
	}
}
