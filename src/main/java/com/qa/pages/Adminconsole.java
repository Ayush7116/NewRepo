package com.qa.pages;

import java.io.IOException;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.factory.DriverFactory;
import com.qa.factory.WebDriverUtil;
import com.qa.util.JSONFileClass;

public class Adminconsole {
	WebDriver driver;
	WebDriverUtil util;
	JSONFileClass file;
	JSONObject user;
	String newWindowHandle = null;

	@FindBy(xpath = "//div[@class='dropdown']//button[@id='dropdownMenuLink-header']")
	WebElement usermenu;
	@FindBy(xpath = "//div[contains(@class,'dropdown-menu w-100 header-dropdown-menu py-4 w-auto custom-header-dropdown show')]//div//span[contains(@class,'fs-13 fw-400')][normalize-space()='Admin Console']")
	WebElement AdminConsolebutton;
	@FindBy(xpath = "//input[@id='admin-console-invite-email']")
	WebElement userinviteplaceholder;
	@FindBy(xpath = "//button[normalize-space()='Invite User']")
	WebElement userinvitebutton;
	@FindBy(xpath = "//a[@id='v-pills-users-tab']")
	WebElement usersbutton;
	@FindBy(xpath = "//div[@class='MuiAlert-message']")
	WebElement validationMessage;
	@FindBy(xpath = "//li[@id='menu-item-7935']//span[@class='x-menu-link-text'][normalize-space()='GET FREE TRIAL']")
	WebElement getfreebutton;
	@FindBy(xpath = "//input[@id='inbox_field']")
	WebElement inputfeildbutton;
	@FindBy(xpath = "//button[normalize-space()='GO']")
	WebElement gobutton;
	@FindBy(xpath = "//div[@id='requestTrial']//button[@aria-label='Close']//*[name()='svg']")
	WebElement crossButtonInMailinator;
	@FindBy(xpath = "(//td[@class='ng-binding'][normalize-space()='CaseUp'])[1]")
	WebElement clickoninvitation;
	@FindBy(xpath = "//a[contains(text(),'https://staging.virtualdepo.com/manager?email=2709')]")
	WebElement acceptinvitebutton;
	@FindBy(xpath = "//input[@placeholder='Full Name']")
	WebElement fullnamebutton;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement passwordbutton;
	@FindBy(xpath = "//input[@placeholder='Confirm']")
	WebElement confirmbutton;
	@FindBy(xpath = "//label[@for='html2']")
	WebElement checkboxbutton;
	@FindBy(xpath = "//button[normalize-space()='Create Account']")
	WebElement createacountbutton;
	@FindBy(xpath = "//td[normalize-space()='Automationcaseup11@mailinator.com']/..//a[@class='dropdown-toggle ps-3 pe-3']")
	WebElement togglebuttonforuserinvited;
	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right dropoptions show']//span[@class='mb-0'][normalize-space()='Remove']")
	WebElement removebuttonforuserinvited;
	@FindBy(xpath = "//span[normalize-space()='No, Remove user']")
	WebElement noRemoveUserButton;
	@FindBy(xpath = "//span[normalize-space()='Yes, Assign user']")
	WebElement yesassignUserButton;
	@FindBy(xpath = "//input[@id='case-auto-suggest3']")
	WebElement inputemailUserButton;
	@FindBy(xpath = "//div[@class='modal-dialog modal-fullscreen light-white bb']//div[@aria-label='Close']")
	WebElement CrossiconButtonforadmin;

	public Adminconsole(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void removeinviteduserifalreadyinvited() throws InterruptedException {
		util = new WebDriverUtil();
		if (util.isDisplayed(togglebuttonforuserinvited)) {
			util.waitForElementToBeClickable(togglebuttonforuserinvited);
			togglebuttonforuserinvited.click();
			util.waitForElementToBeClickable(removebuttonforuserinvited);
			removebuttonforuserinvited.click();
			util.waitForElementToBeClickable(noRemoveUserButton);
			noRemoveUserButton.click();
			util.waitForElementToBeClickable(CrossiconButtonforadmin);
			CrossiconButtonforadmin.click();

		} else {
			util.waitForElementToBeClickable(CrossiconButtonforadmin);
			CrossiconButtonforadmin.click();
			Thread.sleep(2000);

		}
	}

	public void clickonmyprofilelogo() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(usermenu);
		usermenu.click();
		Thread.sleep(2000);
	}

