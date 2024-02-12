package com.qa.pages;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.factory.WebDriverUtil;
import com.qa.util.JSONFileClass;

public class IntroduceExhibits {
	WebDriver driver;
	WebDriverUtil util;
	JSONFileClass file;
	JSONObject user;

	@FindBy(xpath = "//div[contains(@class,'mx-0 px-0 bg-light right-exibit-section')]//div[contains(@class,'ps-2 pe-sm-40 pe-0')]//button[contains(@type,'button')]")
	WebElement stamptogglebutton;
	@FindBy(xpath = "//div[contains(@data-popper-placement,'bottom-end')]//span[contains(@class,'slider-custom round')]")
	WebElement stampexbitslidebutton;
	@FindBy(xpath = "//div[@class='row gx-0']//div[1]//div[1]//div[1]//span[3]")
	WebElement stampsymbol;
	@FindBy(xpath = "(//a[@class='pointer ps-2'])[1]")
	WebElement stampsettingsymbol;
	@FindBy(xpath = "(//span[contains(@class,'checkmark')])[1]")
	WebElement checkbox1;
	@FindBy(xpath = "(//span[contains(@class,'checkmark')])[2]")
	WebElement checkbox6;
	@FindBy(xpath = "(//span[contains(@class,'checkmark')])[3]")
	WebElement checkbox2;
	@FindBy(xpath = "(//span[contains(@class,'checkmark')])[4]")
	WebElement checkbox3;
	@FindBy(xpath = "(//span[contains(@class,'checkmark')])[5]")
	WebElement checkbox4;
	@FindBy(xpath = "(//span[contains(@class,'checkmark')])[6]")
	WebElement checkbox5;
	@FindBy(xpath = "(//div[contains(text(),'Update')])[1]")
	WebElement updatebutton;
	@FindBy(xpath = "//label[@id='color_4']")
	WebElement greeniconbuttonbutton;
	@FindBy(xpath = "//span[@class='vd-box-data-name btn-text position-relative date-style me-4 table-file-name-settings'][normalize-space()='Smaple PDF.pdf']")
	WebElement pdfbutton;
	@FindBy(xpath = "(//input[contains(@placeholder,'Stamp Title')])[1]")
	WebElement renamestamptitle;
	@FindBy(xpath = "//label[contains(@for,'twoStepStampStatus')]//span[contains(@class,'slider-custom round')]")
	WebElement twostepslidebutton;
	@FindBy(xpath = "//div[contains(@class,'d-flex w-100 align-items-center justify-content-end')]//button[contains(@class,'btn-custom-ad false')]")
	WebElement addtostampbutton;

	public IntroduceExhibits(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickonstamptogglebutton() throws InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(3000);
		util.waitForElementToBeClickable(stamptogglebutton);
		stamptogglebutton.click();
	}

	public void clickonstampexhibitslidebutton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(stampexbitslidebutton);
		stampexbitslidebutton.click();
		Thread.sleep(2000);
	}

	public void verifystampisappliedornot() throws InterruptedException {
		util = new WebDriverUtil();
		Assert.assertTrue(util.isDisplayed(stampsymbol));
	}

	public void clickonstampsettingicon() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(stampsettingsymbol);
		stampsettingsymbol.click();
	}

	public void clickongreeniconbutton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(greeniconbuttonbutton);
		greeniconbuttonbutton.click();
	}

	public void clickonallcheckboxinstampsetting() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(checkbox2);
		checkbox2.click();
		util.waitForElementToBeClickable(checkbox4);
		checkbox4.click();
		util.waitForElementToBeClickable(checkbox5);
		checkbox5.click();
		util.waitForElementToBeClickable(checkbox6);
		checkbox6.click();
	}

	public void renamethestamptitle() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(renamestamptitle);
		renamestamptitle.click();
		renamestamptitle.clear();
		renamestamptitle.sendKeys("rename");
	}

	public void clickonupdatebuttonforstampsetting() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(updatebutton);
		updatebutton.click();
	}

	public void clickonpdffile() throws InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(9000);
		util.waitForElementToBeClickable(pdfbutton);
		pdfbutton.click();
		util.button_Refresh();
	}

	public void clickontwostepicon() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(twostepslidebutton);
		twostepslidebutton.click();
	}

	public void clickonaddtostampbutton() throws InterruptedException {
		Thread.sleep(2000);
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(addtostampbutton);
		addtostampbutton.click();
		Thread.sleep(3000);
	}
}