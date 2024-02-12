package Parallel;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.pages.Adminconsole;
import com.qa.util.JSONFileClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adminconsoletest {
	Adminconsole adminconsole;
	WebDriver driver;
	JSONFileClass file;
	JSONObject user;


@When("click on my profile logo")
public void click_on_my_profile_logo() throws InterruptedException {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.clickonmyprofilelogo();
}

@When("click on the admin Console button")
public void click_on_the_admin_console_button() {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.clickontheadminconsolebutton();
}

@When("click on the users button")
public void click_on_the_users_button() {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.clickontheusersbutton();
}

@When("click on the toggle button for my email")
public void click_on_the_toggle_button_for_my_email() {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.clickonthetogglebuttonformyemail();
}

@When("click on the remove button")
public void click_on_the_remove_button() {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.clickontheremovebutton();
}

@When("confirm by clicking the no-remove user button")
public void confirm_by_clicking_the_no_remove_user_button() {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.confirmbyclickingthenoremoveuserbutton();
}
@When("click on add new user and write user name")
public void click_on_add_new_user_and_write_user_name() {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.clickonaddnewuserandwriteusername();
}

@When("click on invite user button")
public void click_on_invite_user_button() {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.clickoninviteuserbutton();
}

@When("check the validation message for user invited")
public void check_the_validation_message_for_user_invited() throws IOException, ParseException, InterruptedException {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.checkthevalidationmessageforuserinvited();
}
@When("invite user and accecpt invite in mailinator")
public void open_mailinator_site_in_new_window() throws InterruptedException {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.inviteuserandacceptinviteinmailinator();
}

@When("accept the invitation through mailinator")
public void accept_the_invitation_through_mailinator() throws InterruptedException {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.accepttheinvitationthroughmailiantor();
}
@Then("create user window open then enter full name")
public void create_user_window_open_then_enter_full_name() {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.createuserwindowopenthenenterfullname();
}

@Then("click on password button and enter password")
public void click_on_password_button_and_enter_password() {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.clickonpasswordbuttonandenterpassword();
}

@Then("click on confirm password button and same password")
public void click_on_confirm_password_button_and_same_password() {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.clickonconfirmpasswordbuttonandsamepassword();
}

@Then("check the term and condition")
public void check_the_term_and_condition() {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.checkthetermandcondition();
}

@Then("click on create account")
public void click_on_create_account() {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.clickoncreateaccount();
}

@Then("click on the toggle button for invited email")
public void click_on_the_toggle_button_for_invited_email() {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.clickOntheToggleButtonForInvitedEmail();
}

@Then("click on remove button in toggle button")
public void click_on_remove_button_in_toggle_button() {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.clickOnRemoveButtonInToggleButton();
}

@Then("click on no,remove user button")
public void click_on_no_remove_user_button() {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.clickonNoRemoveUserButton();
}
@Then("click on yes assign new user button")
public void click_on_yes_assign_new_user_button() {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.clickonyesassignnewuserbutton();
}

@Then("enter email to assign deposition")
public void enter_email_to_assign_deposition() {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.enteremailtoassigndeposition();
}
@Then("remove invited user if user already invitited")
public void remove_invited_user_if_already_invited() throws InterruptedException {
	adminconsole = new Adminconsole(DriverFactory.getDriver());
	adminconsole.removeinviteduserifalreadyinvited();
}


}
