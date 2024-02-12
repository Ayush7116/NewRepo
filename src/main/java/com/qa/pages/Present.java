package com.qa.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.factory.DriverFactory;
import com.qa.factory.WebDriverUtil;
import com.qa.util.JSONFileClass;

public class Present {
	@FindBy(xpath = "//input[@placeholder='Enter your email']")
	WebElement email;
	@FindBy(xpath = "//button[normalize-space()='Next']")
	WebElement Nextbtn;
	@FindBy(xpath = "//input[@placeholder='Enter your password']")
	WebElement password;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement LoginBtn;
	@FindBy(xpath = "//div[contains(@class,\"present-btn pointer text-white mt\")]")
	WebElement PresentButton;
	@FindBy(xpath = "//label[contains(text(),\"click\")]")
	WebElement Clickbutton;
	@FindBy(xpath = "((//span[contains(text(),'Introduce')])/parent::button)[1]")
	WebElement IntroduceButton;
	@FindBy(xpath = "//div[@class='MuiAlert-message']")
	WebElement validationMessage;
	@FindBy(xpath = "//p[normalize-space()='file name can not be empty']")
	WebElement validationMessageForRenameEmptyData;
	@FindBy(xpath = "//td[contains(@title,'sample file.xlsx')]/parent::tr[contains(@class,'row gx-0 align-items-center')]/child::td[@class='col-1 py-4']/descendant::a[@id='dropdownMenuLink-dotted']")
	WebElement DottedDroppedMenu;
	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right table_dots_dropdown py-4 show']//span[@class='dropdown-list-prop pe-4'][normalize-space()='Undo Exhibit']")
	WebElement UndoExhibitButton;
	@FindBy(xpath = "(//button[normalize-space()='Shared'])[1]")
	WebElement SharedButton;
	@FindBy(xpath = "(//a[@type='button'])[1]")
	WebElement CancleButton;
	@FindBy(xpath = "(//*[name()='svg'])[11]")
	WebElement CancleButtonForsharedsection;
	@FindBy(xpath = "(//label[@for='uploadFiles']")
	WebElement Uploadicon;
	@FindBy(xpath = "(//a[contains(@type,'submit')])[1]")
	WebElement Yesbuttonforundo;
	@FindBy(xpath = "(//span[contains(@class,'dropdown-list-prop pe-4')][normalize-space()='Edit Exhibit #'])[1]")
	WebElement EditExhibitButton;
	@FindBy(xpath = "//input[contains(@placeholder,'Enter exhibit number')]")
	WebElement EditExhibitpath;
	@FindBy(xpath = "//div[contains(text(),'Save')]")
	WebElement Savebutton;
	@FindBy(xpath = "(//span[contains(@class,'dropdown-list-prop pe-4')][normalize-space()='Rename'])[1]")
	WebElement RenameButton;
	@FindBy(xpath = "(//div[contains(@class,'empty-depo-button-success text-center px-4 py-2 pointer rename-modal-custom-width')])[1]")
	WebElement UpdateButton;
	@FindBy(xpath = "(//input[@placeholder=\"Enter file name\" or @placeholder=\"Enter folder name\"])[1]")
	WebElement Renamepath;
	@FindBy(xpath = "//div[@class='mt-2 mx-3 mb-3 ']//input[@placeholder='Enter case name']")
	WebElement Renamecasepath;
	@FindBy(xpath = "//input[@placeholder='Enter witness name']")
	WebElement Renamewitnesspath;
	@FindBy(xpath = "//label[@for='uploadFiles']//*[name()='svg']")
	WebElement UploadIcon;
	@FindBy(xpath = "(//button[@class='btn-custom-s false'])[1]")
	WebElement Sharebutton;
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='New'])[1]")
	WebElement Newbutton;
	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right p-4 show')]//button[2]")
	WebElement previousExhibitButton;
	@FindBy(xpath = "(//span[contains(@class,'dropdown-list-prop pe-4')][normalize-space()='Download'])[1]")
	WebElement DownloadButton;
	@FindBy(xpath = "(//span[contains(@class,'dropdown-list-prop pe-4')][normalize-space()='Download'])[2]")
	WebElement DownloadButtonforShared;
	@FindBy(xpath = "(//a[@id='dropdownMenuLink-dotted'])[1]")
	WebElement DropDownToggleShow;
	@FindBy(xpath = "(//span[contains(@class,'slider-custom round')])[1]")
	WebElement SlideButton;
	@FindBy(xpath = "(//button[@id='dropdownMenuButton1'])[1]")
	WebElement SelectButton;
	@FindBy(xpath = "//ul[contains(@class,'dropdown-menu dropdown-menu-end dual-mode-update-drop w-100 show')]//span[contains(@class,'ps-18 fs-13 fw-400 lh-16 passcode-color')][normalize-space()='Sync']")
	WebElement SyncButton;
	@FindBy(xpath = "(//span[contains(@class,'ps-18 fs-13 fw-400 lh-16 passcode-color')][normalize-space()='Preview'])[1]")
	WebElement PreviewButton;
	@FindBy(xpath = "(//div[@class='align-items-center d-flex fs-13 fw-500 invite_link p-2 me-2 pointer present-hover-left btn-inv-copy tooltip-custom'])[1]")
	WebElement InviteLinkButton;
	@FindBy(xpath = "(//span[contains(text(),'https://staging.virtualdepo.com/exhibit?session_id')])[1]")
	WebElement CopyLinkButton;
	@FindBy(xpath = "(//div[@aria-label='Close'])[2]")
	WebElement CrossIconButton;
	@FindBy(xpath = "(//button[normalize-space()='View Exhibits'])[1]")
	WebElement ViewExhibitButton;
	@FindBy(xpath = "(//input[@placeholder='Enter your full name...'])[1]")
	WebElement Nameplaceholder;
	@FindBy(xpath = "(//button[normalize-space()='Continue'])[1]")
	WebElement Continuebutton;
	@FindBy(xpath = "(//input[@placeholder='Enter your email address...'])[1]")
	WebElement Emailplaceholder;
	@FindBy(xpath = "(//a[@class='d-flex align-items-center float-right hide-mobile me-3'])[1]")
	WebElement Downloadicon;
	@FindBy(xpath = "//div[contains(@class,'mx-0 px-0 bg-light right-exibit-section')]//span[contains(@class,'ext-value')]")
	WebElement ExhibitInput;
	@FindBy(xpath = "//div[contains(@class,'mx-0 px-0 bg-light right-exibit-section')]//input[contains(@placeholder,'---')]")
	WebElement ExhibitNumberButton;
	@FindBy(xpath = "//span[@class='pointer me-33']//*[name()='svg']")
	WebElement Searchbutton;
	@FindBy(xpath = "//input[@class='ps-2 search_box_input w-100 ']")
	WebElement SearchBox;
	@FindBy(xpath = "//span[contains(@class,'ms-8px pointer close_icon_search w-32px h-32px lh-32 text-center')]//*[name()='svg']")
	WebElement CancleSearchbutton;
	@FindBy(xpath = "//span[@class='vd-box-data-name btn-text position-relative date-style me-4 table-file-name-settings']")
	WebElement FileNameverification;
	@FindBy(xpath = "//div[@class='add-deposition-button-custom d-flex align-items-center']")
	WebElement CreateNew;

	WebDriver driver;
	WebDriverUtil util;
	JSONFileClass file;
	JSONObject user;
	String UrlText;

	public Present(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void loginwithadmin() throws IOException, ParseException {
		util = new WebDriverUtil();
		file = new JSONFileClass();
		user = file.readJson();
		JSONArray UserArray = (JSONArray) user.get("Admincredentials");
		util.waitForElementVisiblity(email);
		for (int i = 0; i < UserArray.size(); i++) {
			JSONObject detail = (JSONObject) UserArray.get(i);
			String Email = (String) detail.get("Email");
			email.sendKeys(Email);
		}

		util.waitForElementToBeClickable(Nextbtn);
		util.waitForElementJavaScript(Nextbtn);
		util.waitForElementToBeClickable(password);
		password.click();
		for (int i = 0; i < UserArray.size(); i++) {
			JSONObject detail = (JSONObject) UserArray.get(i);
			String Password = (String) detail.get("Password");
			password.sendKeys(Password);
		}

		util.waitForElementToBeClickable(LoginBtn);
		LoginBtn.click();
	}

	public void loginwithguest() throws IOException, ParseException {
		util = new WebDriverUtil();
		file = new JSONFileClass();
		user = file.readJson();
		JSONArray UserArray = (JSONArray) user.get("Guestcredentials");
		util.waitForElementVisiblity(email);
		for (int i = 0; i < UserArray.size(); i++) {
			JSONObject detail = (JSONObject) UserArray.get(i);
			String Email = (String) detail.get("Email");
			email.sendKeys(Email);
		}

		util.waitForElementToBeClickable(Nextbtn);
		util.waitForElementJavaScript(Nextbtn);
		util.waitForElementToBeClickable(password);
		password.click();
		for (int i = 0; i < UserArray.size(); i++) {
			JSONObject detail = (JSONObject) UserArray.get(i);
			String Password = (String) detail.get("Password");
			password.sendKeys(Password);
		}

		util.waitForElementToBeClickable(LoginBtn);
		LoginBtn.click();
	}

	public void loginwithbasic() throws IOException, ParseException {
		util = new WebDriverUtil();
		file = new JSONFileClass();
		user = file.readJson();
		JSONArray UserArray = (JSONArray) user.get("Basiccredentials");
		util.waitForElementVisiblity(email);
		for (int i = 0; i < UserArray.size(); i++) {
			JSONObject detail = (JSONObject) UserArray.get(i);
			String Email = (String) detail.get("Email");
			email.sendKeys(Email);
		}

		util.waitForElementToBeClickable(Nextbtn);
		util.waitForElementJavaScript(Nextbtn);
		util.waitForElementToBeClickable(password);
		password.click();
		for (int i = 0; i < UserArray.size(); i++) {
			JSONObject detail = (JSONObject) UserArray.get(i);
			String Password = (String) detail.get("Password");
			password.sendKeys(Password);
		}

		util.waitForElementToBeClickable(LoginBtn);
		LoginBtn.click();
	}

	public void clickOnPresentButton() throws InterruptedException, AWTException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(PresentButton);
		PresentButton.click();
	}

	public void clickOnUploadClickButton() throws AWTException, InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Clickbutton);
		Clickbutton.click();
		util.Uploadfile("src/test/resources/Upload/fruits.jpg");
	}

	public void clickOnCancleButton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(CancleButton);
		CancleButton.click();
	}

	public void clickOnCancleButtonForSharedSection() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(CancleButtonForsharedsection);
		CancleButtonForsharedsection.click();
	}

	public void clickOnIntroduceButton() throws InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(10000);
		util.waitForElementToBeClickable(IntroduceButton);
		IntroduceButton.click();
		Thread.sleep(2000);
	}

	public void checkTheValidationMessageForIntroduceExhibit()
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
			String Expected = (String) details.get("MessageForIntroduceExhibit");
			Assert.assertEquals(actual, Expected);
		}
	}

	public void clickOnDottedDroppedMenuOfSelectedFile() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(DottedDroppedMenu);
		DottedDroppedMenu.click();
	}

	public void changeTheExhibitNumberToEmpty() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(ExhibitNumberButton);
		ExhibitNumberButton.click();
		ExhibitNumberButton.clear();
		ExhibitNumberButton.clear();
		ExhibitNumberButton.sendKeys(" ");
	}

	public void checkTheValidationMessageForIntroduceExhibitWithEmptyValue()
			throws InterruptedException, IOException, ParseException {
		util = new WebDriverUtil();
		Thread.sleep(1000);
		util.waitForElementVisiblity(validationMessage);
		String actual = validationMessage.getText();
		file = new JSONFileClass();
		user = file.readJson();
		JSONArray UserArray = (JSONArray) user.get("ValidationMessage");
		for (int i = 0; i < UserArray.size(); i++) {
			JSONObject details = (JSONObject) UserArray.get(i);
			String Expected = (String) details.get("MessageForEmptyExhibitNumber");
			Assert.assertEquals(actual, Expected);
		}
	}

	public void changeTheExhibitNumberToValue() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(ExhibitNumberButton);
		ExhibitNumberButton.click();
		ExhibitNumberButton.clear();
		ExhibitNumberButton.sendKeys("1");
	}

	public void clickOnUndoExhibitButton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(UndoExhibitButton);
		UndoExhibitButton.click();
	}

	public void clickOnYesButtonForUndoDeposition() throws InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(1000);
		util.waitForElementToBeClickable(Yesbuttonforundo);
		Yesbuttonforundo.click();
		Thread.sleep(1000);
	}

	public void checkTheValidationMessageForExhibitRemoved() throws IOException, ParseException, InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(1000);
		util.waitForElementVisiblity(validationMessage);
		String actual = validationMessage.getText();
		file = new JSONFileClass();
		user = file.readJson();
		JSONArray UserArray = (JSONArray) user.get("ValidationMessage");
		for (int i = 0; i < UserArray.size(); i++) {
			JSONObject details = (JSONObject) UserArray.get(i);
			String Expected = (String) details.get("MessageForExhibitRemove");
			Assert.assertEquals(actual, Expected);
		}
		Thread.sleep(1000);
	}

	public void clickOnSharedButton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(SharedButton);
		SharedButton.click();
	}

	public void clickOnEditExhibitButton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(EditExhibitButton);
		EditExhibitButton.click();
	}

	public void changeTheExhibitNumber() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(EditExhibitpath);
		EditExhibitpath.click();
		EditExhibitpath.sendKeys("22");
	}

	public void clickOnSaveButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Savebutton);
		Savebutton.click();
		Thread.sleep(3000);
	}

	public void checkTheValidationMessageForChangeExhibitNumber()
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
			String Expected = (String) details.get("MessageForChangeExhibitNumber");
			Assert.assertEquals(actual, Expected);
		}
	}

	public void clickOnRenameButton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(RenameButton);
		RenameButton.click();
	}

	public void changeTheFileName() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Renamepath);
		Renamepath.click();
		Renamepath.clear();
		String Files = "Rename files Name -" + RandomStringUtils.randomAlphabetic(2);
		Renamepath.sendKeys(Files);
	}
	public void changeTheCaseName() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Renamecasepath);
		Renamecasepath.click();
		Renamecasepath.clear();
		String Files = "Rename files Name -" + RandomStringUtils.randomAlphabetic(2);
		Renamecasepath.sendKeys(Files);
	}
	public void changeTheWitnessName() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Renamewitnesspath);
		Renamewitnesspath.click();
		Renamewitnesspath.clear();
		String Files = "Rename files Name -" + RandomStringUtils.randomAlphabetic(2);
		Renamewitnesspath.sendKeys(Files);
	}

	public void changeTheFileNameToEmpty() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Renamepath);
		Renamepath.click();
		Renamepath.clear();
		Renamepath.sendKeys("   ");
	}

	public void clickOnUpdateButtonToSaveFile() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(UpdateButton);
		UpdateButton.click();
		Thread.sleep(2000);	
		}

	public void checkTheValidationMessageForChangeFileName() throws IOException, ParseException, InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(1000);
		util.waitForElementVisiblity(validationMessage);
		String actual = validationMessage.getText();
		file = new JSONFileClass();
		user = file.readJson();
		JSONArray UserArray = (JSONArray) user.get("ValidationMessage");
		for (int i = 0; i < UserArray.size(); i++) {
			JSONObject details = (JSONObject) UserArray.get(i);
			String Expected = (String) details.get("MessageForChangeFileName");
			Assert.assertEquals(actual, Expected);
		}
		Thread.sleep(1000);
		}

	public void checkTheValidationMessageForChangeFileNameWithEmptyData()
			throws IOException, ParseException, InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(1000);
		util.waitForElementVisiblity(validationMessageForRenameEmptyData);
		String actual = validationMessageForRenameEmptyData.getText();
		file = new JSONFileClass();
		user = file.readJson();
		JSONArray UserArray = (JSONArray) user.get("ValidationMessage");
		for (int i = 0; i < UserArray.size(); i++) {
			JSONObject details = (JSONObject) UserArray.get(i);
			String Expected = (String) details.get("MessageForEmptyFileName");
			Assert.assertEquals(actual, Expected);
		}
	}

	public void clickOnUploadIcon() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(UploadIcon);
		UploadIcon.click();
	}

	public void uploadTheImage() throws InterruptedException, AWTException {
		util = new WebDriverUtil();
		util.Uploadfile("src/test/resources/Upload/fruits.xls");
		Thread.sleep(5000);
	}

	public void clickOnSearchButton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Searchbutton);
		Searchbutton.click();

	}

	public void selectTheInputboxAndTypeWhatYouWantToSearch() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(SearchBox);
		SearchBox.click();
		SearchBox.clear();
		SearchBox.sendKeys("fruits");
	}

	public void checkFileIsPresentOrNot() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(CancleSearchbutton);
		CancleSearchbutton.click();
	}

	public void clickOnShareButton() throws InterruptedException {
		Thread.sleep(10000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Sharebutton);
		Sharebutton.click();
		Thread.sleep(3000);
	}

	public void clickOnNewButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Newbutton);
		Newbutton.click();
	}

	public void clickOnPreviousExhibitButton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(previousExhibitButton);
		previousExhibitButton.click();
	}

	public void clickOnDownloadButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(DownloadButton);
		DownloadButton.click();
		Thread.sleep(2000);
	}

	public void clickOnDownloadButtonForShared() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(DownloadButtonforShared);
		DownloadButtonforShared.click();
		Thread.sleep(2000);
	}

	public void ClickOnDropDownToggleShow() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(DropDownToggleShow);
		DropDownToggleShow.click();
	}

	public void ClickOnSelectDropdown() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(SelectButton);
		SelectButton.click();
	}

	public void ClickOnSyncButton() throws InterruptedException {
		util = new WebDriverUtil();
		String mainWindowHandle = driver.getWindowHandle();
		util.waitForElementToBeClickable(SyncButton);
		SyncButton.click();
		Thread.sleep(5000);
		driver.switchTo().window(mainWindowHandle);
		Thread.sleep(2000);
	}

	public void ClickOnPreviewButton() throws InterruptedException {
		util = new WebDriverUtil();
		String originalWindow = driver.getWindowHandle();
		util.waitForElementToBeClickable(PreviewButton);
		PreviewButton.click();
		Thread.sleep(2000);
		driver.switchTo().window(originalWindow);
		Thread.sleep(2000);
	}

	public void ClickOnSwitchPreviewerStatusButton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(SlideButton);
		SlideButton.click();
	}

	public void clickOnInviteLinkButton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(InviteLinkButton);
		InviteLinkButton.click();
	}

	public void clickOnCopyLinkButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(CopyLinkButton);
		UrlText = CopyLinkButton.getText();
		Thread.sleep(2000);
		util.CreateNewTabWithUrl(UrlText);
		Thread.sleep(3000);
	}

	public void clickOnCrossIcon() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(CrossIconButton);
		CrossIconButton.click();
	}

	public void openNewWindow() throws InterruptedException {
		util = new WebDriverUtil();
	}

	public void clickOnViewExhibitsButton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(ViewExhibitButton);
		ViewExhibitButton.click();
	}

	public void enterYourName() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Nameplaceholder);
		Nameplaceholder.click();
		Nameplaceholder.sendKeys("Automation test");
	}

	public void enterYourEmail() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Emailplaceholder);
		Emailplaceholder.click();
		Emailplaceholder.sendKeys("Automationtesting@gmail.com");
	}

	public void pressContinueButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Continuebutton);
		Continuebutton.click();
		Thread.sleep(1000);
	}

	public void downloadTheFile() throws InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(1000);
		util.waitForElementToBeClickable(Downloadicon);
		Downloadicon.click();
	}

	public void cancleTheCurrentWindowAndGoToPeviousWindow() throws InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(2000);
		DriverFactory.getDriver().close();
		Set<String> windowHandles = DriverFactory.getDriver().getWindowHandles();
		for (String windowHandle : windowHandles) {
			DriverFactory.getDriver().switchTo().window(windowHandle);
		}
		Thread.sleep(2000);
	}

	public void clickOnCancleButtonOfInviteLinkButton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(CrossIconButton);
		CrossIconButton.click();
	}

	public void checkCreateButtonIsVisibleOrNot() throws InterruptedException {
		util = new WebDriverUtil();
		Assert.assertFalse(util.isDisplayed(CreateNew));
	}
	public void checkCreateButtonIsVisible() throws InterruptedException {
		util = new WebDriverUtil();
		Assert.assertTrue(util.isDisplayed(CreateNew));
	}
}
