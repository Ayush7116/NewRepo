package com.qa.pages;

import java.awt.AWTException;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.factory.WebDriverUtil;
import com.qa.util.JSONFileClass;

public class InviteCollaborator {
	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right drop-depo py-4 show')]//span[contains(@class,'dropdown-list-prop pe-4')][normalize-space()='Invite Collaborator']")
	WebElement InviteCollaborator;
	@FindBy(xpath = "//span[@class='dropdown-list-prop pe-4'][normalize-space()='Copy Invitation']")
	WebElement CopyInvitationButton;
	@FindBy(xpath = "//input[contains(@placeholder,'Enter Email..')]")
	WebElement EmailForInvite;
	@FindBy(xpath = "//span[contains(text(), 'Editor')]/following-sibling::span[@class='checkmark-1']")
	WebElement EditorCheckbox;
	@FindBy(xpath = "//span[@class='btn-text position-relative']//*[name()='svg']")
	WebElement DropDownarrow;
	@FindBy(xpath = "(//button[normalize-space()='Basic'])[1]")
	WebElement DropDownarrowFolder;
	@FindBy(xpath = "//button[normalize-space()='Send']")
	WebElement Sendbutton;
	@FindBy(xpath = "//span[contains(@class,'depo-data-right')][normalize-space()='Manage Files']")
	WebElement Managebutton;
	@FindBy(xpath = "//div[@class='dropdown']//button[@id='dropdownMenuLink-header']")
	WebElement usermenu;
	@FindBy(xpath = "//div[contains(@class,'dropdown-menu w-100 header-dropdown-menu py-4 w-auto custom-header-dropdown show')]//span[contains(@class,'fs-13 fw-400')][normalize-space()='Logout']")
	WebElement Logoutbutton;
	@FindBy(xpath = "//div[contains(@class,'mx-2 header-copy d-flex justify-content-between align-items-center mb-5 pb-3')]//div[contains(@aria-label,'Close')]//*[name()='svg']")
	WebElement crossbutton;
	@FindBy(xpath = "(//span[contains(@class,'dropdown-list-prop pe-4')][normalize-space()='Settings'])[1]")
	WebElement SettingButton;
	@FindBy(xpath = "//span[@class='btn-text position-relative']//*[name()='svg']")
	WebElement downarrow;
	@FindBy(xpath = "//span[contains(text(), 'Introducer-Limited')]/following-sibling::span[@class='checkmark-1']")
	WebElement IntroducerLimitedRadioBtn;
	@FindBy(xpath = "(//span[contains(text(), 'Introducer')]/following-sibling::span[@class='checkmark-1'])[1]")
	WebElement IntroducerRadioBtn;
	@FindBy(xpath = "//span[contains(text(), 'Owner')]/following-sibling::span[@class='checkmark-1']")
	WebElement OwnerRadioBtn;
	@FindBy(xpath = "//span[contains(text(), 'Co-Creator')]/following-sibling::span[@class='checkmark-1']")
	WebElement CoCreatorLimitedRadioBtn;
	@FindBy(xpath = "//span[contains(text(), 'Editor')]/following-sibling::span[@class='checkmark-1']")
	WebElement EditorRadioBtn;
	@FindBy(xpath = "((//span[contains(text(),'Introduce')])/parent::button)[1]")
	WebElement IntroduceButton;
	@FindBy(xpath = "//span[contains(text(), 'Co-Owner')]/following-sibling::span[@class='checkmark']")
	WebElement CoownerRadioBtn;
	@FindBy(xpath = "(//span[contains(text(), 'Manager')]/following-sibling::span[@class='checkmark'])[1]")
	WebElement ManagerRadioBtn;
	@FindBy(xpath = "//span[contains(text(), 'Owner')]/following-sibling::span[@class='checkmark']")
	WebElement OwnerFolderRadioBtn;
	@FindBy(xpath = "//span[contains(text(), 'Basic')]/following-sibling::span[@class='checkmark']")
	WebElement BaseicRadioBtn;
	@FindBy(xpath = "//span[contains(text(), 'Editor')]/following-sibling::span[@class='checkmark']")
	WebElement EditorFolderRadioBtn;
	@FindBy(xpath = "//span[contains(text(), 'Downloader')]/following-sibling::span[@class='checkmark']")
	WebElement DownloaderButton;
	@FindBy(xpath = "//span[contains(text(), 'Viewer')]/following-sibling::span[@class='checkmark']")
	WebElement ViewerButton;
	@FindBy(xpath = "//span[contains(text(), 'Viewer')]/following-sibling::span[@class='checkmark-1']")
	WebElement ViewerShareButton;
	@FindBy(xpath = "//span[contains(text(), 'Downloader')]/following-sibling::span[@class='checkmark-1']")
	WebElement DownloaderShareButton;
	@FindBy(xpath = "//span[contains(text(), 'Co-Owner')]/following-sibling::span[@class='checkmark-1']")
	WebElement CoownerrShareButton;
	@FindBy(xpath = "//span[contains(text(), 'Manager')]/following-sibling::span[@class='checkmark-1']")
	WebElement ManagerShareButton;
	@FindBy(xpath = "//span[contains(text(), 'Basic')]/following-sibling::span[@class='checkmark-1']")
	WebElement BasicShareButton;
	@FindBy(xpath = "(//a[@id='dropdownMenuLink-dotted'])[1]")
	WebElement DottedDroppedMenuForFolder;
	@FindBy(xpath = "(//a[@id='dropdownMenuLink-dotted'])[2]")
	WebElement DottedDroppedMenuForSharedFolder;
	@FindBy(xpath = "(//span[@class='checkmark'])[1]")
	WebElement CheckboxMenuForFolder;
	@FindBy(xpath = "(//span[@class='checkmark'])[3]")
	WebElement CheckboxMenuForFile;
	@FindBy(xpath = "(//span[@class='checkmark'])[2]")
	WebElement CheckboxMenuForFolders;
	@FindBy(xpath = "//div[@id='delete-confirmation']//div[contains(@role,'document')]//div[contains(@class,'modal-content delete-depo')]//div[contains(@class,'p-0')]//div[contains(@class,'vd-rename-file-popup')]//div[contains(@class,'modal-below-border mt-5 py-3 px-4')]//div//a[contains(@type,'submit')]")
	WebElement Yesbuttonforfolder;
	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right drop-depo py-4 show')]//span[contains(@class,'dropdown-list-prop pe-4')][normalize-space()='File Request']")
	WebElement FileRequestbutton;
	@FindBy(xpath = "(//div[contains(text(),'Preview')])[1]")
	WebElement PreviewButton;
	@FindBy(xpath = "//input[@placeholder='Enter your email address']")
	WebElement EnterEmailForFileRequest;
	@FindBy(xpath = "//label[normalize-space()='Or, select files to upload']")
	WebElement FileuploadButton;
	@FindBy(xpath = "//div[@class=' empty-depo-button-success px-4 py-2 pointer']")
	WebElement SubmitButtonForFileRequest;
	@FindBy(xpath = "(//a[contains(.,'Depositions')])[1]")
	WebElement DepositionsButton;
	@FindBy(xpath = "(//button[contains(@class,'vd-create-new-btn empty-depo-button-success px-4 py-2 pointer rename-modal-custom-width')])[1]")
	WebElement SaveButtonForFileRequest;
	@FindBy(xpath = "//div[@class='vd-left-nav p-3 border-end position-fixed d-none d-xl-block']//div[normalize-space()='Files']")
	WebElement FilesButton;
	@FindBy(xpath = "//div[@class='MuiAlert-message']")
	WebElement validationMessage;
	@FindBy(xpath = "//td[contains(@title,'CASE')]")
	WebElement casebutton;
	@FindBy(xpath = "(//span[contains(@class,'dropdown-list-prop pe-4')][normalize-space()='Rename'])[1]")
	WebElement RenameButton;
	@FindBy(xpath = "//span[@class='dropdown-list-prop pe-4'][normalize-space()='Share']")
	WebElement ShareButton;
	@FindBy(xpath = "(//span[@class='dropdown-list-prop pe-4'])[6]")
	WebElement MoveAndCopyButton;
	@FindBy(xpath = "(//a[contains(@data-bs-target,'#files-move-copy')]//span[contains(@class,'ps-4 pe-4')])[2]")
	WebElement MoveAndCopyButtonForMove;
	@FindBy(xpath = "//div[contains(@class,'modal-below-border py-3 px-4')]//div[contains(@class,'false')]")
	WebElement CopyButton;
	@FindBy(xpath = "//div[contains(@class,'pointer empty-depo-button-dismiss fs-13 fw-500 font-family-sfpro px-4 py-2')][normalize-space()='Move']")
	WebElement MoveButton;
	@FindBy(xpath = "//input[@placeholder='Enter Email..']")
	WebElement EnterEmailForShare;
	@FindBy(xpath = "//div[@class='vd-filter-chekbox pe-3']//span[@class='checkmark']")
	WebElement FolderCheckBox;
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	WebElement Deletebutton;
	@FindBy(xpath = "//span[contains(@class,'col-md-8 col-6 d-flex flex-column')]//span[contains(@class,'d-flex')]")
	WebElement Webelementbutton;
	@FindBy(xpath = "(//span[contains(@class,'files-edit-hover w-100 row gx-0')]//span[contains(@class,'d-flex')])[1]")
	WebElement Witnesselementbutton;
	@FindBy(xpath = "(//span[contains(@class,'checkmark')])[1]")
	WebElement CheckboxForFileDelete;
	@FindBy(xpath = "//span[@class='depo-data-right'][normalize-space()='Delete']")
	WebElement DeletebuttonForFileDelete;
	@FindBy(xpath = "//label[@for='shareLink']//span[@class='slider-custom round']")
	WebElement ShareLinkToggleButton;
	@FindBy(xpath = "//div[@id='delete-confirmation']//div[contains(@role,'document')]//div[contains(@class,'modal-content delete-depo')]//div[contains(@class,'p-0')]//div[contains(@class,'vd-rename-file-popup')]//div[contains(@class,'modal-below-border mt-5 py-3 px-4')]//div//div[contains(@class,'empty-depo-button-success px-4 py-2 pointer yes-btn-min-width d-flex justify-content-center')]")
	WebElement YesbuttonForFileDelete;
	@FindBy(xpath = "//div[@class='vd-pencil-box-text']//span[1]")
	WebElement MessageforfileNotPresent;
	@FindBy(xpath = "//div[contains(@class,'vd-left-nav p-3 border-end position-fixed d-none d-xl-block')]//div[contains(@class,'ms-4')][normalize-space()='Depositions']")
	WebElement DepositionButton;
	@FindBy(xpath = "//div[@id='copyInviatation']//div[@aria-label='Close']")
	WebElement CrossIconButtonForCopyInvitation;
	@FindBy(xpath = "//span[contains(@class,'fs-13 fw-400 ps-3 col-10 text-truncate pe-2')][normalize-space()='automation caseup basic']")
	WebElement SharedUserButton;
	@FindBy(xpath = "//td[contains(@class,'primary-text-color d-flex align-items-center justify-content-between')]//a[@id='dropdownMenuLink-dotted']//*[name()='svg']\r\n")
	WebElement dottedmenuforSharedUser;
	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right drop-depo py-4 show']//span[@class='drop-list-prop pe-4'][normalize-space()='Remove']")
	WebElement RemoveButton;
	@FindBy(xpath = "//div[contains(@class,'pt-4')]//div[contains(@class,'modal-below-border mt-5 py-3 px-4')]//div//div[contains(@class,'empty-depo-button-success px-4 py-2 pointer yes-btn-min-width d-flex justify-content-center')]")
	WebElement YesButtonForSharedUser;
	@FindBy(xpath = "//div[@id='create-folder']//div[contains(@role,'document')]//div[contains(@class,'modal-content rename-modal-present')]//div[contains(@class,'modal-body p-0')]//div[contains(@class,'py-3 px-4')]//div//a[@id='rename-item-save-btn']")
	WebElement saveButton;
	@FindBy(xpath = "//input[@placeholder='Enter folder name']")
	WebElement folderButton;
	@FindBy(xpath = "//span[@class='overflow-hidden text-truncate fs-13 fw-500']")
	WebElement CopyLinkButton;
	@FindBy(xpath = "//div[@class='create-submit d-flex justify-content-end position-relative modal-below-border mt-5 py-3 px-4']//div//div[@class='pointer empty-depo-button-dismiss fs-13 fw-500 font-family-sfpro px-4 py-2'][normalize-space()='Close']")
	WebElement CloseButton;
	@FindBy(xpath = "//div[@class='form-group col-sm-6 col-12 ps-sm-2']//button[@id='drop-down']")
	WebElement DropDownButton;
	@FindBy(xpath = "//div[contains(@class,'form-group col-sm-6 col-12 ps-sm-2')]//a[1]")
	WebElement ViewOnlyButton;
	@FindBy(xpath = "//div[contains(@class,'form-group col-sm-6 col-12 ps-sm-2')]//a[2]")
	WebElement ViewAndDownloadButton;
	@FindBy(xpath = "//div[@class='form-group col-sm-6 col-12 pe-sm-2 pb-2 pb-sm-0']//button[@id='drop-down']")
	WebElement DropDownLinkButton;
	@FindBy(xpath = "//div[@class='form-group col-sm-6 col-12 pe-sm-2 pb-2 pb-sm-0']//a[1]")
	WebElement SharedLinkButton;
	@FindBy(xpath = "//div[@class='form-group col-sm-6 col-12 pe-sm-2 pb-2 pb-sm-0']//a[2]")
	WebElement RestrictedButton;
	@FindBy(xpath = "//label[@for='shareLinkPasswordStatus']//span[@class='slider-custom round']")
	WebElement PasswordToggleButton;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement EnterpasswordButton;
	@FindBy(xpath = "//div[@class=' empty-depo-button-success px-4 py-2 pointer']")
	WebElement SaveButton;
	@FindBy(xpath = "//input[@id='my-input-pass']")
	WebElement Enterpassword;
	WebDriver driver;
	WebDriverUtil util;
	JSONFileClass file;
	JSONObject user;
	String UrlText;

