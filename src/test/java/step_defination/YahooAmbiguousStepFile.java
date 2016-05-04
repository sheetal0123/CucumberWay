package step_defination;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import page.*;

public class YahooAmbiguousStepFile {

	WebDriver driver;
	
	//Given is duplicate
	//@Given("^I am on yahoo home page$")
	public void i_am_on_yahoo_home_page() {
		YahooHomePage.openUrlWithDriverInitialization("https://in.yahoo.com/?p=us");
	}

	//@Then("^I closed the (.*?) site$")
	public void i_close_the_any_site() {
		AbstractPage.quitApplication();;
	}

}
