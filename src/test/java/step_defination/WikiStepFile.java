package step_defination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.*;

public class WikiStepFile {

	WebDriver driver;

	@Given("^I am on wiki main page$")
	public void i_am_on_wiki_main_page() {
		// driver = AbstractPage.getDriver();
		AbstractPage.openUrlWithDriverInitialization("https://en.wikipedia.org/wiki/Main_Page");
	}

	@When("^I login with default credentials$")
	public void i_login_with_default_credentials() {
		WikiMainPage.navigateToLoginPage();
		WikiLoginPage.loginWiki("sheetal0123", "India@123");
	}

	@Then("^I will be on wiki home page$")
	public void i_will_be_on_wiki_home_page() {
		WikiMainPage.verifyWikiMainPage();
	}

	@When("^I click on talk tab$")
	public void i_click_on_talk_tab() {
		WikiMainPage.navigateToTalkPage();
	}

	@Then("^I verify talk search button$")
	public void i_verify_talk_search_button() {
		WikiMainPage.verifyTalkPage();
	}

	@When("^I click on Contents link$")
	public void i_click_on_Contents_link() {
		WikiMainPage.navigateToContentPage();
	}

	@Then("^I verify Nature redirect link$")
	public void i_verify_Nature_redirect_link() {
		WikiMainPage.clickElement(Constants.WIKI_CONTENT_NATURE);
		String h1 = WikiMainPage.getText(Constants.WIKI_NATURE_H1);
		System.out.println(">>" + h1);
		Assert.assertTrue(h1.equals("Portal:Contents/Natural and physical sciences"));
	}

	@When("^I enters \"([^\"]*)\" in username field$")
	public void i_enters_in_username_field(String arg1) {
		WikiMainPage.navigateToLoginPage();
		WikiLoginPage.enterUserName(arg1);
	}

	@When("^I enters \"([^\"]*)\" in password field$")
	public void i_enters_in_password_field(String arg1) {
		WikiLoginPage.enterPassword(arg1);
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() {
		WikiLoginPage.clickLoginButton();
	}

	@Then("^I close application$")
	public void i_close_application() {
		 WikiMainPage.quitApplication();
	}

}
