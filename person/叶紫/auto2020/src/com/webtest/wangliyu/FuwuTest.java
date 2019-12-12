package com.webtest.wangliyu;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
public class FuwuTest extends BaseTest {
	@Test(description="38点击服务支持")
	public void test() throws InterruptedException{
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id=\"topmenu\"]/div[2]/a[2]");
		Thread.sleep(6000);
		assertTrue(webtest.isTextPresent("首页"));	
		
	}

}
