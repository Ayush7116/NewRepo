package Parallel;

import java.awt.AWTException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.pages.CreateDeposition;
import com.qa.util.JSONFileClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateDepositionTest {
	WebDriver driver;
	CreateDeposition createdeposition;
	JSONFileClass file;
	JSONObject user;

	@When("login with account owner role")
	public void login_with_account_owner_role() throws IOException, ParseException {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.loginwithaccountowneraccount();
	}

	@When("click on create new button")
	public void click_on_create_new_button() throws InterruptedException {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.clickOnCreateNewutton();
	}

	@Then("enter witness name {string}")
	public void enter_witness_name(String Witness_Name) throws InterruptedException {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.enterWitnessName(Witness_Name);
	}

	@Then("enter noticing firm name {string}")
	public void enter_noticing_firm_name(String Noticing_Firm_Name) throws InterruptedException {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.enterNoticingFirmName(Noticing_Firm_Name);
	}

	@Then("enter case name {string}")
	public void enter_case_name(String Case_Name) throws InterruptedException {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.enterCaseName(Case_Name);
		Thread.sleep(3000);
	}

	@Then("enter witness name")
	public void enter_witness_name() throws InterruptedException {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.enterWitnessName();
	}

	@Then("enter noticing firm name")
	public void enter_noticing_firm_name() throws InterruptedException {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.enterNoticingFirmName();

	}

	@Then("enter case name")
	public void enter_case_name() throws InterruptedException {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.enterCaseName();
	}

	@Then("click on create button for not valid data")
	public void click_on_create_button_for_not_valid_data() throws InterruptedException {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.clickOnCreateButtonForNotValidData();
	}

	@Then("click on create button")
	public void click_on_create_button() throws InterruptedException {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.clickOnCreateButton();
	}

	@Then("click on upload file button")
	public void click_on_upload_file_button() throws InterruptedException {
		;
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.clickOnUploadFileButton();
	}

	@Then("upload the file")
	public void upload_the_file() throws InterruptedException, AWTException {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.uploadTheFile();
	}

	@Then("upload the file image")
	public void upload_the_file_image() throws InterruptedException, AWTException {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.uploadTheFileImage();
	}

	@Then("upload the pdf file")
	public void upload_the_pdf_file() throws InterruptedException, AWTException {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.uploadThepdfFile();
	}

	@Then("upload the pdf")
	public void upload_the_pdf() throws InterruptedException, AWTException {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.uploadThepdfFile();
	}

	@Then("click in submit button")
	public void click_in_submit_button() throws InterruptedException {

		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.clickInSubmitButton();
	}

	@When("click on dotted dropped menu of created deposition")
	public void click_on_dotted_dropped_menu_of_created_deposition() throws InterruptedException {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.clickOnDottedDroppedMenuOfCreatedDeposion();
	}

	@When("click on setting button")
	public void click_on_setting_button() {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.clickOnSettingButton();
	}

	@Then("update witness name")
	public void update_witness_name() {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.updateWitnessName();
	}

	@Then("click on update button")
	public void click_on_update_button() throws InterruptedException {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.clickOnUpdatebutton();
	}

	@Then("update witness name with blank data")
	public void update_witness_name_with_blank_data() {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.updateWitnessNameWithBlankData();
	}

	@Then("Check the validation message for blank message")
	public void check_the_validation_message_for_blank_message() {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
	}

	@Then("update witness name with invalid data")
	public void update_witness_name_with_invalid_data() {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.updateWitnessNameWithInvalidData();
	}

	@Then("Check the validation message for invalid data")
	public void check_the_validation_message_for_invalid_data() {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.checkTheValidationMessageForInvalidData();
	}

	// Step definition for delete deposition

	@When("click on delete button")
	public void click_on_delete_button() throws InterruptedException {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.clickOnDeleteButton();
	}

	@Then("click on yes button")
	public void click_on_yes_button() {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.clickOnYesButton();
	}

	@Then("check the validation message for deposition deleted")
	public void check_the_validation_message_for_deposition_deleted()
			throws IOException, ParseException, InterruptedException {
		createdeposition = new CreateDeposition(DriverFactory.getDriver());
		createdeposition.checkTheValidationMessageForDepositionDeleted();
	}

}
