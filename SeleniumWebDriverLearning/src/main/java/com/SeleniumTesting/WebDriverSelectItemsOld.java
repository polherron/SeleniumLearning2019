package com.SeleniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSelectItemsOld {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Paul/git/repository/SeleniumWebDriverLearning/src/main/webapp/"
				+ "SelectItemTest.html");
		
		WebElement selectOptions = driver.findElement(By.id("select1"));
		
		List<WebElement> options = selectOptions.findElements(By.tagName("option"));

		for (WebElement option : options) {

			if((option.getText().trim()).equals("Maybe"))
			{
				option.click();  
				System.out.println(option.getText());
			}
		}
		
	}

}
