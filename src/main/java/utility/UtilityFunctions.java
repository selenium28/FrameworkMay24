package utility;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.SetupFile;

public class UtilityFunctions extends SetupFile{
	
	public void clickOnWebElement(WebElement element, long waitTimeInSec) {
		WebDriverWait webWait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSec));
		WebElement elements = null;
		elements = webWait.until(ExpectedConditions.elementToBeClickable(element));
		elements.click();
		
	}
	
	public void sendKeysWebElement(WebElement element, String text) {
		clickOnWebElement(element, 10);
		element.clear();
		element.sendKeys(text);
	}
	
	// To select a dropdown 3 methods

}
