package sbteste.util;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class AbstractSetDrivers {
	protected static final Logger LOGGER = Logger.getLogger( AbstractSetDrivers.class.getName() );
	private static final String WEB_DRIVER_GOOGLE_CHROME = "webdriver.chrome.driver";
	private static final String WEB_DRIVER_FIREFOX = "webdriver.gecko.driver";
	private static final String DEFAULT_PATH = "src\\test\\resources\\";
	private static final String EXE_GOOGLE_CHROME = "chromedriver.exe";
	private static final String EXE_FIREFOX = "geckodriver.exe";

	protected static WebDriver driverGoogleChrome;
	protected static WebDriver driverFireFox;

	/**
	 * Método para definir o driver do Google Chrome.
	 * 
	 */
	protected static void setDriverGoogleChrome(String url) {
		System.setProperty(WEB_DRIVER_GOOGLE_CHROME, DEFAULT_PATH + EXE_GOOGLE_CHROME);
		driverGoogleChrome = new ChromeDriver();
		driverGoogleChrome.get(url);
	}

	/**
	 * Método para definir o driver do FireFox.
	 * 
	 */
	protected static void setDriverFireFox(String url) {
		System.setProperty(WEB_DRIVER_FIREFOX, DEFAULT_PATH + EXE_FIREFOX);
		driverFireFox = new FirefoxDriver();
		driverFireFox.get(url);
	}

}
