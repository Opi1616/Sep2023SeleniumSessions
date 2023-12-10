package TestNGSessions;

import org.testng.annotations.Test;

public class CRUDOperationTest {

	public void createUser() {
		System.out.println("create User");
	}

	public void getUser(int userId) {
		System.out.println("get User" + userId);
	}

	public void updateUser(int userId) {
		System.out.println("update User" + userId);
	}

	public void deleteteUser() {

	}

	@Test
	public void createUserTest() {
		createUser();
	}

	@Test
	public void getUserTest() {
		createUser();
		getUser(123);
	}

	@Test
	public void updateUserTest() {
		createUser();
		getUser(123);
		updateUser(123);
		getUser(123);

	}

	@Test
	public void deleteteUserTest() {
		createUser();
		getUser(123);
		deleteteUser();
		getUser(123);
	}

	@Test
	public void getuserTesting() {
		int userId = 123;//hard coded user id
		//QA ---> stage --> dev --> UAT -- PROD
		getUser(userId);
		//asset
	}

}
