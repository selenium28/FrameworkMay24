package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.SetupFile;
import utility.UtilityFunctions;

public class LandingPage extends SetupFile{
	
	UtilityFunctions objUtilityFunctions = new UtilityFunctions();
	
	@FindBy (xpath = "//*[text()='login']") 
	WebElement login_Button;
	
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickLoginButton() {
		objUtilityFunctions.clickOnWebElement(login_Button, 10);
		System.out.println("Login Button clicked");
	}

}
