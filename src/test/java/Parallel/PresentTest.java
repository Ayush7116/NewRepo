package Parallel;

import java.awt.AWTException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.pages.Present;
import com.qa.util.JSONFileClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PresentTest {
	WebDriver driver;
	Present present;
	JSONFileClass file;
	JSONObject user;

	@When("login with admin role")
	public void login_with_admin_role() throws IOException, ParseException {
		present = new Present(DriverFactory.getDriver());
		present.loginwithadmin();
	}

	@When("login with guest role")
	public void login_with_guest_role() throws IOException, ParseException {
		present = new Present(DriverFactory.getDriver());
		present.loginwithguest();
	}

	@When("login with basic role")
	public void login_with_basic_role() throws IOException, ParseException {
		present = new Present(DriverFactory.getDriver());
		present.loginwithbasic();
	}

	@Then("click on present button")
	public void click_on_present_button() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		present = new Present(DriverFactory.getDriver());
		present.clickOnPresentButton();
		Thread.sleep(2000);

	}

	@Then("click on upload click button")
	public void click_on_upload_click_button() throws AWTException, InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.clickOnUploadClickButton();
	}

	@Then("click on cancle button")
	public void click_on_cancle_button() {
		present = new Present(DriverFactory.getDriver());
		present.clickOnCancleButton();
	}

	@Then("click on cancle button for shared section")
	public void click_on_cancle_button_for_shared_section() {
		present = new Present(DriverFactory.getDriver());
		present.clickOnCancleButtonForSharedSection();
	}

	@Then("click on introduce button")
	public void click_on_introduce_button() throws InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.clickOnIntroduceButton();
	}

	@Then("check the validation message for introduce exhibit")
	public void check_the_validation_message_for_introduce_exhibit()
			throws IOException, ParseException, InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.checkTheValidationMessageForIntroduceExhibit();
	}

	@When("click on dotted dropped menu of selected file")
	public void click_on_dotted_dropped_menu_of_selected_file() {
		present = new Present(DriverFactory.getDriver());
		present.clickOnDottedDroppedMenuOfSelectedFile();
	}

	@When("change the exhibit number to empty")
	public void change_the_exhibit_number_to_empty() {
		present = new Present(DriverFactory.getDriver());
		present.changeTheExhibitNumberToEmpty();
	}

	@When("check the validation message for introduce exhibit with empty value")
	public void check_the_validation_message_for_introduce_exhibit_with_empty_value()
			throws InterruptedException, IOException, ParseException {
		present = new Present(DriverFactory.getDriver());
		present.checkTheValidationMessageForIntroduceExhibitWithEmptyValue();
	}

	@When("change the exhibit number to value")
	public void change_the_exhibit_number_to_value() {
		present = new Present(DriverFactory.getDriver());
		present.changeTheExhibitNumberToValue();
	}

	@Then("click on undo exhibit button")
	public void click_on_undo_exhibit_button() {
		present = new Present(DriverFactory.getDriver());
		present.clickOnUndoExhibitButton();
	}

	@When("click on yes button for undo deposition")
	public void click_on_yes_button_for_undo_deposition() throws InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.clickOnYesButtonForUndoDeposition();
	}

	@Then("check the validation message for exhibit removed")
	public void check_the_validation_message_for_exhibit_removed()
			throws IOException, ParseException, InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.checkTheValidationMessageForExhibitRemoved();
	}

	@Then("click on shared button")
	public void click_on_shared_button() {
		present = new Present(DriverFactory.getDriver());
		present.clickOnSharedButton();
	}

	@Then("click on edit exhibit button")
	public void click_on_edit_exhibit_button() {
		present = new Present(DriverFactory.getDriver());
		present.clickOnEditExhibitButton();

	}

	@Then("change the exhibit number")
	public void change_the_exhibit_number() {
		present = new Present(DriverFactory.getDriver());
		present.changeTheExhibitNumber();

	}

	@Then("click on save button")
	public void click_on_save_button() throws InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.clickOnSaveButton();
	}

	@Then("check the validation message for change exhibit number")
	public void check_the_validation_message_for_change_exhibit_number()
			throws IOException, ParseException, InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.checkTheValidationMessageForChangeExhibitNumber();
	}

	@Then("click on rename button")
	public void click_on_rename_button() {
		present = new Present(DriverFactory.getDriver());
		present.clickOnRenameButton();
	}

	@Then("change the file name")
	public void change_the_file_name() {
		present = new Present(DriverFactory.getDriver());
		present.changeTheFileName();
	}
	@Then("change the case name")
	public void change_the_case_name() {
		present = new Present(DriverFactory.getDriver());
		present.changeTheCaseName();
	}
	@Then("change the witness name")
	public void change_the_witness_name() {
		present = new Present(DriverFactory.getDriver());
		present.changeTheWitnessName();
	}

	@Then("change the file name to empty")
	public void change_the_file_name_to_empty() {
		present = new Present(DriverFactory.getDriver());
		present.changeTheFileNameToEmpty();
	}

	@Then("click on update button to save file")
	public void click_on_update_button_to_save_file() throws InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.clickOnUpdateButtonToSaveFile();
	}

	@Then("check the validation message for change file name")
	public void check_the_validation_message_for_change_file_name()
			throws IOException, ParseException, InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.checkTheValidationMessageForChangeFileName();
	}

	@Then("check the validation message for change file name with empty data")
	public void check_the_validation_message_for_change_file_name_with_empty_data()
			throws IOException, ParseException, InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.checkTheValidationMessageForChangeFileNameWithEmptyData();
	}

	@Then("click on upload icon")
	public void click_on_upload_icon() {
		present = new Present(DriverFactory.getDriver());
		present.clickOnUploadIcon();
	}

	@Then("upload the image")
	public void upload_the_image() throws InterruptedException, AWTException {
		present = new Present(DriverFactory.getDriver());
		present.uploadTheImage();
	}

	@Then("click on search button")
	public void click_on_search_button() {
		present = new Present(DriverFactory.getDriver());
		present.clickOnSearchButton();
	}

	@Then("select the inputbox and type what you want to search")
	public void select_the_inputbox_and_type_what_you_want_to_search() throws InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.selectTheInputboxAndTypeWhatYouWantToSearch();
	}

	@Then("check file is present or not")
	public void check_file_is_present_or_not() {
		present = new Present(DriverFactory.getDriver());
		present.checkFileIsPresentOrNot();
	}

	@Then("click on share button")
	public void click_on_share_button() throws InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.clickOnShareButton();
	}

	@Then("click on new button")
	public void click_on_new_button() throws InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.clickOnNewButton();
	}

	@Then("click on previous exhibit button")
	public void click_on_previous_exhibit_button() {
		present = new Present(DriverFactory.getDriver());
		present.clickOnPreviousExhibitButton();
	}

	@When("click on download button")
	public void click_on_download_button() throws InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.clickOnDownloadButton();
	}

	@When("click on download button for shared")
	public void click_on_download_button_for_shared() throws InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.clickOnDownloadButtonForShared();
	}

	@Then("click on DropDown Toggle show")
	public void click_on_drop_down_toggle_show() throws InterruptedException {
		Thread.sleep(2000);
		present = new Present(DriverFactory.getDriver());
		present.ClickOnDropDownToggleShow();
	}

	@Then("click on select dropdown")
	public void click_on_select_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		present = new Present(DriverFactory.getDriver());
		present.ClickOnSelectDropdown();
	}

	@Then("click on sync button")
	public void click_on_sync_button() throws InterruptedException {
		Thread.sleep(2000);
		present = new Present(DriverFactory.getDriver());
		present.ClickOnSyncButton();
	}

	@Then("click on preview button")
	public void click_on_preview_button() throws InterruptedException {
		Thread.sleep(2000);
		present = new Present(DriverFactory.getDriver());
		present.ClickOnPreviewButton();
	}

	@Then("click on switch Previewer Status button")
	public void click_on_switch_previewer_status_button() throws InterruptedException {
		Thread.sleep(2000);
		present = new Present(DriverFactory.getDriver());
		present.ClickOnSwitchPreviewerStatusButton();
	}

	@Then("click on invite link button")
	public void click_on_invite_link_button() {
		present = new Present(DriverFactory.getDriver());
		present.clickOnInviteLinkButton();
	}

	@Then("click on copy link button and open new window")
	public void click_on_copy_link_button() throws InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.clickOnCopyLinkButton();
	}

	@Then("click on Cross icon")
	public void click_on_cross_icon() {
		present = new Present(DriverFactory.getDriver());
		present.clickOnCrossIcon();
	}

	@Then("open new window")
	public void open_new_window() throws InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.openNewWindow();
	}

	@Then("click on view exhibits button")
	public void click_on_view_exhibits_button() {
		present = new Present(DriverFactory.getDriver());
		present.clickOnViewExhibitsButton();
	}

	@Then("enter your name")
	public void enter_your_name() {
		present = new Present(DriverFactory.getDriver());
		present.enterYourName();
	}

	@Then("enter your email")
	public void enter_your_email() {
		present = new Present(DriverFactory.getDriver());
		present.enterYourEmail();
	}

	@Then("press continue button")
	public void press_continue_button() throws InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.pressContinueButton();
	}

	@Then("Download the file")
	public void download_the_file() throws InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.downloadTheFile();
	}

	@Then("Cancle the current window and go to pevious window")
	public void cancle_the_current_window_and_go_to_pevious_window() throws InterruptedException {
		Thread.sleep(2000);
		present = new Present(DriverFactory.getDriver());
		present.cancleTheCurrentWindowAndGoToPeviousWindow();
	}

	@Then("Click on cancle button of invite link button")
	public void click_on_cancle_button_of_invite_link_button() {
		present = new Present(DriverFactory.getDriver());
		present.clickOnCancleButtonOfInviteLinkButton();
	}

	@When("check create button is visible or not")
	public void check_create_button_is_visible_or_not() throws InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.checkCreateButtonIsVisibleOrNot();
	}
	@When("check create button is visible")
	public void check_create_button_is_visible() throws InterruptedException {
		present = new Present(DriverFactory.getDriver());
		present.checkCreateButtonIsVisible();
	}

}
