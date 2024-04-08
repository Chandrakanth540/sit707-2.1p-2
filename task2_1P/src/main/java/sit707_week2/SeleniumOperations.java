package sit707_week2;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) throws IOException {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\Google\\\\Chrome\\\\Application\\\\chrome.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " );
		
	
		sleep(5);
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement element1 = driver.findElement(By.id("FirstName"));
		System.out.println("Found element: " + element1);
		// Send first name
		element1.sendKeys("chandrakanth");
		WebElement element2=driver.findElement(By.id("LastName"));
		element2.sendKeys("kunapareddy");
		WebElement element3=driver.findElement(By.id("DateOfBirth"));
		element3.sendKeys("08/09/2000");
		WebElement element4=driver.findElement(By.id("MobileNumber"));
		element4.sendKeys("0123456789");
		WebElement element5=driver.findElement(By.id("AddressResidential"));
		element5.sendKeys("74 alfred road,werribbe");
		WebElement element6=driver.findElement(By.id("QasPicklistMonikar"));
		element6.sendKeys("74 alfred road,werribbe");
		WebElement element7=driver.findElement(By.id("Email"));
		element7.sendKeys("chandra98au@gmail.com");
		WebElement element8=driver.findElement(By.id("EmailConfirm"));
		element8.sendKeys("chandra98au@gmail.com");
		WebElement btn=driver.findElement(By.className("cta no-arrow fn_validate_submit"));
		btn.click();
		// Write code
		
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
		
		/*
		 * Take screenshot using selenium API.
		 */
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./image.png"));
		
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	
}
