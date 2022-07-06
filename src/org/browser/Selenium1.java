package org.browser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium1 {

	private static String pageSource;

	public static void main(String[] args) throws AWTException,InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathaiah\\eclipse-workspace\\SeleniumTesting\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		
		driver.get("https://www.facebook.com/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("this is the URl"+currentUrl);
		
		String title = driver.getTitle();
		System.out.println("this is the title of the page"+title);
		
		driver.getPageSource();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		driver.quit();
		
		
		WebElement drag = driver.findElement(By.xpath(""));
		WebElement drop = driver.findElement(By.xpath(""));
		
		
		Actions a=new Actions(driver);
		
		a.dragAndDrop(drag , drop);
		
		
		
		
 }	
}
