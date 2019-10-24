package com.SeleniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckboxesAlt {
	
	public static void main(String[] args) {
		try
		{
			WebDriver driver = new ChromeDriver();
			//Add your path variable copied from the browser
			driver.get("file:///C:/Users/Paul/git/repository/SeleniumWebDriverLearning/src/main/webapp/CheckBoxTest.html");
		
			WebElement form = driver.findElement(By.tagName("form"));
			List<WebElement> inputs = form.findElements(By.tagName("input"));
			WebElement myCheckBox = inputs.get(0);
			myCheckBox.click();
			
			//iterate through the checkBoxes in the list
			for (WebElement checkBox : inputs) {
				
				//print the value of the selected button to the console
				if(checkBox.isSelected()) {
					System.out.println("The clicked checkBox is " + checkBox.getAttribute("value"));
				}
				
			}
		
		}
			
		catch(Exception ex)
		{
			System.out.println("Exception : " + ex);
		}

	}
}




