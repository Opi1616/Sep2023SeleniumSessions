package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	@Test(expectedExceptions =NullPointerException.class)
	public void login() {
		System.out.println("login test");
		int i = 9 / 0;

	}
}
