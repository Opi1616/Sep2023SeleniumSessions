package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// xpath: address of the element in html dom
		// 1.absolute xpath: /html/body/div[2]/div/div[2]/div/div[2]/h4/a
		// 2.relative xpath: custom xpath

		// tag[@attribute='value']
		// input[@type='text' and @name='email']

		// input[@type='text' or @name='email']

		// xpath with rext();
		// text is not an attribute, its the text content of the element
		// dont use @text... we use text() function
		// tag[text()='value']
		// h2[text()='Returning Customer']

		By newCust = By.xpath("//h2[text()='New Customer']");

		// check My Account link is present on the page - two times
		By myAcc = By.xpath("//a[text()='My Account']");
		int myAccount = driver.findElements(myAcc).size();
		if (myAccount == 2) {
			System.out.println("PASS");
		}

		// h1[text()='Same easy software. New ']

		// text() with attribute
		// tag[@attr='value' and text[] ='value']
		// span[@class='sc-b323b31-0 julMyS' and text()='Trusted by 60,000+ businesses
		// of all sizes']
		// a[text()='Register' and @class='list-group-item']
		// a[text()='Register' and @class='list-group-item' and @href]
		// a[@href]

		// contains() with attribute:
		// tag[contains(@atrr,'value')]
		// input[contains(@placeholder,'E-Mail')]

		// input[contains(@id,'email')]

		// contains() with one attribute and use another attribute without contains():
		// tag[contains(@attribute1,'value') and @attr2='value']
		// input[contains(@id,'email') and @type='text']
		// input[contains(@placeholder,'E-Mail') and contains(@id,'email') and @type='text']
		
		//dynamic attribute:
		//<input id=firstname_123>
		//<input id=firstname_456>
		//<input id=firstname_989>
		
		//By.id("firstname_123");/not the right xpath
		//input[contains(@id,'firstname_')] --right
		
		//contains() with text():
		//tag[contains(text(),'value')]
		//h1[contains(text(),'software')]
		//a[contains(text(),'Amazon')]
		
		//contains() with text() and attribute: 
		//tag[contains(text(),'value') and contains(@attr,'value')
		//a[contains(text(),'Science') and contains(@href,'amazon.science')]
		
		//contains() with text() and attribute with contains: 
		//tag[contains(text(),'value') and (@attr,'value')
		//a[contains (text(),'Science') and @class='nav_a']

	    //starts-with():
		//tag[starts-with(text(),'value']
		//small[starts-with(text(),'Free CRM has powerful call tracking')]
	
		//input[starts-with(@aria-labelledby,'UIFormControl-label-2') and @type='email']
		//a[starts-with(@href,'https://naveenautomationlabs.com/')]
		
		
		
		//ends-with() in xpath??--NA
		
		//input[@class='form-control'] [position()=1]
		//input[@class='form-control'][1]
		//(//input[@class='form-control'])[1]
		//(//input[@class='form-control'])[last()]
		//(//input[@class='form-control'])[last()-1] second last
		//(//div[contains(@class,'navFooterLinkCol ')][last()]//a)[last()]
		
		//class in locator: className,xpath,css
		
		//input[@class='form-control private-form__control login-email'] --valid
		//input[@class='login-email'] --not valid
		By.className("form-control private-form__control login-email");//not valid --only one class is allowed
	By.className("login-email");//valid
	
	By.xpath("//input[contains(@class,'login-email')]");//valid
	
	//parent to child:
	//parent/child ---> direct
	//parent//child ---> direct + indirect
	
	//child to parent: backward traversing in xpath
	//input[@id='input-email']/../../../../../../../../../..
	
	//siblings:
	//label[@for='input-email']/following-sibling::input[@name='email']
	//input[@id='input-email']/preceding-sibling::label
	
	//(//span[text()='Stafanie Taylor']/ancestor::td/following-sibling::td//span)[2]
	
	
	
	
	}

}
