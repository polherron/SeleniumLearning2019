package com.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FisrtSeleniumTest {

	public static void main(String[] args) {
		doSearch(("cars"));
	}

	/**
	 * Calls a chrome driver and opens 
	 * the browser at google.com
	 * then does a search based on the name of
	 * the search text box.
	 *  
	 */
	private static void doSearch(String searchString) {
		//System.setProperty("webdriver.chrome.driver", "c:/dev/tools/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		//Get a web element
		WebElement searchField = driver.findElement(By.name("q"));
		
		//Pass a string to the text box element
		searchField.sendKeys(searchString);
		
		//Find the search button
		WebElement searchButton = driver.findElement(By.name("btnK"));
		
		//Click the button
		searchButton.click();
		
		//This would have done the same thing
		//searchButton.submit();
	}

}

