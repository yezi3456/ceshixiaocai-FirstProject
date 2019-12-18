package com.webtest.wangliyu;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;


@Listeners(com.webtest.core.WebTestListener.class)
public class ShouyeTest extends BaseTest {
	@Test(description="37µã»÷ÍøµãÊ×Ò³")
	public void test1() throws InterruptedException{
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id=\"topmenu\"]/div[2]/a[1]");
		Thread.sleep(6000);
		assertTrue(webtest.isTextPresent("WSTShop"));	
		
	}

}
