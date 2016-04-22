package step_defination;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.*;

public class YahooStepFile {

	WebDriver driver;

	@Given("^yahoo is up and running$")
	public void yahoo_is_up_and_running() {
		System.out.println("Yahoo is up...");
	}

	@Given("^I am on yahoo home page$")
	public void i_am_on_yahoo_home_page() {
		YahooHomePage.openUrlWithDriverInitialization("https://in.yahoo.com/?p=us");
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
		System.out.println("*********************** Count");
		YahooSearchPage.verifyResultVolume();
	}

	@Then("^results should not be more than ten$")
	public void results_should_not_be_more_than_ten(){
		YahooSearchPage.verifyResultsInFirstPage();
	}
	
	
	
	@When("^I search for following keywords and verify result volume$")
	public void i_search_for_following_keywords(DataTable arg1) {
		
	    List<List<String>> data = arg1.raw();
	    for(int i=1; i<=3; i++){
	    	String keywd = data.get(i).get(0);
	    	YahooHomePage.searchForKeyword(keywd);
	    	System.out.println(keywd);
	    	YahooHomePage.sleep(3000);
	    	YahooSearchPage.verifyResultVolume();
	    	YahooHomePage.sleep(3000);
	    	YahooHomePage.openUrl("https://in.yahoo.com/?p=us");
	    }
	    
	}
	
	@Then("^I closed the yahoo site$")
	public void i_closed_the_yahoo_site() {
		AbstractPage.quitApplication();;
	}

}
