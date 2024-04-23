package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.WebDriverFactory;

public class WelcomePage {
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a")
	static
	WebElement continueBtn;
 
	
	public WelcomePage() {
		PageFactory.initElements(WebDriverFactory.getDriver(), this);

	}
 
	public HomePage navigateTOHomePage() throws InterruptedException {
		Thread.sleep(5000);
		continueBtn.click();
		return new HomePage();
	}
 
}
