package page;

import org.openqa.selenium.support.PageFactory;

import common.WebDriverFactory;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
}
