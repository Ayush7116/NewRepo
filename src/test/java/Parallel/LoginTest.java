package Parallel;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.pages.Login;
import com.qa.util.JSONFileClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	WebDriver driver;
	Login login;
	JSONFileClass file;
	JSONObject user;

	@When("user navigate to the caseup baseurl")
	public void user_navigate_to_the_caseup_baseurl() {
	}

	@When("enter the email {string}")
	public void enter_the_email(String Email) {
		login = new Login(DriverFactory.getDriver());
		login.enterTheEmail(Email);
	}

	@Then("click on submit buttonn")
	public void click_on_submit_button() throws InterruptedException {
		login = new Login(DriverFactory.getDriver());
		login.clickOnSubmitButton();
	}

	@Then("check the validation message")
	public void check_the_validation_Message() throws IOException, ParseException {
		login = new Login(DriverFactory.getDriver());
		login.checkthevalidationmessage();
	}

	@Then("check the validation alert")
	public void check_the_validation_alert() throws IOException, ParseException {
		login = new Login(DriverFactory.getDriver());
		login.checkthevalidalertmessage();
	}

	@Then("enter the password {string}")
	public void enter_the_password(String Password) {
		login = new Login(DriverFactory.getDriver());
		login.enterThePassword(Password);
	}

	@Then("click on login button")
	public void click_on_login_button() {
		login = new Login(DriverFactory.getDriver());
		login.clickOnLoginButton();
	}

	@Then("check the validation message for wrong password.")
	public void check_the_validation_message_for_wrong_password() throws IOException, ParseException {
		login = new Login(DriverFactory.getDriver());
		login.checkthevalidationmessageforwrongpassword();
	}
}
