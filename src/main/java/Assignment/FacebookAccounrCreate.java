package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccounrCreate {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569870%7Cb%7Ccreate%20new%20facebook%20account%7C&placement=&creative=589460569870&keyword=create%20new%20facebook%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-350813237447%26loc_physical_ms%3D9301538%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw38SoBhB6EiwA8EQVLil23cSXBABzyM6Aex4UrYnJ1RwOoN06IlZUUv-BWhprVg8n6KgTbRoCz7IQAvD_BwE");
		By date = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

		getElementSelectByIndex(date, 6);
		getElementSelectByValue(month, "4");
		getElementSelectByVisibleText(year, "2021");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void getElementSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void getElementSelectByValue(By locator, String Value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(Value);
	}

	public static void getElementSelectByVisibleText(By locator, String VisibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(VisibleText);
	}

}