	public void clickontheadminconsolebutton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(AdminConsolebutton);
		AdminConsolebutton.click();

	}

	public void clickontheusersbutton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(usersbutton);
		usersbutton.click();

	}

	public void clickonthetogglebuttonformyemail() {
		util = new WebDriverUtil();

	}

	public void clickontheremovebutton() {
		util = new WebDriverUtil();
	}

	public void confirmbyclickingthenoremoveuserbutton() {
		util = new WebDriverUtil();

	}

	public void clickonaddnewuserandwriteusername() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(userinviteplaceholder);
		userinviteplaceholder.click();
		userinviteplaceholder.sendKeys("Automationcaseup11@mailinator.com");

	}

	public void clickoninviteuserbutton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(userinvitebutton);
		userinvitebutton.click();

	}

	public void checkthevalidationmessageforuserinvited() throws IOException, ParseException, InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(1000);
		util.waitForElementVisiblity(validationMessage);
		String actual = validationMessage.getText();
		file = new JSONFileClass();
		user = file.readJson();
		JSONArray UserArray = (JSONArray) user.get("ValidationMessage");
		for (int i = 0; i < UserArray.size(); i++) {
			JSONObject details = (JSONObject) UserArray.get(i);
			String Expected = (String) details.get("MessageForUserInvited");
			Assert.assertEquals(actual, Expected);
		}
	}

	public void inviteuserandacceptinviteinmailinator() throws InterruptedException {
		util = new WebDriverUtil();
		String mainWindowHandle = driver.getWindowHandle();

		String url = "https://www.mailinator.com/";

		JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverFactory.getDriver();
		jsExecutor.executeScript("window.open('" + url + "');");

		Set<String> windowHandles = driver.getWindowHandles();
		String newWindowHandle = null;
		for (String windowHandle : windowHandles) {
			if (!windowHandle.equals(mainWindowHandle)) {
				driver.switchTo().window(windowHandle);
				newWindowHandle = windowHandle;
				break;
			}
		}
		util.waitForElementToBeClickable(getfreebutton);
		getfreebutton.click();
		util.waitForElementToBeClickable(crossButtonInMailinator);
		crossButtonInMailinator.click();
		Thread.sleep(1000);
		util.waitForElementToBeClickable(inputfeildbutton);
		inputfeildbutton.sendKeys("Automationcaseup11");
		Thread.sleep(1000);
		util.waitForElementToBeClickable(gobutton);
		gobutton.click();
		driver.switchTo().window(mainWindowHandle);
		userinviteplaceholder.click();
		userinviteplaceholder.sendKeys("Automationcaseup11@mailinator.com");
		util.waitForElementToBeClickable(userinvitebutton);
		userinvitebutton.click();
		Thread.sleep(5000);
		driver.switchTo().window(newWindowHandle);
		util.waitForElementToBeClickable(clickoninvitation);
		clickoninvitation.click();
		Thread.sleep(5000);
		String iframeId = "html_msg_body";
		driver.switchTo().frame(iframeId);
		String link = acceptinvitebutton.getText();
		driver.switchTo().defaultContent();
		util.CreateNewTabWithUrl(link);
		Thread.sleep(3000);

	}

	public void accepttheinvitationthroughmailiantor() {
		util = new WebDriverUtil();

	}

	public void createuserwindowopenthenenterfullname() {
		util = new WebDriverUtil();
		fullnamebutton.click();
		fullnamebutton.sendKeys("Automationcaseup");

	}

	public void clickonpasswordbuttonandenterpassword() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(passwordbutton);
		passwordbutton.click();
		passwordbutton.sendKeys("Test@123");

	}

	public void clickonconfirmpasswordbuttonandsamepassword() {
		util = new WebDriverUtil();
		confirmbutton.click();
		confirmbutton.sendKeys("Test@123");

	}

	public void checkthetermandcondition() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(checkboxbutton);
		checkboxbutton.click();

	}

	public void clickoncreateaccount() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(createacountbutton);
		createacountbutton.click();

	}

	public void clickOntheToggleButtonForInvitedEmail() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(togglebuttonforuserinvited);
		togglebuttonforuserinvited.click();

	}

	public void clickOnRemoveButtonInToggleButton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(removebuttonforuserinvited);
		removebuttonforuserinvited.click();

	}

	public void clickonNoRemoveUserButton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(noRemoveUserButton);
		noRemoveUserButton.click();

	}

	public void clickonyesassignnewuserbutton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(yesassignUserButton);
		yesassignUserButton.click();

	}

	public void enteremailtoassigndeposition() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(inputemailUserButton);
		inputemailUserButton.click();
		inputemailUserButton.sendKeys("qa.guest@mailinator.com");

	}

}