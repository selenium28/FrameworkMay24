package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupFile {
	public static WebDriver driver;
	public static String url = "https://gcreddy.com/project/";
	
	public static void setupMethod() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void tearDown() {
		driver.quit();
	}
	
	

}
