package page;

import org.openqa.selenium.By;

public class Constants {

	// YAHOO HOME PAGE
	public static By YAHOOHOME_TEXTBOX = By.id("UHSearchBox");
	public static By YAHOOHOME_SEARCH_BUTTON = By.id("UHSearchWeb");

	// YAHOO SEARCH PAGE
	public static By YAHOOSEARCH_SELENIUM_HQ = By.xpath("//a[contains(text(),'Selenium - Official Site')]");
	public static By YAHOOSEARCH_RESULT_COUNT = By.xpath("//div[@id='web']/ol/li");
	public static By YAHOOSEARCH_RESULT_VOLUME = By.xpath("//div[@class='compPagination']/span");

	//Wiki Login
	public static By WIKI_LOGIN_LINK = By.xpath("//li[@id='pt-login']/a");
	public static By WIKI_LOGIN_NAME = By.id("wpName1");
	public static By WIKI_LOGIN_PASSWORD = By.id("wpPassword1");
	public static By WIKI_LOGIN_BUTTON = By.id("wpLoginAttempt");
	
	//Wiki Main Page
	public static By WIKI_LOGIN_USER_NAME = By.xpath("//li[@id='pt-userpage']/a");
	public static By WIKI_TAB_TALK = By.xpath("//li[@id='ca-talk']/span/a");
	public static By WIKI_CONTENT_LINK = By.xpath("//li[@id='n-contents']/a");
	
	//Wiki Talk Page
	public static By WIKI_TALK_SEARCH_BUTTON = By.xpath("//form[@id='searchbox']/p/input[3]");
	
	//Wiki Content Page
	public static By WIKI_CONTENT_NATURE = By.xpath("//div[@id='mw-content-text']/div[2]/p/small/span[7]/a");
	public static By WIKI_NATURE_H1 = By.tagName("h1");
	
}
