package step_defination;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.AbstractPage;
import page.YahooHomePage;
import page.YahooSearchPage;

public class StepFile {

	WebDriver driver;

	@Given("^yahoo is up and running$")
	public void yahoo_is_up_and_running() {
		System.out.println("Yahoo is up...");
	}

	@Given("^I am on yahoo home page$")
	public void i_am_on_yahoo_home_page() {
		driver = AbstractPage.getDriver();
		YahooHomePage.navigateToApplication(driver);
	}

	@When("^I search for test automation$")
	public void i_search_for_test_automation() {
		YahooHomePage.searchForKeyword("test automation");
	}

	@Then("^I verify search result count$")
	public void i_verify_search_result_count() {
		YahooSearchPage.verifySearchPage();
	}

	@Then("^I verify total result count$")
	public void i_verify_total_result_count() {
		YahooSearchPage.verifyResultVolume();
	}

	@Then("^results should not be more than ten$")
	public void results_should_not_be_more_than_ten(){
		YahooSearchPage.verifyResultsInFirstPage();
	}
	
	@Then("^I closed the yahoo site$")
	public void i_closed_the_yahoo_site() {
		AbstractPage.closeApplication();
	}

}
