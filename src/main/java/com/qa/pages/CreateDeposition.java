package com.qa.pages;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.factory.WebDriverUtil;
import com.qa.util.JSONFileClass;

public class CreateDeposition {
	/* Registration and Login related xpath */
	@FindBy(xpath = "//input[@placeholder='Enter your email']")
	WebElement email;
	@FindBy(xpath = "//button[normalize-space()='Next']")
	WebElement Nextbtn;
	@FindBy(xpath = "//input[@placeholder='Enter your password']")
	WebElement password;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement LoginBtn;
	/* Create Deposition related xpath */
	@FindBy(xpath = "//div[@class='add-deposition-button-custom d-flex align-items-center']")
	WebElement CreateNew;
	@FindBy(xpath = "//input[@class='form-control bg-white placeholder-dark']")
	WebElement WitnessName;
	@FindBy(xpath = "//div[@class='input-wrap position-relative mb-4']//input[@placeholder='Enter noticing firm name']")
	WebElement NoticingFirm;
	@FindBy(xpath = "//input[@id='case-auto-suggest2']")
	WebElement Case;
	@FindBy(xpath = "//div[contains(text(),'Create')]")
	WebElement CreateButton;
	@FindBy(xpath = "//div[@class='empty-depo-button-success px-4 py-2 pointer false']")
	WebElement SubmitButton;
	@FindBy(xpath = "//span[contains(@class,'empty-depo-button-success btn fs-13 fw-600 px-4 py-2')]")
	WebElement UploadFilesButton;
	@FindBy(xpath = "//div[contains(@class,'select-file text-center align-items-center justify-content-center d-flex flex-direction-column mb-3 h-auto')]//label[contains(@class,'pointer')]")
	WebElement Upload;
	@FindBy(xpath = "//div[@class='dzu-previewStatusContainer']//*[name()='svg']")
	WebElement Circle;
	@FindBy(xpath = "(//a[@id='dropdownMenuLink-dotted'])[1]")
	WebElement DotteddropownMenu;
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	WebElement Deletebutton;
	@FindBy(xpath = "//div[@id='delete-confirmation-depo']//div[contains(@role,'document')]//div[contains(@class,'modal-content delete-depo')]//div[contains(@class,'p-0')]//div[contains(@class,'vd-rename-file-popup')]//div[contains(@class,'modal-below-border mt-5 py-3 px-4')]//div//a[contains(@type,'submit')]")
	WebElement Yesbutton;
	@FindBy(xpath = "//span[text()='Only these characters are allowed .-_+*&,():#']")
	WebElement ValidationMessage1;
	@FindBy(xpath = "//span[text()='Required']")
	WebElement ValidationMessage2;
	/* Update Deposition related xpath */
	@FindBy(xpath = "(//a[@class='dropdown-item d-flex align-items-center py-2 pointer ps-1'])[6]")
	WebElement SettingButton;
	@FindBy(xpath = "(//input[contains(@placeholder,'Enter witness name')])[1]")
	WebElement UpdateWitnessName;
	@FindBy(xpath = "//button[normalize-space()='Update']")
	WebElement UpdateButton;
	@FindBy(xpath = "//div[@class='MuiAlert-message']")
	WebElement validationMessage;

	WebDriver driver;
	WebDriverUtil util;
	JSONFileClass file;
	JSONObject user;

	public CreateDeposition(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginwithaccountowneraccount() throws IOException, ParseException {
		util = new WebDriverUtil();
		file = new JSONFileClass();
		user = file.readJson();
		JSONArray UserArray = (JSONArray) user.get("Login_AccountOwner");
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

	public void clickOnCreateNewutton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(CreateNew);
		CreateNew.click();
		Thread.sleep(1000);
	}

	public void enterWitnessName(String Witness_Name) {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(WitnessName);
		WitnessName.sendKeys(Witness_Name);
	}

	public void enterNoticingFirmName(String Noticing_Firm_Name) {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(NoticingFirm);
		NoticingFirm.sendKeys(Noticing_Firm_Name);
	}

	public void enterCaseName(String Case_Name) {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Case);
		Case.sendKeys(Case_Name);
	}

