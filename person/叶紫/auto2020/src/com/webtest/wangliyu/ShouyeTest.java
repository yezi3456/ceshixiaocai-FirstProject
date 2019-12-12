package com.webtest.wangliyu;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ShouyeTest extends BaseTest {
	@Test(description="37µã»÷ÍøµãÊ×Ò³")
	public void test() throws InterruptedException{
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id=\"topmenu\"]/div[2]/a[1]");
		Thread.sleep(6000);
		assertTrue(webtest.isTextPresent("WSTShop"));	
		
	}

}
