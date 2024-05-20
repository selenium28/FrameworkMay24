package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CapturedFailedTestCases {
	WebDriver driver;
	
	@Test
	public void loginTest() {
	    driver = new ChromeDriver();
		driver.get("https://gcreddy.com/project/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[text()='login']")).click();
		// Wrong xpath for capturing failed test case
		driver.findElement(By.xpath("//*[text()=' In']")).click();
		
	}
	
	@AfterMethod
	public void failureScreenShot(ITestResult result) throws IOException {
		
		if (ITestResult.FAILURE==result.getStatus()) {
			try {
				File shot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(shot, new File("ScreenShot/FailureScreenshot.png"));
			} catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}
			
		}
		
		driver.quit();
		
	}

}
