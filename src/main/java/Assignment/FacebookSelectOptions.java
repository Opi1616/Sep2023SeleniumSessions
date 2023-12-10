package Assignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelectOptions {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569870%7Cb%7Ccreate%20new%20facebook%20account%7C&placement=&creative=589460569870&keyword=create%20new%20facebook%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-350813237447%26loc_physical_ms%3D9301538%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw38SoBhB6EiwA8EQVLil23cSXBABzyM6Aex4UrYnJ1RwOoN06IlZUUv-BWhprVg8n6KgTbRoCz7IQAvD_BwE");
		By date = By.id("day");
		By month = By.id("month");
		By year = By.id("year");

//		List<String> dateList = getDropDownOptionsTextList(date);
//		System.out.println(dateList);
//		List<String> monthList = getDropDownOptionsTextList(month);
//		System.out.println(monthList);
//		List<String> yearList = getDropDownOptionsTextList(year);
//		System.out.println(yearList);

//		selectDropDownValue(date, "25");
//		selectDropDownValue(month, "Mar");
//		selectDropDownValue(year, "2011");

		getTotalDropDownOptions(date);
		getTotalDropDownOptions(month);
		getTotalDropDownOptions(year);

	}

	public static WebElement GetElement(By locator) {
		return driver.findElement(locator);

	}

	public static List<WebElement> GetOptions(By locator) {
		Select select = new Select(GetElement(locator));
		return select.getOptions();
	}

	public static int getTotalDropDownOptions(By locator) {
		int optionsCount = GetOptions(locator).size();
		System.out.println("total options ==> " + optionsCount);
		return optionsCount;
	}

	public static List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement> OptionList = GetOptions(locator);
		List<String> OptionsTextList = new ArrayList<String>();
		for (WebElement e : OptionList) {
			String text = e.getText();
			OptionsTextList.add(text);
		}
		return OptionsTextList;
	}

	public static void selectDropDownValue(By locator, String expValue) {

		List<WebElement> optionsList = GetOptions(locator);

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(expValue)) {
				e.click();
				break;
			}
		}
	}

}