package com.webtest.wangliyu;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Out extends BaseTest {
	
	@Test(priority=1,description="39清除缓存success")
	public void clear() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id=\"topmenu\"]/div[2]/a[3]");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("清除缓存"));
			
		
	}
	
	@Test(priority=2,description="40退出系统success")
	public void output() throws Exception{
		Thread.sleep(3000);
		webtest.click("link=退出系统");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[7]/div[3]/a[1]");	
		assertTrue(webtest.isTextPresent("WSTShop后台管理系统"));
		
	}
	


}
