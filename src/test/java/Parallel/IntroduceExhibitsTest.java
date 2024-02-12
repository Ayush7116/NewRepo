package Parallel;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.pages.IntroduceExhibits;
import com.qa.util.JSONFileClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IntroduceExhibitsTest {
	IntroduceExhibits introduceExhibits;
	WebDriver driver;
	JSONFileClass file;
	JSONObject user;

	@When("click on stamp toggle button")
	public void click_on_stamp_toggle_button() throws InterruptedException {
		introduceExhibits = new IntroduceExhibits(DriverFactory.getDriver());
		introduceExhibits.clickonstamptogglebutton();
	}

	@When("click on stamp exhibit slide button")
	public void click_on_stamp_exhibit_slide_button() throws InterruptedException {
		introduceExhibits = new IntroduceExhibits(DriverFactory.getDriver());
		introduceExhibits.clickonstampexhibitslidebutton();
	}

	@When("verify stamp is applied or not")
	public void verify_stamp_is_applied_or_not() throws InterruptedException {
		introduceExhibits = new IntroduceExhibits(DriverFactory.getDriver());
		introduceExhibits.verifystampisappliedornot();
	}

	@Then("click on stamp setting icon")
	public void click_on_stamp_setting_icon() throws InterruptedException {
		introduceExhibits = new IntroduceExhibits(DriverFactory.getDriver());
		introduceExhibits.clickonstampsettingicon();
	}

	@Then("click on green color icon")
	public void click_on_green_color_icon() throws InterruptedException {
		introduceExhibits = new IntroduceExhibits(DriverFactory.getDriver());
		introduceExhibits.clickongreeniconbutton();
	}

	@Then("click on all checkbox in stamp setting")
	public void click_on_all_checkbox_in_stamp_setting() {
		introduceExhibits = new IntroduceExhibits(DriverFactory.getDriver());
		introduceExhibits.clickonallcheckboxinstampsetting();
	}

	@Then("rename the stamp title")
	public void rename_the_stamp_title() {
		introduceExhibits = new IntroduceExhibits(DriverFactory.getDriver());
		introduceExhibits.renamethestamptitle();
	}

	@Then("click on pdf file")
	public void click_on_pdf_file() throws InterruptedException {
		introduceExhibits = new IntroduceExhibits(DriverFactory.getDriver());
		introduceExhibits.clickonpdffile();
	}

	@Then("click on update button for stamp setting")
	public void click_on_update_button_for_stamp_setting() {
		introduceExhibits = new IntroduceExhibits(DriverFactory.getDriver());
		introduceExhibits.clickonupdatebuttonforstampsetting();
	}

	@Then("click on two step icon")
	public void click_on_two_step_icon() {
		introduceExhibits = new IntroduceExhibits(DriverFactory.getDriver());
		introduceExhibits.clickontwostepicon();
	}

	@Then("click on add to stamp button")
	public void click_on_add_to_stamp_button() throws InterruptedException {
		introduceExhibits = new IntroduceExhibits(DriverFactory.getDriver());
		introduceExhibits.clickonaddtostampbutton();
	}
	

}
