package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.SetupFile;
import utility.UtilityFunctions;

public class LoginPage extends SetupFile{
	
	UtilityFunctions objUtilityFunctions = new UtilityFunctions();
	
	@FindBy (xpath = "//*[@name='email_address']")
	WebElement username_TextBox;
	
	@FindBy (xpath = "//*[@name='password']")
	WebElement password_TextBox;
	
	@FindBy (xpath = "//*[text()='Sign In']")
	WebElement signIn_Button;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void logincredentials(String user, String pass) {
		objUtilityFunctions.sendKeysWebElement(username_TextBox, user);
		System.out.println("UserName entered");
		objUtilityFunctions.sendKeysWebElement(password_TextBox, pass);
		System.out.println("Password entered");
		objUtilityFunctions.clickOnWebElement(signIn_Button, 10);
		System.out.println("Clicked on SignIn Button");
	}

}
