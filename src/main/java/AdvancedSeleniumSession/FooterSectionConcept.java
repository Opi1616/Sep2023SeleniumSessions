package AdvancedSeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterSectionConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=14311354414210084861&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9146075&hvtargid=kwd-10573980&hydadcr=14453_2316415");
		List<String> Get_UsLIst = getFooterSectionList("Get to Know Us");
		System.out.println(Get_UsLIst);

		System.out.println("------------------");

		List<String> Connected_UsLIst = getFooterSectionList("Connect with Us");
		System.out.println(Connected_UsLIst);

		System.out.println("------------------");

		List<String> Make_Money_UsLIst = getFooterSectionList("Make Money with Us");
		System.out.println(Make_Money_UsLIst);

		System.out.println("------------------");

		List<String> Let_UsLIst = getFooterSectionList("Let Us Help You");
		System.out.println(Let_UsLIst);
	}

	public static List<String> getFooterSectionList(String sectionName) {
		List<WebElement> secList = driver
				.findElements(By.xpath("//div[text()='" + sectionName + "']/following-sibling::ul//a"));

		System.out.println(secList.size());
		List<String> secValList = new ArrayList<String>();
		for (WebElement e : secList) {
			String text = e.getText();
			secValList.add(text);
		}
		return secValList;
	}

}
