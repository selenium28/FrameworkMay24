package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.SetupFile;
import pages.LandingPage;
import pages.LoginPage;

public class TestCases extends SetupFile{
	
	static String username = "testData@test.com";
	static String password = "123456789";

	@BeforeTest
	public void startTest() {
		setupMethod();
	}

	@Test (priority = 1)
	public void landingPage() {
		System.out.println("Landing Page test run started");
		LandingPage objLandingPage = new LandingPage();
		objLandingPage.clickLoginButton();
		System.out.println("Landing page test run completed");
	}
	
	@Test (priority = 2)
	public void loginPage() {
		System.out.println("Login Page test run started");
		LoginPage objLoginPage = new LoginPage();
		objLoginPage.logincredentials(username, password);
		System.out.println("Login page test run completed");
	}
	
	//@AfterTest
	public void endTest() {
		tearDown();

	}

}
