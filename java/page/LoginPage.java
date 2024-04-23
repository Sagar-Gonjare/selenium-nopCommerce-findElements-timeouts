package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.WebDriverFactory;

public class LoginPage {
	public LoginPage() {
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}

	@FindBy(xpath="//*[@id=\"Email\"]")
	WebElement userEmail;

	@FindBy(xpath="//*[@id=\"Password\"]")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
	WebElement loginBtn;
	
	public WelcomePage loginSuccess (String strEmail, String strPassword) {
		userEmail.sendKeys(strEmail);
		password.sendKeys(strPassword);
		loginBtn.click();
		
		return new WelcomePage();
		
	}
	
	
}
