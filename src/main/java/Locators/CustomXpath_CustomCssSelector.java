package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath_CustomCssSelector {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://app.hubspot.com/login/?hsCtaTracking=d82c5d82-821c-4c0d-86f5-6c34dced0e6d%7C16494015-d90f-47fc-adc3-593e2e1bdfa0");

		// id
		// #id
		// #input-firstname --css
		// input[@id='input-firstname'] --xpath
		By fn = By.cssSelector("#input-firstname");

		// tag#id
		// input#input-firstname

		// class
		// .className
		// tag.classname
		// .c1.c2.c3...cn
		// tag c1.c2.c3.cn
		// .form-control

		// input.login-email

		// .form-control.private-form__control.login-email
		// input.form-control.private-form__control.login-email

		// input.form-control.private-form__control.login-email#username

		// input#username.form-control.private-form__control.login-email

		// button.login-submit

		// input.login-email.private-form__control.form-control

		// tag#id.class = input#username.login-email
		// tag.class#id = input.login-email#username
		// #id.class =
		// .class#id = .login-email#username
		// tag.class#id.class=
		// input.form-control.private-form__control#username.login-email

		// other attr:
		// tag[attr='value']
		// input[type='email']--css
		// input[@type='email']--xpath
		// input[class='login-email'] --css --0
		// input[@class='login-email'] --xpath --0
		// input[contains(@class,'login-email')] --1

		// multiple attribute:
		// tag[attr1='value'][attr2='value'][attr3='value']
		// input[type='text'][name='firstname'][placeholder='First Name']
		// input[@type='text' and @name='firstname'and @placeholder='First Name']

		// tag#id[attr='vale'] = input#input-firstname[placeholder='First Name']
		// input#input-firstname[placeholder='First Name'][type='text']
		// input#input-firstname[placeholder='First Name'][type='text'].form-control

		// h1[text()='Register Account']
		// text is not supported in css

		// contains:*
		// tag[attr*='value']
		// input[id*='firstname']
		// [id*='firstname']
		// input[class*='login-email']

		// starts-with:^
		// tag[attr^='value']
		// input[placeholder^='First']

		// ends-with:$
		// tag[attribute$='value']
		// input[placeholder$='Name']

		// parent to child:
		// parent tag child tag
		// parent tag > child tag > child tag
		// div.private-form__input-wrapper>input#username
		// div.private-form__input-wrapper>#username

		// form#hs-login> div ---8 ---> direct child element
		// form#hs-login div ---20 ---> indirect + direct child element

		// child to parent: backward traversing -- not available

		// or -comma in css:
		// input#username,button#loginBtn,input#password,button#ssoBtn
		// FEs(css).size() -->

		int impFieldsCount = driver
				.findElements(By.cssSelector("input#username,button#loginBtn,input#password,button#ssoBtn")).size();
		if (impFieldsCount == 4) {
			System.out.println("PASS");
		}

		// not in css:

		// form-control private-form__control login-email
		// form-control private-form__control login-password m-bottom-3

		// input.form-control:not(input[name='search'])
		// input.form-control:not(input[name='search']),input[name='firstname']

		// indexing:
		// select#Form_getForm_Country >option:first-child
		// select#Form_getForm_Country >option:last-child

		// select#Form_getForm_Country >option:first-of-type
		// select#Form_getForm_Country >option:last-of-type

		// select#Form_getForm_Country >option:nth-of-type(3)
		// select#Form_getForm_Country >option:nth-of-type(n)

		//               xpath            vs            css
		//1. syntax:     complete                       simple
		//2. text():       yes                           no
        //3. AND:          yes                            yes
	    //4. OR            yes                           yes, comma
	    //5. forward:      yes                           yes
	    //6. backward      yes                           no
		//7. forward sibling:yes                         yes
		//8. backward sibling:yes                         no
		//9. not:           no							 yes
		//10. index:        yes                          yes
	    //11. capture group  yes                         no 
	    //12. performance    good                       good
	    //13. starts with    yes                          yes
	    //14. contains       yes                          yes  
	    //15. ends -with     no                           yes
	    //16. webtable:      yes                          no 
	
	    //sibling in css: 
		//label[for='input-email']+input[name='email']
	
	
	}

}
