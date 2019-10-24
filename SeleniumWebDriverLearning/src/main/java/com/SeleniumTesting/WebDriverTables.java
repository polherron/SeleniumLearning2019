package com.SeleniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Paul/git/repository/SeleniumWebDriverLearning/src/main/webapp/TableTest.html");
		
		WebElement outerTable = driver.findElement(By.tagName("table"));
		WebElement innerTable = outerTable.findElement(By.tagName("table"));
		WebElement row = innerTable.findElements(By.tagName("td")).get(1);
		System.out.println(row.getText());
	
		
		WebElement row1 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]"));
		System.out.println(row1.getText());
		
		List<WebElement> rows = driver.findElements(By.cssSelector("table.table_results tr"));
		for (WebElement myRows: rows) {
		    List<WebElement> cells = myRows.findElements(By.cssSelector("td.data"));
		    for (WebElement cell: cells) {
		        System.out.println(cell.getText());
		    }
		}

	}

}
