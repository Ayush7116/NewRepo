package com.qa.pages;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.factory.WebDriverUtil;
import com.qa.util.JSONFileClass;

public class ManagerRole {
	@FindBy(xpath = "//input[@placeholder='Enter your email']")
	WebElement email;
	@FindBy(xpath = "//button[normalize-space()='Next']")
	WebElement Nextbtn;
	@FindBy(xpath = "//input[@placeholder='Enter your password']")
	WebElement password;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement LoginBtn;

	WebDriver driver;
	WebDriverUtil util;
	JSONFileClass file;
	JSONObject user;

	public ManagerRole(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginwithaccountowneraccount() throws IOException, ParseException {
		util = new WebDriverUtil();
		file = new JSONFileClass();
		user = file.readJson();
		JSONArray UserArray = (JSONArray) user.get("Managercredentials");
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
}