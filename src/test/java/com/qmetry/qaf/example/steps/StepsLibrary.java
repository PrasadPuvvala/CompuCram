package com.qmetry.qaf.example.steps;

import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import java.util.List;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;

import com.qmetry.qaf.automation.ui.WebDriverTestBase;

import static com.qmetry.qaf.automation.step.CommonStep.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebDriverBuilder;

import com.qmetry.qaf.automation.step.QAFTestStep;

public class StepsLibrary extends RemoteWebDriver{
	/** 
	 * @param searchTerm
	 *            : search term to be searched
	 * @throws InterruptedException 
	 */

	@QAFTestStep(description = "search for {0}")
	public static void searchFor(String searchTerm) throws InterruptedException 
	{
		
		QAFExtendedWebDriver driver =new WebDriverTestBase().getDriver();
		driver.get("https://a13-tpc.compucram.com/#/login");
		Thread.sleep(4000);
		driver.findElement(By.name("login")).sendKeys("IkonicTest@gmail.com");
		Thread.sleep(4000);
		sendKeys("Password1","pass");
	//	driver.findElement(By.name("pass")).sendKeys("Password1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*/button")).click();
		Thread.sleep(4000);


	//	sendKeys(searchTerm+Keys.ENTER, "input.search");
		
	//	WebElement text= new RemoteWebDriver().findElementById("");
		
     //	 WebElement text= driverObj.findElementById("id");
		
	//	RemoteWebDriverBuilder text= QAFExtendedWebDriver.builder().url(getCurrentUrl());
		
	//	Thread.sleep(2000);

//	    WebElement text = findElementByName("login");
//	    text.click();
//	    
		
		
//		Thread.sleep(2000);
//	      sendKeys("IkonicTest@gmail.com","login");
//	      sendKeys("Password1","pass");
//	      
//			Thread.sleep(2000);
//
//	      click("//*/button");
	
	
	
//		List<WebElement> childs1 =  findElementsByXPath("");
	}
	
//	@QAFTestStep(description = "doing exam {0}")
//	public static void doingExam(String searchTerm) throws InterruptedException {
//		Thread.sleep(2000);
//	      sendKeys("IkonicTest@gmail.com","login");
//	      sendKeys("Password1","pass");
//			Thread.sleep(2000);
//
//	      click("//*/button");
//	      
//	      tearDownDriver();
//	
//	}
//	
//	@QAFTestStep(description = "take Assessment {0}")
//	public static void takeAssessment(String searchTerm) throws InterruptedException
//	{
//		Thread.sleep(2000);
//	      sendKeys("IkonicTest@gmail.com","login");
//	      sendKeys("Password1","pass");
//			Thread.sleep(2000);
//
//	      click("//*/button");
//	      tearDownDriver();
//
//		//sendKeys(searchTerm+Keys.ENTER, "input.search");
//		//String text= getText("");
//		
//	}
	
}
