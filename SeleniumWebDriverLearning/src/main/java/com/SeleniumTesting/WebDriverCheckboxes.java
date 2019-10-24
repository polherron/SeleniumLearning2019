package com.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckboxes {

	public static void main(String[] args) {
		try
		{
			WebDriver driver = new ChromeDriver();
			//Add your path variable copied from the browser
			driver.get("file:///C:/Users/Paul/git/repository/SeleniumWebDriverLearning/src/main/webapp/CheckBoxTest.html");
		
			WebElement checkbox = driver.findElement(By.id("lettuceCheckBox"));
			
			checkbox.click();
		
		}
			
		catch(Exception ex)
		{
			System.out.println("Exception : " + ex);
		}

	}

}
