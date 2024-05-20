package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShot {
	
	@Test
	public void captureScreenshot() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://gcreddy.com/project/");
		driver.manage().window().maximize();
		
		File shot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// FileHander (Source & Destination)
		try {
			FileHandler.copy(shot, new File("ScreenShot/CapturedScreenshot.png"));
		} catch (IOException e) {
			System.out.println("Exception Handled: " +e.getMessage());
		}
		
	}

}
