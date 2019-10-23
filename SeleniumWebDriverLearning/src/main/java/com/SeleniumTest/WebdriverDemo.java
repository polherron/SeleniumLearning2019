package com.SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.FirefoxDriver.driver", "c:/dev/tools/firefoxdriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.pluralsight.com/");

	}
}
