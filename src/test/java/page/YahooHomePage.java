package page;

import org.openqa.selenium.WebDriver;


public class YahooHomePage extends AbstractPage {

//	public YahooHomePage(WebDriver driver) {
//		super(driver);
//	}

	public static void searchForKeyword(String keyword) {
		sleep(3000);
		waitForPresenceOfElement(Constants.YAHOOHOME_TEXTBOX);
		System.out.println();
		//System.out.println("Yahoo Home Page Title:" + getTitle());
		enterText(Constants.YAHOOHOME_TEXTBOX, keyword);
		clickElement(Constants.YAHOOHOME_SEARCH_BUTTON);
	}


}
