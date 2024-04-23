package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvolkedMethodListnerImpl implements IInvokedMethodListener{

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
//		WebDriverFactory.getDriver().quit();
	}

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
			System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			WebDriverFactory.setDriver(driver);
			WebDriverFactory.getDriver().manage().window().maximize();
			WebDriverFactory.getDriver().get("https://demo.nopcommerce.com/register");
			
			
		}
}
