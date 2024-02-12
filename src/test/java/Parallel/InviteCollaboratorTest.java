package Parallel;

import java.awt.AWTException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.pages.InviteCollaborator;
import com.qa.util.JSONFileClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InviteCollaboratorTest {
	InviteCollaborator inviteCollaborator;
	WebDriver driver;
	JSONFileClass file;
	JSONObject user;

	@Then("delete all previous files")
	public void delete_all_previous_files() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.deleteAllPreviousFiles();
	}

	@Then("click on InviteCollaborator button")
	public void click_on_invite_collaborator_button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnInviteCollaboratorButton();
	}

	@Then("click on copy invitation button")
	public void click_on_copy_invitation_button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnCopyInvitationButton();
	}

	@Then("Click on cancle button for invite link button")
	public void click_on_cancle_button_of_invite_link_button() {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnCrossIconForCopyInvitation();
	}

	@Then("click on manage button")
	public void click_on_manage_button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnManageButton();
	}

	@Then("click on files button")
	public void click_on_files_button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnFilesButton();
	}

	@Then("click on Case button")
	public void click_on_case_button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnCaseupButton();
	}

	@Then("check for InviteCollaborator button")
	public void check_for_invite_collaborator_button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.checkForInviteCollaboratorButton();
	}

	@Then("check for InviteCollaborator button and settings button")
	public void check_for_invite_collaborator_button_and_settings_button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.checkForInviteCollaboratorButtonAndSettingsButton();
	}

	@Then("check for rename button ,file request button and delete button")
	public void check_for_rename_button_filerequest_and_delete_button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.checkForRenameButtonFileRequestButtonAndDeleteButton();
	}

	@Then("enter email for invite")
	public void enter_email_for_invite() {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.enterEmailForInvite();
	}

	@Then("enter email for invite again")
	public void enter_email_for_invite_again() {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.enterEmailForInviteAgain();
	}

	@Then("enter the email for send")
	public void enter_the_email_for_send() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.enterEmailForSend();
	}

	@Then("select invite as editor")
	public void select_invite_as_editor() {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.selectInviteAsEditor();
	}

	@Then("click on send button")
	public void click_on_send_button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnSendButton();
	}

	@Then("click on dropdown button")
	public void click_on_dropdown_button() {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnDropDownutton();
	}

	@Then("logout current user")
	public void logout_current_user() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.logoutCurrentUser();
	}

	@When("click on setting button in invite tab")
	public void click_on_setting_button_in_invite_tab() {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnSettingButtonInInviteTab();
	}

	@When("click on dropdown arrow")
	public void click_on_dropdown_arrow() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnDropdownArrow();

	}

	@When("select introducer limited radio button")
	public void selectInroducerLimitedRadioButton() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.selectInroducerLimitedRadioButton();
	}

	@When("select introducer radio button")
	public void select_Inroducer_Radio_Button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.selectInroducerRadioButton();
	}

	@When("select owner radio button")
	public void select_owner_Radio_Button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.selectOwnerRadioButton();
	}

	@When("select cocreator radio button")
	public void select_cocreato_Radio_Button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.selectCoCreatorRadioButton();
	}

	@When("select editor radio button")
	public void select_editor_Radio_Button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.selectEditorButton();
	}

	@When("click on dropdown arrow for folder")
	public void click_on_dropdown_arrow_for_folder() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnDropdownArrowForFolder();

	}

	@Then("select coowner radio button for folder")
	public void click_on_coowner_button_for_folder() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.selectCoOwnerRadioButtonForFolder();
	}

	@When("select manager radio button for folder")
	public void select_Manager_Radio_Button_for_folder() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.selectManagerButtonForFolder();
	}

	@When("select basic radio button for folder")
	public void select_Basic_Radio_Button_for_folder() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.selectBasicRadioButtonForFolder();
	}

	@When("select owner radio button for folder")
	public void select_owner_Radio_Button_for_folder() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.selectOwnerRadioButtonForFolder();
	}

	@When("select downloader radio button for folder")
	public void select_Downloader_Radio_Button_for_folder() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.selectDownloaderButtonForFolder();
	}

	@When("select viewer radio button for folder")
	public void select_Viewer_Radio_Button_for_folder() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.selectViewerRadioButtonForFolder();
	}

	@When("select viewer radio button for share")
	public void select_Viewer_Radio_Button_for_share() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.selectViewerRadioButtonForShare();
	}

	@When("select downloader radio button for share")
	public void select_downloader_Radio_Button_for_share() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.selectDownloaderRadioButtonForShare();
	}

	@When("select Coowner radio button for share")
	public void select_Coowner_Radio_Button_for_share() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.selectCoownerRadioButtonForShare();
	}

	@When("select Manager radio button for share")
	public void select_Manager_Radio_Button_for_share() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.selectManagerRadioButtonForShare();
	}

	@When("select Basic radio button for share")
	public void select_Basic_Radio_Button_for_share() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.selectBasicRadioButtonForShare();
	}

	@When("select editor radio button for folder")
	public void select_editor_Radio_Button_for_folder() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.selectEditorButtonForFolder();
	}

	@Then("check for introduce button")
	public void click_on_introduce_button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnIntroduceButton();
	}

	@When("click on dotted dropped menu of selected folder")
	public void click_on_dotted_dropped_menu_of_selected_folder() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnDottedDroppedMenuOfSelectedFolder();
	}

	@When("click on dotted dropped menu of selected folders")
	public void click_on_dotted_dropped_menu_of_selected_folders() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnDottedDroppedMenuOfSelectedFolders();
	}

	@When("click on dotted dropped menu of selected folder on files")
	public void click_on_dotted_dropped_menu_of_selected_folder_on_files() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnDottedDroppedMenuOfSelectedFolderonfiles();
	}

	@When("click on dotted dropped menu of selected folder on file")
	public void click_on_dotted_dropped_menu_of_selected_folder_on_file() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnDottedDroppedMenuOfSelectedFolderonfile();
	}

	@When("click on dotted dropped menu of selected shared folder")
	public void click_on_dotted_dropped_menu_of_selected_shared_folder() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnDottedDroppedMenuOfSelectedSharedFolder();
	}
	@When("click on dotted dropped menu of selected XSLS file")
	public void click_on_dotted_dropped_menu_of_selected_XSLS_file() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnDottedDroppedMenuOfSelectedXSLSFile();
	}
	@When("click on selected folder")
	public void click_on_selected_folder() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnSelectedFolder();
	}
	@When("click on selected witness folder")
	public void click_on_selected_witness_folder() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnSelectedWitnessFolder();
	}

	@When("check for dotted dropped menu of selected folder")
	public void check_for_dotted_dropped_menu_of_selected_folder() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.checkForDottedDroppedMenuOfSelectedFolder();
	}

	@When("check for dotted dropped menu of selected shared folder")
	public void check_for_dotted_dropped_menu_of_selected_shared_folder() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.checkForDottedDroppedMenuOfSelectedFolder();
	}

	@Then("click on depositions button")
	public void click_on_depositions_button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnDepositionsButton();

	}

	@Then("click on file request button")
	public void click_on_file_request_button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnFileRequestButton();

	}

	@Then("click on yes button for folder")
	public void click_on_yes_button_for_folder() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnYesButton();
	}

	@Then("click on preview button file request")
	public void click_on_preview_button_file_request() {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnPreviewButtonFileRequest();
	}

	@Then("Enter email for file request")
	public void enter_email_for_file_request() {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.enterEmailForFileRequest();
	}

	@Then("click on select file to upload")
	public void click_on_select_file_to_upload() throws AWTException, InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnSelectFileToUpload();
	}

	@Then("click on submit button for file request")
	public void click_on_submit_button_for_file_request() {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnSubmitButtonForFileRequest();
	}

	@Then("click on save button for file request")
	public void click_on_save_button_for_file_request() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnSaveButtonForFileRequest();
	}

	@Then("check the validation message for invitation sent")
	public void check_the_validation_message_for_invitation_sent()
			throws IOException, ParseException, InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.checkTheValidationMessageForInvitationSent();
	}

	@Then("check the validation message for rename folder name")
	public void check_the_validation_message_for_folder_name()
			throws IOException, ParseException, InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.checkTheValidationMessageForRenameFoldername();
	}

	@Then("check the validation message for file request")
	public void check_the_validation_message_for_file_request()
			throws IOException, ParseException, InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.checkTheValidationMessageForFileRequest();
	}

	@Then("check the validation message for folder delete")
	public void check_the_validation_message_for_folder_delete()
			throws IOException, ParseException, InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.checkTheValidationMessageForFolderDelete();
	}

	@Then("click on share button for file")
	public void click_on_share_button_for_file() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnShareButtonForFile();
	}
	@Then("click on move and copy button for file")
	public void click_on_move_and_copy_button_for_file() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnMoveAndCopyButtonForFile();
	}
	@Then("click and move and copy button for file")
	public void click_and_move_and_copy_button_for_file() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickAndMoveAndCopyButtonForFile();
	}
	@Then("click on copy button")
	public void click_on_copy_button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnCopyButton();
	}
	@Then("click on move button")
	public void click_on_move_button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnMoveButton();
	}

	@Then("click on shared user")
	public void click_on_shared_user() {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnSharedUser();
	}

	@Then("click on dropdown menu for selected shared user")
	public void click_on_dropdown_menu_for_selected_shared_user() {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnDropdownMenuForSelectedSharedUser();
	}

	@Then("click on remove button")
	public void click_on_remove_button() {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnRemoveButton();
	}

	@Then("click on yes button for shared user")
	public void click_on_yes_button_for_shared_user() {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnYesButtonForSharedUser();
	}

	@Then("check for deposition is removed from basic role")
	public void check_for_deposition_is_removed_from_bsic_role() {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.checkFordepositionIsRemovedFromBasicRole();
	}

	@When("click on delete button for file deleted")
	public void click_on_delete_button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnDeleteButtonForFileDeleted();
	}

	@When("click on share link toggle button")
	public void click_on_shaare_link_toggle_button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickonSharelinkToggleButton();
	}

	@When("click on dropdown arrow and select view only option")
	public void click_on_dropdown_arrow_and_select_view_only_option() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnDropDownArrowAndSelectViewOnlyOption();
	}

	@When("click on dropdown arrow and select view and download option")
	public void click_on_dropdown_arrow_and_select_view_and_download_option() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnDropDownArrowAndSelectViewAndDownloadOption();
	}
	@When("click on dropdown arrow and select restricted link option")
	public void click_on_dropdown_arrow_and_select_restricted_option() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnDropDownArrowAndSelectRestrictedLinkOption();
	}

	@Then("click on copy link button and open in new window")
	public void click_on_copy_link_button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnCopyLinkButton();
	}

	@Then("click on close button")
	public void click_on_close_button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnCloseButton();
	}
	@Then("enter the folder name")
	public void enter_the_folder_name() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.enterTheFolderName();
	}
	@Then("click on save button for add folder")
	public void click_on_save_button_for_add_folder() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickOnSaveButtonForSaveFolder();
	}
	@Then("click on enable password toggle button and enter password")
	public void click_on_enable_password_toggle_button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.clickonenablepasswordtogglebutton();
	}
	@Then("enter password and save button")
	public void enter_password_save_button() throws InterruptedException {
		inviteCollaborator = new InviteCollaborator(DriverFactory.getDriver());
		inviteCollaborator.enterPasswordAndSaveButtonbutton();
	}
	
}
