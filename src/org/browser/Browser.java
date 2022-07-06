package org.browser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.ui.Select;

public class Browser {

	private static WebElement webElements;

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathaiah\\eclipse-workspace\\SeleniumTesting\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("https://www.facebook.com/");
		
// To get the URL
	    String c = driver.getCurrentUrl();
		System.out.println(c);
		
// To get the Title
		String t = driver.getTitle();
		System.out.println(t);
		
// Min & Max The page
		driver.manage().window().minimize();//or maximize()
		
//To Close the window
		driver.close();
		
		//To Close the entire browser
		driver.quit();  
		
// We are using ID locator
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Sunil");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("123456");
		
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();*/
		
// We are using Xpath locator
		
	/*	WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("sunil");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("123456");
		
		WebElement button = driver.findElement(By.xpath("//button[@value='1']"));
		button.click();
		
		WebElement txt = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		String c = txt.getText();
		System.out.println(c);
		
		
		WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]"));
		String t2 = text.getText();
		System.out.println(t2); 
		
		
		String a = pass.getAttribute("value");
		System.out.println(a); */
		
//Navigator
		
	/*	driver.navigate().to("https://www.youtube.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.navigate().refresh();*/
		
		
// Actions
		
	/*	driver.get("http://www.greenstechnologys.com/");
		
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a=new Actions(driver);
		a.moveToElement(course).perform();
		
		WebElement sel = driver.findElement(By.xpath("(//span[text()='Selenium'])[1]"));
		sel.click();*/

		
//Drag & Drop()		
	/*	driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement drag = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		WebElement from = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement to = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
		a.dragAndDrop(from, to).perform();*/

		
		
//doubleClick() & contextClick()
		
	/*	driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		user.sendKeys("sunil");
		
		Actions a=new Actions(driver);
		a.doubleClick(user).perform();
		a.contextClick(user).perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.click();*/
		
		
		
//copy past user name and password
	/*	driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		user.sendKeys("sunil");
		
		Actions a=new Actions(driver);
		a.doubleClick(user).perform();
		a.contextClick(user).perform();
		
		Robot r=new Robot();
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.click();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);*/
		
		
		
//DropDwon		
		
	/*	driver.get("https://www.facebook.com/campaign/landing.php?");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select m=new Select(month);
	//get the all drop down data	
		List<WebElement> op = m.getOptions();
		for(int i=0;i<op.size();i++) {
			WebElement w = op.get(0);
			String t = w.getText();
			System.out.println(t);*/
		
		
	//get the particular index  
	/*	driver.get("https://www.facebook.com/campaign/landing.php?");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select m=new Select(month);	
			
		m.selectByIndex(5); //OR
		m.selectByValue("5");//OR
		m.selectByVisibleText("Dec");*/
		
		
//find the Multiple DropDown index
		
	/*	driver.get("https://www.facebook.com/campaign/landing.php?");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select m=new Select(month);
		boolean mul = m.isMultiple();
		System.out.println(mul); */
		
			
			
// Alerts
		
/*		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
	//simple Alerts
		WebElement sim = driver.findElement(By.name("alert"));
		sim.click();
			
		Alert a = driver.switchTo().alert();
		a.accept();
			
			
	//conform Alert
		
		WebElement con = driver.findElement(By.name("confirmation"));
		con.click();
		
		Alert c= driver.switchTo().alert();
		//c.accept();
		c.dismiss();
			
	// prompt Alert
		
		WebElement pa = driver.findElement(By.name("prompt"));	
		pa.click();
		Alert b = driver.switchTo().alert();
		b.sendKeys("yes");
		b.dismiss();*/
	
//frames
	/*	driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.switchTo().frame("a077aa5e");
		WebElement f= driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		f.click();*/
	
	
 //JavaScriptElement
		
	/*	driver.get("https://www.facebook.com/");
		
		WebElement user = driver.findElement(By.id("email"));
		
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		jk.executeScript("arguments[0].setAttribute('value','sunil')",user);
		
		
		WebElement btn = driver.findElement(By.name("login"));
		jk.executeScript("arguments[0].click()", btn);
		
		
		WebElement down = driver.findElement(By.xpath("//li[text()='English (UK)']"));
		jk.executeScript("arguments[0].scrollIntoView(true)", down);
		
		Thread.sleep(3000);
		
		WebElement up = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		jk.executeScript("arguments[0].scrollIntoView(false)", up); */
		
//get  window Handle & Handles
/*		
		driver.get("https://www.amazon.in/?");
		WebElement wd = driver.findElement(By.id("twotabsearchtextbox"));
		wd.sendKeys("iphone");
		
		WebElement btn = driver.findElement(By.id("nav-search-submit-button"));
		btn.click();
		
		List<WebElement> allip= driver.findElements(By.xpath("//span[text()='Apple iPhone 13 Pro (256GB) - Gold']"));
		WebElement w = allip.get(0);
		w.click();
		
		Set<String> all = driver.getWindowHandles();
		List<String> li=new ArrayList<>();
		li.addAll(all);
		
		driver.switchTo().window(li.get(1));
		
*/		
//web Tables
		
/*		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		List<WebElement> allrows = driver.findElements(By.tagName("th"));
		for(int i=0;i<allrows.size();i++) {
			 WebElement eachrows = allrows.get(i);
			List<WebElement> alldata = driver.findElements(By.tagName("td"));
			for(int j=0;i<alldata.size();j++) {
				WebElement eachdata = alldata.get(j);
				String t = eachdata.getText();
				System.out.println(t);
				
				
				
				
			}
		}
*/		
	
		
		
	}
}