	public void enterWitnessName() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(WitnessName);
		String Witnessname = "Witness Name -" + RandomStringUtils.randomAlphabetic(2);
		WitnessName.sendKeys(Witnessname);
	}

	public void enterNoticingFirmName() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(NoticingFirm);
		String Noticngfirmname = "Noticing firm name" + RandomStringUtils.randomAlphabetic(2);
		NoticingFirm.sendKeys(Noticngfirmname);
	}

	public void enterCaseName() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Case);
		String Casename = "Case Name -" + RandomStringUtils.randomAlphabetic(8);
		Case.sendKeys(Casename);
	}

	public void clickOnCreateButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(CreateButton);
		CreateButton.click();
		
	}

	public boolean isDisplayed(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public void clickOnCreateButtonForNotValidData() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(CreateButton);
		CreateButton.click();
		Boolean value = false;

		if (isDisplayed(ValidationMessage1) || isDisplayed(ValidationMessage2)) {
			value = true;
		}
		Assert.assertTrue(value);
	}

	public void clickOnUploadFileButton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(UploadFilesButton);
		UploadFilesButton.click();
	}

	public void uploadTheFile() throws InterruptedException, AWTException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Upload);
		Upload.click();
		util.Uploadfile("src/test/resources/Upload/sample file.xlsx");
		Thread.sleep(2000);
	}public void uploadTheFileImage() throws InterruptedException, AWTException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Upload);
		Upload.click();
		util.Uploadfile("src/test/resources/Upload/SampleXLSFile.xls");
		Thread.sleep(2000);
	}
	public void uploadThepdfFile() throws InterruptedException, AWTException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Upload);
		Upload.click();
		util.Uploadfile("src/test/resources/Upload/Smaple PDF.pdf");
		Thread.sleep(2000);
	}
	public void uploadThepdf() throws InterruptedException, AWTException {
		util = new WebDriverUtil();
		util.Uploadfile("src/test/resources/Upload/Smaple PDF.pdf");
		Thread.sleep(5000);
	}

	public void clickInSubmitButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(SubmitButton);
		SubmitButton.click();

	}

	// Method Related to Update deposition

	public void clickOnDottedDroppedMenuOfCreatedDeposion() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(DotteddropownMenu);
		DotteddropownMenu.click();
	}

	public void clickOnSettingButton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(SettingButton);
		SettingButton.click();
	}

	public void updateWitnessName() {
		util = new WebDriverUtil();
		util.waitForElementJavaScript(UpdateWitnessName);
		UpdateWitnessName.sendKeys(Keys.CONTROL + "a");
		UpdateWitnessName.sendKeys(Keys.DELETE);
		String UpdateNoticngfirmname = "Witness" + RandomStringUtils.randomAlphabetic(2);
		UpdateWitnessName.sendKeys(UpdateNoticngfirmname);
	}

	public void clickOnUpdatebutton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(UpdateButton);
		UpdateButton.click();
		Thread.sleep(2000);
	}

	public void updateWitnessNameWithBlankData() {
		util = new WebDriverUtil();
		util.waitForElementJavaScript(UpdateWitnessName);
		UpdateWitnessName.sendKeys(Keys.CONTROL + "a");
		UpdateWitnessName.sendKeys(Keys.DELETE);
	}

	public void updateWitnessNameWithInvalidData() {
		util = new WebDriverUtil();
		util.waitForElementJavaScript(UpdateWitnessName);
		UpdateWitnessName.sendKeys(Keys.CONTROL + "a");
		UpdateWitnessName.sendKeys(Keys.DELETE);
		String UpdateNoticngfirmname = "Witness  @--" + RandomStringUtils.randomAlphabetic(2);
		UpdateWitnessName.sendKeys(UpdateNoticngfirmname);
	}

	public void checkTheValidationMessageForInvalidData() {

		util = new WebDriverUtil();
		util.waitForElementToBeClickable(UpdateButton);
		UpdateButton.click();
		Boolean value = false;
		if (isDisplayed(ValidationMessage1) || isDisplayed(ValidationMessage2)) {
			value = true;
		}
		Assert.assertTrue(value);
	}

	// Method Related to delete deposition

	public void clickOnDeleteButton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Deletebutton);
		Deletebutton.click();
	}

	public void clickOnYesButton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Yesbutton);
		Yesbutton.click();
	}

	public void checkTheValidationMessageForDepositionDeleted()
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
			String Expected = (String) details.get("MessageForDepositionDeleted");
			Assert.assertEquals(actual, Expected);
		}
	}
}
