package com.SeleniumTesting;

import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FisrtSeleniumTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		doSearch(driver, "cars");
		clickImagesLink(driver);
		clickOnImage(driver);
	}

	/**
	 *Finds the first image and clicks
	 */
	private static void clickOnImage(WebDriver driver) {
			
		WebElement image = fluentWaitByClassName(driver, "rg_ic");
		//click on the image
		image.click();
		//close~ browser
		//driver.close() ;

		
	}

	/**
	 * @param driver
	 * @return
	 */
	private static WebElement fluentWaitById(WebDriver driver, String id) {
		//Declaring a fluent wait with the timeout of 
		//30 seconds and the frequency is set to 
		//5 seconds by ignoring "NoSuchElementException
		//Frequency is set to 5 seconds and the maximum time is set 
	 	//30 seconds
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);
		
		
			//Here we are using a java Function Interface.  
			//See: https://www.geeksforgeeks.org/function-interface-in-java-with-examples/
		
			WebElement element = wait.until(new Function<WebDriver, WebElement>(){
		
			public WebElement apply(WebDriver driver ) {
				return driver.findElement(By.id(id));
			}
		});
		return element;
	}
	
	/**
	 * @param driver
	 * @return
	 */
	private static WebElement fluentWaitByClassName(WebDriver driver, String className) {
		//Declaring a fluent wait with the timeout of 
		//30 seconds and the frequency is set to 
		//5 seconds by ignoring "NoSuchElementException
		//Frequency is set to 5 seconds and the maximum time is set 
	 	//30 seconds
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);
		
		
			//Here we are using a java Function Interface.  
			//See: https://www.geeksforgeeks.org/function-interface-in-java-with-examples/
		
			WebElement element = wait.until(new Function<WebDriver, WebElement>(){
		
			public WebElement apply(WebDriver driver ) {
				return driver.findElement(By.className(className));
			}
		});
		return element;
	}
	
	/**
	 *Finds the images link and clicks
	 */
	private static void clickImagesLink(WebDriver driver) {
		
		WebElement imageLink = driver.findElements(By.linkText("Images")).get(0);
		
		imageLink.click();
	}

	/** 
	 * Calls a Chrome driver and opens 
	 * the browser at google.com
	 * then does a search based on the name of
	 * the search text box.
	 *  
	 **/
	private static void doSearch(WebDriver driver, String searchString) {
		//System.setProperty("webdriver.chrome.driver", "c:/dev/tools/chromedriver.exe");


		driver.get("https://www.google.com/");
		
		//Get a web element
		WebElement searchField = driver.findElement(By.name("q"));
		
		//Pass a string to the text box element
		searchField.sendKeys(searchString);
		
		
		//This would have done the same thing
		searchField.submit();
	}

}

