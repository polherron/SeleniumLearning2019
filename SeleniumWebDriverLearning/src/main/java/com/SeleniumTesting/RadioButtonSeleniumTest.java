package com.SeleniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonSeleniumTest {

	public static void main(String[] args) {

		try
		{
		WebDriver driver = new ChromeDriver();
		//Add your path variable copied from the browser
		driver.get("file:///C:/Users/Paul/git/repository/SeleniumWebDriverLearning/src/main/webapp/CheckBoxTest.html");
				
		
		//Create a list object of radioButtons, find the buttons with the name color, and add them to the list
		List<WebElement> radioButtons = driver.findElements(By.name("color"));
		
		//select the second button
		radioButtons.get(1).click();
		
		//iterate through the bottons in the list
		for (WebElement radioButton : radioButtons) {
			
			//print the value of the selected button to the console
			if(radioButton.isSelected()) {
				System.out.println("The clicked button is " + radioButton.getAttribute("value"));
			}
			
		}

		
		}
		catch(Exception ex)
		{
			System.out.println("Exception : " + ex);
		}
		
		


	}

}
