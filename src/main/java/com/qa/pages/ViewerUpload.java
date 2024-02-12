package com.qa.pages;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.factory.WebDriverUtil;
import com.qa.util.JSONFileClass;

public class ViewerUpload {
	WebDriver driver;
	WebDriverUtil util;
	JSONFileClass file;
	JSONObject user;
	
	@FindBy(xpath = "//div[normalize-space()='Or, select files to upload']")
	WebElement orselectfileuploadbutton;
	@FindBy(xpath = "//span[contains(text(),'Share Exhibit')]")
	WebElement shareexhibitbutton;
	@FindBy(xpath = "//input[@placeholder='Enter Exhibit Number..']")
	WebElement renameexhibitbutton;
	@FindBy(xpath = "//button[@class='border-0 bg-white p-0 d-flex align-items-center justify-content-center btn-inv-copy present-hover-left tooltip-custom cross-hover-refresh']")
	WebElement refreshbutton;
	@FindBy(xpath = "//div[@class='dropdown ']//a[@id='dropdownMenuLink-dotted']//*[name()='svg']")
	WebElement imagedottedbutton;
	@FindBy(xpath = "//span[@class='vd-box-data-name btn-text position-relative date-style me-4 table-file-name-settings'][normalize-space()='SampleXLSFile.xls']")
	WebElement xlsfile;
	@FindBy(xpath = "//body/div[@id='app']/div[contains(@class,'open-menu h-100')]/div[contains(@class,'container-fluid px-0 h-100')]/div[contains(@class,'row gx-0 h-100')]/div[contains(@class,'vd-right-content-box py-0')]/div[@id='v-pills-tabContent']/div[@id='v-pills-home']/div[contains(@class,'vd-right-cont-main-box h-100 pr-0 pl-0 pl-lg-3')]/div[contains(@class,'row gx-0 h-100 page_height')]/div[contains(@class,'vd-new-design-table-box col-md-6 d-none d-md-block side-view-ext aa')]/div[contains(@class,'px-4 loader_middle false')]/div[contains(@class,'table-responsive document-slide-view-table mt-3 aa')]/table[contains(@class,'')]/thead/tr[contains(@class,'row m-0')]/th[1]/span[1]")
	WebElement sizesortingbutton;
	@FindBy(xpath = "//body/div[@id='app']/div[contains(@class,'container-fluid p-0 h-100')]/div[contains(@class,'row h-100 gx-0 page_height')]/div[contains(@class,'vd-new-design-table-box border-exb-end')]/div[contains(@class,'px-4 loader_middle')]/div[contains(@class,'table-responsive mt-3 exhibit-table')]/table[contains(@class,'table table-fixed mb-0')]/thead[contains(@class,'table-heading-color')]/tr[contains(@class,'row m-0')]/th[1]/span[1]")
	WebElement sizesortingbuttoninexhibit;
	@FindBy(xpath = "//div[@class='vd-viewer-tabs-icon d-sm-block d-none pointer btn-inv-copy present-hover-left tooltip-custom false']")
	WebElement fullviewbutton;
	@FindBy(xpath = "//td[contains(@title,'20')]/..//a[@id='dropdownMenuLink-dotted']")
	WebElement DottedDroppedMenu;
	@FindBy(xpath = "//a[@id='dropdownMenuLink-dotted']")
	WebElement pdfottedbutton;
	@FindBy(xpath = "//label[@for='pdfViewerStatus']//span")
	WebElement pdftogglebutton;

	public ViewerUpload(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickonorselectfilesuploadbutton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(orselectfileuploadbutton);
		orselectfileuploadbutton.click();
	}
	public void clickonshareexhibitbutton() throws InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(5000);
		util.waitForElementToBeClickable(shareexhibitbutton);
		shareexhibitbutton.click();
		Thread.sleep(5000);
	}
	public void renametheexhibitnumber() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(renameexhibitbutton);
		renameexhibitbutton.click();
		renameexhibitbutton.clear();
		renameexhibitbutton.sendKeys("20");
	}
	public void clickOnRefreshButton() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(refreshbutton);
		refreshbutton.click();
		Thread.sleep(3000);
	}
	public void clickOnDottedButtonOfUploadImage() throws InterruptedException {
		util = new WebDriverUtil();
		Thread.sleep(15000);
		util.waitForElementToBeClickable(imagedottedbutton);
		imagedottedbutton.click();
	}
	public void clickOnfullviewbuttonicon() throws InterruptedException {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(fullviewbutton);
		fullviewbutton.click();
		Thread.sleep(3000);
	}
	public void clickOnDottedDroppedMenuOfSelectedFile() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(DottedDroppedMenu);
		DottedDroppedMenu.click();
	}
	public void clickonsizesortingbutton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(sizesortingbutton);
		sizesortingbutton.click();
	}
	public void clickonsizesortingbuttoninexhibitportal() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(sizesortingbuttoninexhibit);
		sizesortingbuttoninexhibit.click();
	}
	public void clickontopfile() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(xlsfile);
		xlsfile.click();
	}
	public void clickOnthreedottedbuttoninPDFviewer() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(pdfottedbutton);
		pdfottedbutton.click();
	}
	public void clickOnpdfviewertogglebutton() {
		util = new WebDriverUtil();
		util.waitForElementToBeClickable(pdftogglebutton);
		pdftogglebutton.click();
	}
}
