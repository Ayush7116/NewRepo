package Parallel;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.pages.ViewerUpload;
import com.qa.util.JSONFileClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewerUploadTest {
	ViewerUpload viewerupload;
	WebDriver driver;
	JSONFileClass file;
	JSONObject user;

	@Then("click on or select files upload button")
	public void click_on_or_select_files_upload_button() throws InterruptedException {
		viewerupload = new ViewerUpload(DriverFactory.getDriver());
		viewerupload.clickonorselectfilesuploadbutton();
	}

	@Then("click on share exhibit button")
	public void click_on_share_exhibit_button() throws InterruptedException {
		viewerupload = new ViewerUpload(DriverFactory.getDriver());
		viewerupload.clickonshareexhibitbutton();
	}
	@Then("click on size sorting button")
	public void click_on_size_sorting_button() throws InterruptedException {
		viewerupload = new ViewerUpload(DriverFactory.getDriver());
		viewerupload.clickonsizesortingbutton();
	}
	@Then("click on size sorting button in exhibit portal")
	public void click_on_size_sorting_button_in_exhibit_portal() throws InterruptedException {
		viewerupload = new ViewerUpload(DriverFactory.getDriver());
		viewerupload.clickonsizesortingbuttoninexhibitportal();
	}
	@Then("click on top file")
	public void click_on_top_file() throws InterruptedException {
		viewerupload = new ViewerUpload(DriverFactory.getDriver());
		viewerupload.clickontopfile();
	}
	@Then("rename the exhibit number")
	public void rename_the_exhibit_number() throws InterruptedException {
		viewerupload = new ViewerUpload(DriverFactory.getDriver());
		viewerupload.renametheexhibitnumber();
	}

	@Then("click on refresh button")
	public void click_on_refresh_button() throws InterruptedException {
		viewerupload = new ViewerUpload(DriverFactory.getDriver());
		viewerupload.clickOnRefreshButton();
	}

	@When("click on dotted button of upload image")
	public void click_on_dotted_button_of_upload_image() throws InterruptedException {
		viewerupload = new ViewerUpload(DriverFactory.getDriver());
		viewerupload.clickOnDottedButtonOfUploadImage();
	}

	@When("click on full view button icon")
	public void click_on_full_view_button_icon() throws InterruptedException {
		viewerupload = new ViewerUpload(DriverFactory.getDriver());
		viewerupload.clickOnfullviewbuttonicon();
	}
	@When("click on dotted dropped menu of uploaded file")
	public void click_on_dotted_dropped_menu_of_selected_file() {
		viewerupload = new ViewerUpload(DriverFactory.getDriver());
		viewerupload.clickOnDottedDroppedMenuOfSelectedFile();
	}
	@When("click on three dotted button in pdf viewer")
	public void click_on_three_dotted_button_in_pdf_viewer() {
		viewerupload = new ViewerUpload(DriverFactory.getDriver());
		viewerupload.clickOnthreedottedbuttoninPDFviewer();
	}
	@When("click on pdf viewer toggle button")
	public void click_on_pdf_viewer_toggle_button() {
		viewerupload = new ViewerUpload(DriverFactory.getDriver());
		viewerupload.clickOnpdfviewertogglebutton();
	}
}
