package ActionClassesConcept;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doElemenetGetText(By locator) {
		return getElement(locator).getText();
	}

	public boolean is_Displayed(By locator) {
		return getElement(locator).isDisplayed();

	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void getElementsAttribute(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		System.out.println("Total count: " + eleList.size());
		for (WebElement e : eleList) {
			String attrVal = e.getAttribute(attrName);
			System.out.println(attrVal);
		}
	}

	public List<String> getElementTextList(By locator) {

		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String text = e.getText();
			eleTextList.add(text);
		}
		return eleTextList;
	}
	
	//*********************Select based drop down utils******************************//
	public void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public void doSelectDropDownByValue(By locator, String Value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(Value);
	}

	public void doSelectDropDownByVisibleText(By locator, String VisibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(VisibleText);
	}
	
	public  List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}

	public  List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement> optionList = getDropDownOptionsList(locator);
		List<String> optionsList = new ArrayList<String>();
		for (WebElement e : optionList) {
			String text = e.getText();
			optionsList.add(text);
		}
		return optionsList;
	}

	public  void selectDropDownValue(By locator, String expValue) {

		List<WebElement> optionsList = getDropDownOptionsList(locator);
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(expValue)) {
				e.click();
				break;
			}
		}
	}

	public  int getTotalDropDownOptions(By locator) {
		int optionsCount = getDropDownOptionsList(locator).size();
		System.out.println("total options ==> " + optionsCount);
		return optionsCount;
	}
	
	/**********************Search*****************/
	public  void doSearch(By locator, String sugestion) {
		List<WebElement> suggesList = getElements(locator);
		System.out.println(suggesList.size());

		for (WebElement e : suggesList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(sugestion)) {
				e.click();
				break;
			}
		}
	}
	
	/**********************Actions************************/
	public  void doActionSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();

	}

	public  void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}
}
