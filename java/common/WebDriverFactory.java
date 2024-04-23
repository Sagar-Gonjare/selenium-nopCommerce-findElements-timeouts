package common;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
	
	private static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver localdriver) {
		driver = localdriver;
		}
	
	
}
