package Wait_In_Selenium;

public class Wait_In_Selenium_Concept {

	public static void main(String[] args) {

		// script ----sync ---> app
		// script ----->slow/fast/very slow

		// types of wait:
		// 1.static wait: sleep(5000) ---pause 5 secs
		// 2.dynamic wait: 10 secs --> 2 secs -->8 secs will be ignored
            //2.a: Implicitly Wait: global Wait for all the elements
		    //2.b: Explicit Wait: on a specific element +polling/interval time
		           //i.WebDriverWait
		           //ii. FluentWait
		
		//WebDriverWait(c) --> FluentWait(c) --> wait(I) : until();
		                        //until(){}
		                        //other methods{}
		
		    
		  
	}

}
