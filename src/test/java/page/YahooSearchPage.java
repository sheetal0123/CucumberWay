package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class YahooSearchPage extends AbstractPage {

	public YahooSearchPage(WebDriver driver) {
		super(driver);
	}

	public static void verifySearchPage() {
		sleep(2000);
		System.out.println("*** SRP Title:" + getTitleName());
		System.out.println("*** Count:" + getSize(Constants.YAHOOSEARCH_RESULT_COUNT));
		Assert.assertTrue("*** Search result is not 10", getSize(Constants.YAHOOSEARCH_RESULT_COUNT) == 10);
	}
	
	public static void verifyResultVolume(){
		System.out.println("*** Result volume: "+getText(Constants.YAHOOSEARCH_RESULT_VOLUME));
	}

}
