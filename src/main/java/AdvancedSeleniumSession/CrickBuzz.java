package AdvancedSeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Return;

public class CrickBuzz {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/78565/ind-vs-aus-3rd-odi-australia-tour-of-india-2023");
//		String wkName = getWicketTakerName(" Mitchell Marsh ");
//		System.out.println(wkName);
//
//		wkName = getWicketTakerName(" Labuschagne ");
//		System.out.println(wkName);
//
//		wkName = getWicketTakerName(" Maxwell ");
//		System.out.println(wkName);

		List<String> LabuschagneScoreList = getScoreCardList(" Labuschagne ");
		System.out.println(LabuschagneScoreList);
	}

	public static String getWicketTakerName(String batsmanName) {
		return driver
				.findElement(
						By.xpath("//a[text()='" + batsmanName + "']/ancestor::div[1]/following-sibling::div//span"))
				.getText();
	}

	// a[text()=' Warner
	// ']/ancestor::div[1]/following-sibling::div[contains(@class,'text-right')]
	// a[text()=' Warner ']/ancestor::div[1]/following-sibling::div
	public static List<String> getScoreCardList(String playerName) {
		List<WebElement> scoreList = driver
				.findElements(By.xpath("//a[text()='" + playerName + "']/ancestor::div[1]/following-sibling::div"));
		List<String> playerscoreList = new ArrayList<>();
		for (WebElement e : scoreList) {
			String text = e.getText();
			playerscoreList.add(text);

		}
		return playerscoreList;
	}
}
