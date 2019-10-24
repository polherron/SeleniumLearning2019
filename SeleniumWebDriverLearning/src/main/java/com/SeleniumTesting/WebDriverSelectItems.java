package com.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverSelectItems {

	
	//This code allows us to select a named element from a drop down list.
	//The select class gives us some helper classes to do this.
	//This is in the import org.openqa.selenium.support.ui.Select package
	//Select select = new Select(selectElement);
	//select.selectByVisibleText("Maybe");
	public static void main(String[] args) {
		
		//System.setProperty("Webdriver.gecko.driver", "C:/dev/tools/geckodriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Paul/git/repository/SeleniumWebDriverLearning/src/main/webapp/"
				+ "SelectItemTest.html");
		
		WebElement selectElement = driver.findElement(By.id("select1"));
		Select select = new Select(selectElement);
		select.selectByVisibleText("Maybe");
		
		System.out.println("The clicked checkBox is " + select.getFirstSelectedOption().getText());
	}

}
