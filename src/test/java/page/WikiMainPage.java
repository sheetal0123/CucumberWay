package page;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class WikiMainPage extends AbstractPage{

//	public WikiMainPage(WebDriver driver) {
//		super(driver);
//	}
	
	
	public static void verifyWikiMainPage(){
		String url = getUrl();
		System.out.println("Main Page Url:"+url);
		//https://en.wikipedia.org/wiki/Main_Page
		Assert.assertTrue(getUrl().endsWith("/wiki/Main_Page"));
	}
	
	public static void navigateToLoginPage(){
		clickElement(Constants.WIKI_LOGIN_LINK);
	}
	
	public static void navigateToTalkPage(){
		clickElement(Constants.WIKI_TAB_TALK);
	}
	
	public static void verifyTalkPage(){
		Assert.assertTrue(getSize(Constants.WIKI_TALK_SEARCH_BUTTON) > 0);
	}
	
	public static void navigateToContentPage(){
		clickElement(Constants.WIKI_CONTENT_LINK);
	}
	
	public static void verifyNatureLink(){
		
	}
	
}
