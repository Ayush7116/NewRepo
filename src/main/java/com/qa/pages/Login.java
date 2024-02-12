package com.qa.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.factory.WebDriverUtil;
import com.qa.util.JSONFileClass;

public class Login {
	@FindBy(xpath = "//input[@placeholder='Enter your email']")
	WebElement email;
	@FindBy(xpath = "//button[normalize-space()='Next']")
	WebElement Nextbtn;
	@FindBy(xpath = "//span[@class='text-danger']")
	WebElement Message;
	@FindBy(xpath = "//p[@class='text-danger m-0m mt-2']")
	WebElement wrongPasswordMessage;
	@FindBy(xpath = "//div[text()='Invalid credentials.']")
	WebElement Alertbox;
	@FindBy(xpath = "//input[@placeholder='Enter your password']")
	WebElement password;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement LoginBtn;

	WebDriver driver;
	WebDriverUtil util;
	JSONFileClass file;
	JSONObject user;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterTheEmail(String Email) {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(email);
		email.sendKeys(Email);
	}

	public void clickOnSubmitButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(Nextbtn);
		util.waitForElementJavaScript(Nextbtn);
	}

	public void checkthevalidationmessage() throws IOException, ParseException {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(Message);
		String actual = Message.getText();
		file = new JSONFileClass();
		user = file.readJson();

		JSONArray UserArray = (JSONArray) user.get("Login_AccountOwner");
		for (int i = 0; i < UserArray.size(); i++) {
			JSONObject detail = (JSONObject) UserArray.get(i);

			if (actual == "Invalid Email.") {

				String Expected = (String) detail.get("Message");
				Assert.assertEquals(actual, Expected);
			} else if (actual == "Required") {
				String Expected = (String) detail.get("MessageForEmpty");
				Assert.assertEquals(actual, Expected);
			}
		}
	}

	@SuppressWarnings("deprecation")
	public void checkthevalidalertmessage() throws IOException, ParseException {
		util = new WebDriverUtil();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		file = new JSONFileClass();
		user = file.readJson();
		util.waitForElementVisiblity(Alertbox);
		String actual = Alertbox.getText();
		JSONArray UserArray = (JSONArray) user.get("Login_AccountOwner");
		for (int i = 0; i < UserArray.size(); i++) {
			JSONObject detail = (JSONObject) UserArray.get(i);
			String Expected = (String) detail.get("AlertMessage");
			Assert.assertEquals(actual, Expected);
		}
	}

	public void enterThePassword(String Password) {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(password);
		password.click();
		password.sendKeys(Password);
	}

	public void clickOnLoginButton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(LoginBtn);
		LoginBtn.click();
	}

	public void checkthevalidationmessageforwrongpassword() throws IOException, ParseException {
		util = new WebDriverUtil();
		util.waitForElementVisiblity(wrongPasswordMessage);
		file = new JSONFileClass();
		user = file.readJson();
		String actual = wrongPasswordMessage.getText();
		JSONArray UserArray = (JSONArray) user.get("Login_AccountOwner");
		for (int i = 0; i < UserArray.size(); i++) {
			JSONObject detail = (JSONObject) UserArray.get(i);
			String expected = (String) detail.get("MessageForWrongPassword");
			Assert.assertEquals(actual, expected);
		}

	}
}
