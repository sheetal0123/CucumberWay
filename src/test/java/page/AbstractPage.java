package page;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {

	protected static WebDriver driver;
	static String baseUrl = "https://in.yahoo.com/?p=us";
	public static String cmdDriver;

	public AbstractPage(WebDriver driver) {
		AbstractPage.driver = driver;
	}

	public static void getDriverFromCMD() {
		cmdDriver = System.getProperty("driver");
		System.out.println("Input Driver: " + cmdDriver);
	}

	public static WebDriver getDriver() {
		if (cmdDriver != null && !cmdDriver.trim().isEmpty()) {
			if (cmdDriver.equals("firefox")) {
				System.out.println("Running with CMD firefox driver");
				driver = new FirefoxDriver();
			} else if (cmdDriver.equals("chrome")) {
				System.out.println("Running with CMD chrome driver");
				System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (cmdDriver.equals("ie")) {
				System.out.println("Running with CMD IE driver");
				System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		} else {
			//System.out.println("Else loop: Running with default firefox driver");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void closeApplication() {
		driver.quit();
	}

	public static YahooHomePage navigateToApplication(WebDriver driver) {
		driver.navigate().to(baseUrl);
		return new YahooHomePage(driver);
	}

	public static void sleep(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void waitForPresenceOfElement(By byType) {
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(byType));
	}

	public static void clickElement(By byType) {
		driver.findElement(byType).click();
	}

	public static void enterText(By byType, String str) {
		driver.findElement(byType).sendKeys(str);
	}

	public static void clearText(By byType) {
		driver.findElement(byType).clear();
	}

	public static String getText(By byType) {
		return driver.findElement(byType).getText();
	}

	
	public static int getSize(By byType) {
		return driver.findElements(byType).size();
	}

	public static String getTitleName() {
		return driver.getTitle();
	}

	public static void uploadImageUsingJavascript(By byType, String path) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(byType);
		js.executeScript("arguments[0].style.display= 'block';", element);
		element.sendKeys(path);
		sleep(2000);
	}

	public static void uploadImageFromWindowFileExplorer(String fileLocation) {
		sleep(2000);
		try {
			// setClipboardData(fileLocation);
			System.out.println("File to be added: " + fileLocation);
			StringSelection stringSelection = new StringSelection(fileLocation);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

			Robot robot = new Robot();

			// paste path
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);

			// press enter
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
