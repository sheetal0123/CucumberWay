package page;

import org.openqa.selenium.WebDriver;

public class WikiLoginPage extends AbstractPage{

//	public WikiLoginPage(WebDriver driver) {
//		super(driver);
//	}

	
	public static void loginWiki(String loginName, String loginPassword){
		enterText(Constants.WIKI_LOGIN_NAME, loginName);
		enterText(Constants.WIKI_LOGIN_PASSWORD, loginPassword);
		clickElement(Constants.WIKI_LOGIN_BUTTON);
	}
	
	
	public static void enterUserName(String loginName){
		enterText(Constants.WIKI_LOGIN_NAME, loginName);
	}
	
	public static void enterPassword(String loginPassword){
		enterText(Constants.WIKI_LOGIN_PASSWORD, loginPassword);
	}
	
	public static void clickLoginButton(){
		clickElement(Constants.WIKI_LOGIN_BUTTON);
	}
}
