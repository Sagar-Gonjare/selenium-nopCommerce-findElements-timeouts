package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.IInvolkedMethodListnerImpl;
import page.RegisterPage;

@Listeners(IInvolkedMethodListnerImpl.class)
public class LoginTest {

	@Test(priority=1)
	public void loginWithRegistration() throws InterruptedException {
		RegisterPage rp = new RegisterPage();
		rp.register("Sagar", "Gonjare", "sagargonjare21@gmail.com", "dnyanayog ", "12345678", "12345678")
				.navigateTOHomePage();
		// .loginSuccess("sagargonjare2004@gmail.com", "12345678");

	}
	
	@Test(priority=2)
	public void loginWithEmailAndPass() {
		RegisterPage rp = new RegisterPage();
		rp.navigateToLogin().loginSuccess("sagargonjare21@gmail.com", "12345678");
	}
	
}
