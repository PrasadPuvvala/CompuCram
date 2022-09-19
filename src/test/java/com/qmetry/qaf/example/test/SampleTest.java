package com.qmetry.qaf.example.test;

import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.verifyLinkWithPartialTextPresent;
//import static com.qmetry.qaf.example.steps.StepsLibrary.searchFor;
import static com.qmetry.qaf.example.steps.StepsLibrary.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import com.qmetry.qaf.automation.util.StringMatcher;
import com.qmetry.qaf.example.steps.StepsLibrary;

//public class SampleTest extends QAFExtendedWebDriver {
//
//	@Test
//	public void testGoogleSearch() throws InterruptedException {
//		
//		QAFExtendedWebDriver driver =new WebDriverTestBase().getDriver();
//		
//		driver.get("https://a13-tpc.compucram.com/#/login");
//		Thread.sleep(4000);
//		driver.findElement(By.name("login")).sendKeys("IkonicTest@gmail.com");
//		Thread.sleep(4000);
//
//		driver.close();
//		
//		/*
//		 * get("/"); new StepsLibrary().searchFor("qaf github infostretch");
//		 * verifyLinkWithPartialTextPresent("Dashboard");
//		 */
//		
//	}

public class SampleTest extends RemoteWebDriver {

	@Test
	public void testGoogleSearch() throws InterruptedException
	{
		
		QAFExtendedWebDriver driver =new WebDriverTestBase().getDriver();
		
		driver.get("https://a13-tpc.compucram.com/#/login");
		Thread.sleep(4000);
		driver.findElement(By.name("login")).sendKeys("IkonicTest@gmail.com");
		Thread.sleep(4000);
		Thread.sleep(4000);
		driver.findElement(By.name("pass")).sendKeys("Password1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*/button")).click();
		Thread.sleep(4000);

		driver.close();
		
		/*
		 * get("/"); new StepsLibrary().searchFor("qaf github infostretch");
		 * verifyLinkWithPartialTextPresent("Dashboard");
		 */
		
	}
}

//public class SampleTest extends RemoteWebDriver
//{
//	
//	@Test
//	public void testGoogleSearch()
//	{
////			QAFExtendedWebDriver driver =new WebDriverTestBase().getDriver();
//			
////	    WebElement text = findElementByName("login");
////	    text.click();
////	    text.sendKeys("test");
//
//
//	}
//
//				
//				
//	
//}
