package Parallel;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.pages.ManagerRole;
import com.qa.util.JSONFileClass;

import io.cucumber.java.en.When;

public class ManagerRoleTest {
	WebDriver driver;
	ManagerRole managerrole;
	JSONFileClass file;
	JSONObject user;

	@When("login with account manager role")
	public void login_with_account_owner_role() throws IOException, ParseException {
		managerrole = new ManagerRole(DriverFactory.getDriver());
		managerrole.loginwithaccountowneraccount();
	}
}
