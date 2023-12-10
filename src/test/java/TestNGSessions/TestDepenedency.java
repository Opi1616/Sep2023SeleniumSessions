package TestNGSessions;

import org.testng.annotations.Test;

public class TestDepenedency {

	@Test
	public void searchTest() {
		System.out.println("search Test");
		//int i=9/0;
	}

	@Test(dependsOnMethods = "searchTest")
	public void addToCart() {
		System.out.println("add To Cart");
		int i=9/0;
	}

	@Test(dependsOnMethods = "addToCart")
	public void makePayment() {
		System.out.println("make Payment");
	}

}
