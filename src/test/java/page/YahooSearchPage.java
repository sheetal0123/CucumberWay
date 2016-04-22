package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class YahooSearchPage extends AbstractPage {

//	public YahooSearchPage(WebDriver driver) {
//		super(driver);
//	}

	public static void verifySearchPage() {
		sleep(2000);
		String srpTitle = getTitle();
		System.out.println("Yahoo SRP Title:" + getTitle());
		Assert.assertTrue("User should be on SRP page", srpTitle.endsWith("Yahoo India Search Results") );
		
	}
	
	public static void verifyResultVolume(){
		System.out.println("Result volume: "+getText(Constants.YAHOOSEARCH_RESULT_VOLUME));
	}
	
	public static void verifyResultsInFirstPage(){
		int firstPageResults = getSize(Constants.YAHOOSEARCH_RESULT_COUNT);
		Assert.assertTrue("Results are more than ten in first page", firstPageResults <= 10);
	}

}
