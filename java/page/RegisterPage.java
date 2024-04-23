package page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.WebDriverFactory;

public class RegisterPage {

	public RegisterPage() {
		PageFactory.initElements(WebDriverFactory.getDriver(), this);

	}

	@FindBy(tagName = "script")
	List<WebElement> scripts;

	public void printScripts() {

		for (WebElement script : scripts)
			System.out.println(script.getAttribute("type"));

	}

	private WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), Duration.ofSeconds(2));

	@FindBy(xpath = "//*[@id=\"gender-male\"]")
	WebElement maleRadioButton;

	@FindBy(xpath = "//*[@id=\"gender-female\"]")
	WebElement femaleRadioButton;

	@FindBy(xpath = "//*[@id=\"FirstName\"]")
	WebElement firstName;

	@FindBy(xpath = "//*[@id=\"LastName\"]")
	WebElement lastName;

	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")
	WebElement dateDOB;

	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")
	WebElement monthDOB;

	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")
	WebElement yearDOB;

	@FindBy(xpath = "//*[@id=\"Email\"]")
	WebElement eMail;

	@FindBy(xpath = "//*[@id=\"Company\"]")
	WebElement companyName;

	@FindBy(xpath = "//*[@id=\"Password\"]")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"ConfirmPassword\"]")
	WebElement confirmPass;

	@FindBy(xpath = "//*[@id=\"register-button\"]")
	WebElement registerBtn;

	@FindBy(xpath="/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement loginBtn;
	
	
	
	public WelcomePage register(String strFirstName, String strLastName, String strEmail, String strCompanyName,
			String strPassWord, String strConfirmPassWord) throws InterruptedException {

		maleRadioButton.click();
		firstName.sendKeys(strFirstName);
		lastName.sendKeys(strLastName);

		Select dateSelect = new Select(dateDOB);
		dateSelect.selectByIndex(4);

		Select monthSelect = new Select(monthDOB);
		monthSelect.selectByIndex(0);

		Select yearSelect = new Select(yearDOB);
		yearSelect.selectByVisibleText("2004");

		eMail.sendKeys(strEmail);
		companyName.sendKeys(strCompanyName);
		password.sendKeys(strPassWord);
		confirmPass.sendKeys(strConfirmPassWord);
		registerBtn.click();

		Thread.sleep(5000);

		// Assert.assertTrue(WelcomePage.continueBtn.isDisplayed());
		return new WelcomePage();

	}

	public LoginPage navigateToLogin() {
		loginBtn.click();
		return new LoginPage();

	}

}