	public InviteCollaborator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void deleteAllPreviousFiles() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(FilesButton);
		FilesButton.click();
		if (util.isDisplayed(CheckboxForFileDelete)) {
			util.waitForElementToBeClickable(CheckboxForFileDelete);
			CheckboxForFileDelete.click();
			util.waitForElementToBeClickable(DeletebuttonForFileDelete);
			DeletebuttonForFileDelete.click();
			util.waitForElementToBeClickable(YesbuttonForFileDelete);
			YesbuttonForFileDelete.click();
			Thread.sleep(2000);
			util.waitForElementToBeClickable(DepositionButton);
			DepositionButton.click();
		} else {
			util.waitForElementToBeClickable(DepositionButton);
			DepositionButton.click();
		}

	}

	public void clickOnInviteCollaboratorButton() throws InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(2000);
		util.waitForElementToBeClickable(InviteCollaborator);
		InviteCollaborator.click();
	}

	public void clickOnDeleteButtonForFileDeleted() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(DeletebuttonForFileDelete);
		DeletebuttonForFileDelete.click();
	}

	public void clickonSharelinkToggleButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(ShareLinkToggleButton);
		ShareLinkToggleButton.click();
	}

	public void clickOnDropDownArrowAndSelectViewOnlyOption() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(DropDownButton);
		DropDownButton.click();
		util.waitForElementToBeClickable(ViewOnlyButton);
		ViewOnlyButton.click();
	}

	public void clickOnDropDownArrowAndSelectViewAndDownloadOption() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(DropDownButton);
		DropDownButton.click();
		util.waitForElementToBeClickable(ViewAndDownloadButton);
		ViewAndDownloadButton.click();
	}

	public void clickOnDropDownArrowAndSelectRestrictedLinkOption() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(DropDownLinkButton);
		DropDownLinkButton.click();
		util.waitForElementToBeClickable(RestrictedButton);
		RestrictedButton.click();
	}

	public void clickOnCopyInvitationButton() throws InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(2000);
		util.waitForElementToBeClickable(CopyInvitationButton);
		CopyInvitationButton.click();
	}

	public void clickOnManageButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Managebutton);
		Managebutton.click();
	}

	public void clickOnFilesButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(FilesButton);
		FilesButton.click();
	}

	public void clickOnCaseupButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(casebutton);
		Actions actions = new Actions(driver);
		actions.doubleClick(casebutton).perform();
	}

	public void checkForInviteCollaboratorButton() throws InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(2000);
		Assert.assertFalse(util.isDisplayed(InviteCollaborator));
	}

	public void checkForInviteCollaboratorButtonAndSettingsButton() throws InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(2000);
		Assert.assertFalse(util.isDisplayed(SettingButton) || util.isDisplayed(InviteCollaborator));
	}

	public void checkForRenameButtonFileRequestButtonAndDeleteButton() throws InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(2000);
		Assert.assertFalse(util.isDisplayed(FileRequestbutton) || util.isDisplayed(RenameButton)
				|| util.isDisplayed(Deletebutton));
	}

	public void enterEmailForInvite() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(EmailForInvite);
		EmailForInvite.click();
		EmailForInvite.sendKeys("automationcaseupbasic@mailinator.com");
	}

	public void enterEmailForInviteAgain() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(EmailForInvite);
		EmailForInvite.click();
		EmailForInvite.sendKeys("automationcaseupadm@mailinator.com");
	}

	public void enterEmailForSend() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(EnterEmailForShare);
		EnterEmailForShare.click();
		EnterEmailForShare.sendKeys("qa.manager@mailinator.com");
		Thread.sleep(3000);
	}

	public void selectInviteAsEditor() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(EditorCheckbox);
		EditorCheckbox.click();
	}

	public void clickOnSendButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Sendbutton);
		Sendbutton.click();
		Thread.sleep(2000);
	}

	public void clickOnDropDownutton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(DropDownarrow);
		DropDownarrow.click();
	}

	public void logoutCurrentUser() throws InterruptedException {
		Thread.sleep(1000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(usermenu);
		usermenu.click();
		util.waitForElementToBeClickable(Logoutbutton);
		Logoutbutton.click();
		Thread.sleep(5000);
	}

	public void clickOnSettingButtonInInviteTab() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(SettingButton);
		SettingButton.click();
	}

	public void clickOnDropdownArrow() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(downarrow);
		downarrow.click();
	}

	public void clickOnDropdownArrowForFolder() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(DropDownarrowFolder);
		DropDownarrowFolder.click();
	}

	public void selectInroducerLimitedRadioButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(IntroducerLimitedRadioBtn);
		IntroducerLimitedRadioBtn.click();
		Thread.sleep(1000);
	}

	public void selectInroducerRadioButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(IntroducerRadioBtn);
		IntroducerRadioBtn.click();
		Thread.sleep(1000);
	}

	public void selectOwnerRadioButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(OwnerRadioBtn);
		OwnerRadioBtn.click();
		Thread.sleep(1000);
	}

	public void selectEditorButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(EditorRadioBtn);
		EditorRadioBtn.click();
		Thread.sleep(1000);
	}

	public void selectCoOwnerRadioButtonForFolder() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(CoownerRadioBtn);
		CoownerRadioBtn.click();
		Thread.sleep(1000);
	}

	public void selectBasicRadioButtonForFolder() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(BaseicRadioBtn);
		BaseicRadioBtn.click();
		Thread.sleep(1000);
	}

	public void selectViewerRadioButtonForFolder() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(ViewerButton);
		ViewerButton.click();
		Thread.sleep(1000);
	}

	public void selectViewerRadioButtonForShare() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(ViewerShareButton);
		ViewerShareButton.click();
		Thread.sleep(1000);
	}

	public void selectDownloaderRadioButtonForShare() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(DownloaderShareButton);
		DownloaderShareButton.click();
		Thread.sleep(1000);
	}

	public void selectCoownerRadioButtonForShare() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(CoownerrShareButton);
		CoownerrShareButton.click();
		Thread.sleep(1000);
	}

	public void selectManagerRadioButtonForShare() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(ManagerShareButton);
		ManagerShareButton.click();
		Thread.sleep(1000);
	}

	public void selectBasicRadioButtonForShare() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(BasicShareButton);
		BasicShareButton.click();
		Thread.sleep(1000);
	}

	public void selectOwnerRadioButtonForFolder() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(OwnerFolderRadioBtn);
		OwnerFolderRadioBtn.click();
		Thread.sleep(1000);
	}

	public void selectManagerButtonForFolder() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(ManagerRadioBtn);
		ManagerRadioBtn.click();
		Thread.sleep(1000);
	}

	public void selectDownloaderButtonForFolder() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(DownloaderButton);
		DownloaderButton.click();
		Thread.sleep(1000);
	}

	public void selectEditorButtonForFolder() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(EditorFolderRadioBtn);
		EditorFolderRadioBtn.click();
		Thread.sleep(1000);
	}

	public void selectCoCreatorRadioButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(CoCreatorLimitedRadioBtn);
		CoCreatorLimitedRadioBtn.click();
		Thread.sleep(1000);
	}

	public void clickOnIntroduceButton() throws InterruptedException {
		util = new WebDriverUtil();
		Assert.assertFalse(util.isDisplayed(IntroduceButton));
	}

	public void clickOnDottedDroppedMenuOfSelectedFolder() throws InterruptedException {
		Thread.sleep(2000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(CheckboxMenuForFolder);
		CheckboxMenuForFolder.click();
		Thread.sleep(2000);
		util.waitForElementToBeClickable(DottedDroppedMenuForFolder);
		DottedDroppedMenuForFolder.click();
	}

	public void clickOnDottedDroppedMenuOfSelectedFolders() throws InterruptedException {
		Thread.sleep(2000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(CheckboxMenuForFolders);
		CheckboxMenuForFolders.click();
		Thread.sleep(2000);
		util.waitForElementToBeClickable(DottedDroppedMenuForFolder);
		DottedDroppedMenuForFolder.click();
	}

	public void clickOnDottedDroppedMenuOfSelectedFolderonfiles() throws InterruptedException {
		Thread.sleep(2000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(DottedDroppedMenuForFolder);
		DottedDroppedMenuForFolder.click();
	}

	public void clickOnDottedDroppedMenuOfSelectedFolderonfile() throws InterruptedException {
		Thread.sleep(2000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(CheckboxMenuForFolders);
		CheckboxMenuForFolders.click();
		Thread.sleep(2000);
		util.waitForElementToBeClickable(DottedDroppedMenuForFolder);
		DottedDroppedMenuForFolder.click();
	}

	public void clickOnDottedDroppedMenuOfSelectedSharedFolder() throws InterruptedException {
		Thread.sleep(2000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(CheckboxMenuForFolder);
		CheckboxMenuForFolder.click();
		Thread.sleep(2000);
		util.waitForElementToBeClickable(DottedDroppedMenuForSharedFolder);
		DottedDroppedMenuForSharedFolder.click();
	}

	public void clickOnDottedDroppedMenuOfSelectedXSLSFile() throws InterruptedException {
		Thread.sleep(2000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(CheckboxMenuForFile);
		CheckboxMenuForFile.click();
		Thread.sleep(2000);
		util.waitForElementToBeClickable(DottedDroppedMenuForSharedFolder);
		DottedDroppedMenuForSharedFolder.click();
	}

	public void clickOnSelectedFolder() throws InterruptedException {
		Thread.sleep(2000);
		util = new WebDriverUtil();
		Webelementbutton.click();
	}

	public void clickOnSelectedWitnessFolder() throws InterruptedException {
		Thread.sleep(2000);
		util = new WebDriverUtil();
		Witnesselementbutton.click();
	}

	public void checkForDottedDroppedMenuOfSelectedFolder() throws InterruptedException {
		Thread.sleep(2000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(CheckboxMenuForFolder);
		CheckboxMenuForFolder.click();
		Thread.sleep(2000);
		Assert.assertFalse(util.isDisplayed(DottedDroppedMenuForFolder));
	}

	public void clickOnDepositionsButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(DepositionsButton);
		DepositionsButton.click();
	}

	public void clickOnFileRequestButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(FileRequestbutton);
		FileRequestbutton.click();
		Thread.sleep(2000);
	}

	public void clickOnYesButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Yesbuttonforfolder);
		Yesbuttonforfolder.click();
		Thread.sleep(2000);
	}

	public void clickOnPreviewButtonFileRequest() {
		util = new WebDriverUtil();
		String mainWindowHandle = driver.getWindowHandle();
		util.waitForElementToBeClickable(PreviewButton);
		PreviewButton.click();
		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(mainWindowHandle)) {
				driver.switchTo().window(handle);
				break;
			}
		}

	}

	public void enterEmailForFileRequest() {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(EnterEmailForFileRequest);
		EnterEmailForFileRequest.sendKeys("automationcaseupbasic@mailinator.com");

	}

	public void clickOnSelectFileToUpload() throws AWTException, InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(FileuploadButton);
		FileuploadButton.click();
		util.Uploadfile("src/test/resources/Upload/sample file.xlsx");
		Thread.sleep(4000);
	}

	public void clickOnSubmitButtonForFileRequest() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(SubmitButtonForFileRequest);
		SubmitButtonForFileRequest.click();
		String mainWindowHandle = driver.getWindowHandle();
		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(mainWindowHandle)) {
				driver.switchTo().window(handle);
				break;
			}
		}

	}

	public void clickOnSaveButtonForFileRequest() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(SaveButtonForFileRequest);
		SaveButtonForFileRequest.click();
	}

	public void checkTheValidationMessageForInvitationSent() throws IOException, ParseException, InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(1000);
		util.waitForElementVisiblity(validationMessage);
		String actual = validationMessage.getText();
		file = new JSONFileClass();
		user = file.readJson();
		JSONArray UserArray = (JSONArray) user.get("ValidationMessage");
		for (int i = 0; i < UserArray.size(); i++) {
			JSONObject details = (JSONObject) UserArray.get(i);
			String Expected = (String) details.get("MessageForInvitationSent");
			Assert.assertEquals(actual, Expected);
		}
	}

	public void checkTheValidationMessageForRenameFoldername()
			throws IOException, ParseException, InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(1000);
		util.waitForElementVisiblity(validationMessage);
		String actual = validationMessage.getText();
		file = new JSONFileClass();
		user = file.readJson();
		JSONArray UserArray = (JSONArray) user.get("ValidationMessage");
		for (int i = 0; i < UserArray.size(); i++) {
			JSONObject details = (JSONObject) UserArray.get(i);
			String Expected = (String) details.get("MessageForFolderNameUpdated");
			Assert.assertEquals(actual, Expected);
		}
	}

	public void checkTheValidationMessageForFileRequest() throws IOException, ParseException, InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(1000);
		util.waitForElementVisiblity(validationMessage);
		String actual = validationMessage.getText();
		file = new JSONFileClass();
		user = file.readJson();
		JSONArray UserArray = (JSONArray) user.get("ValidationMessage");
		for (int i = 0; i < UserArray.size(); i++) {
			JSONObject details = (JSONObject) UserArray.get(i);
			String Expected = (String) details.get("MessageForFileRequest");
			Assert.assertEquals(actual, Expected);
		}
	}

	public void checkTheValidationMessageForFolderDelete() throws IOException, ParseException, InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(1000);
		util.waitForElementVisiblity(validationMessage);
		String actual = validationMessage.getText();
		file = new JSONFileClass();
		user = file.readJson();
		JSONArray UserArray = (JSONArray) user.get("ValidationMessage");
		for (int i = 0; i < UserArray.size(); i++) {
			JSONObject details = (JSONObject) UserArray.get(i);
			String Expected = (String) details.get("MessageForFolderDelete");
			Assert.assertEquals(actual, Expected);
		}
	}

	public void clickOnShareButtonForFile() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(ShareButton);
		ShareButton.click();
	}

	public void clickOnMoveAndCopyButtonForFile() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(MoveAndCopyButton);
		MoveAndCopyButton.click();
	}

	public void clickAndMoveAndCopyButtonForFile() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(MoveAndCopyButtonForMove);
		MoveAndCopyButtonForMove.click();
	}

	public void clickOnCopyButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(CopyButton);
		CopyButton.click();
		Thread.sleep(4000);
	}

	public void clickOnMoveButton() throws InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(1000);
		util.waitForElementToBeClickable(FolderCheckBox);
		FolderCheckBox.click();
		Thread.sleep(1000);
		util.waitForElementToBeClickable(MoveButton);
		MoveButton.click();
		Thread.sleep(4000);
	}

	public void clickOnCrossIconForCopyInvitation() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(CrossIconButtonForCopyInvitation);
		CrossIconButtonForCopyInvitation.click();
	}

	public void clickOnSharedUser() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(SharedUserButton);
		SharedUserButton.click();
	}

	public void clickOnDropdownMenuForSelectedSharedUser() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(dottedmenuforSharedUser);
		dottedmenuforSharedUser.click();
	}

	public void clickOnRemoveButton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(RemoveButton);
		RemoveButton.click();
	}

	public void clickOnCloseButton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(CloseButton);
		CloseButton.click();
	}

	public void clickOnYesButtonForSharedUser() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(YesButtonForSharedUser);
		YesButtonForSharedUser.click();
	}

	public void enterTheFolderName() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(folderButton);
		folderButton.click();
		folderButton.sendKeys("New Folder");

	}

	public void clickOnSaveButtonForSaveFolder() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(saveButton);
		saveButton.click();
	}

	public void clickonenablepasswordtogglebutton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(PasswordToggleButton);
		PasswordToggleButton.click();
		util.waitForElementToBeClickable(EnterpasswordButton);
		EnterpasswordButton.sendKeys("Test@123");
	}

	public void enterPasswordAndSaveButtonbutton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Enterpassword);
		Enterpassword.sendKeys("Test@123");
		util.waitForElementToBeClickable(SaveButton);
		SaveButton.click();
	}

	public void checkFordepositionIsRemovedFromBasicRole() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(FilesButton);
		FilesButton.click();
		if (util.isDisplayed(MessageforfileNotPresent))
			util.waitForElementToBeClickable(DepositionButton);
		DepositionButton.click();
	}

	public void clickOnCopyLinkButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(CopyLinkButton);
		UrlText = CopyLinkButton.getText();
		Thread.sleep(2000);
		util.CreateNewTabWithUrl(UrlText);
		Thread.sleep(3000);
	}
}
