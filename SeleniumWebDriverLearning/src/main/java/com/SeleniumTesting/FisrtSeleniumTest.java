package com.SeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FisrtSeleniumTest {

	public static void main(String[] args) {
		callGeckoDriver();
		callChromeDriver();
	}

	/**
	 * Calls a chrome driver and opens 
	 * the browser at google.com
	 */
	private static void callChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "c:/dev/tools/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	/**
	 * Calls a Gecko (firefox) driver and opens 
	 * the browser at pluralsight.com
	 */
	private static void callGeckoDriver() {
		System.setProperty("webdriver.gecko.driver", "c:/dev/tools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.pluralsight.com/");
	}
}

