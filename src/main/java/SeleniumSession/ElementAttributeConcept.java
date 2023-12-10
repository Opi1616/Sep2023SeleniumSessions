package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributeConcept {

	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		String name = driver.findElement(By.name("firstname")).getAttribute("placeholder");
//		System.out.println(name);
//
//		String srcval = driver.findElement(By.className("img-responsive")).getAttribute("src");
//		System.out.println(srcval);
//
//		String titleVal = driver.findElement(By.className("img-responsive")).getAttribute("title");
//		System.out.println(titleVal);
//
//		System.out.println(srcval + "----->" + titleVal);

		By firstName = By.name("firstname");
		By logo = By.className("img-responsive");
		By titlval = By.className("img-responsive");

		String ph = getElementAttribute(firstName, "placeholder");
		String srcVal = getElementAttribute(logo, "src");
		String titleVal = getElementAttribute(titlval, "title");
	    
		
		System.out.println(ph);
	    System.out.println(srcVal);
	    System.out.println(titleVal);
	
	
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static String getElementAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

}
