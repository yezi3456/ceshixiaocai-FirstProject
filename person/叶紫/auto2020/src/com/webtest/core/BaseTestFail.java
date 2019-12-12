package com.webtest.core;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import com.webtest.utils.Log;
import com.webtest.utils.ReadProperties;

/**
 * author:lihuanzhen
 * ³õÊ¼»¯ä¯ÀÀÆ÷
 */


public class BaseTestFail {

	public  WebDriverEngine webtest;
	private WebDriver driver;
	public String driverType;

	
	

	private WebDriver newWebDriver(String driverType) throws IOException {
		WebDriver driver = null;
	 if (driverType.equalsIgnoreCase("firefox")) {
		    String firefox_driver =ReadProperties.getPropertyValue("gecko_driver");
			String firefox_path = ReadProperties.getPropertyValue("firefox_path");
			System.setProperty("webdriver.gecko.driver", firefox_driver);
			System.setProperty("webdriver.firefox.bin", firefox_path);
			driver = new FirefoxDriver();
	
			Log.info("Using Firefox");
		}  else if (driverType.equalsIgnoreCase("chrome")) {
			String chrome_path = ReadProperties.getPropertyValue("chrome_path");
			System.setProperty("webdriver.chrome.driver",chrome_path);
			driver = new ChromeDriver();
			Log.info("Using Chrome");
			
		}else{
			return null;
		}

		
		return driver;

	
	}


	/**
	 * 
	 *³õÊ¼»¯ä¯ÀÀÆ÷
	 * 
	 */


	@BeforeMethod
	public void doBeforeMethod() throws Exception {

		driverType=ReadProperties.getPropertyValue("driverType");
		driver = this.newWebDriver(driverType);
		driver.manage().window().maximize();
		Log.info(driverType);
		webtest = new WebDriverEngine(driver);
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginPwd","yz290315");
		webtest.click("xpath=//input[@value='µÇÂ¼']");
		Thread.sleep(2000);
	
	
	}
	
	
	@AfterMethod
	public void doAfterMethod() throws Exception {
		Thread.sleep(2000);
		driver.quit();
		Thread.sleep(2000);
	
	
	}



//	@AfterSuite
//	public void doAfterMethod() {
//		if(this.driver != null){
//			this.driver.quit();
//			}
//		Log.info("Quitted Browser");
//	}
//	

	

	
	public WebDriver getDriver() {
        return driver;
    }


	

}
