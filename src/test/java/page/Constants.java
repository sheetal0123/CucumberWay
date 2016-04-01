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

}
