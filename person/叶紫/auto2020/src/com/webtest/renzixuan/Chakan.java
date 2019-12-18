package com.webtest.renzixuan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class Chakan extends BaseTest1{
	
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(3000);
	}
	
	
	@Test(description="7.能否点击待发货订单")
	public void test1() throws Exception{
		
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[3]");
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[1]");
		webtest.enterFrame("wst-lframe-35");
		assertTrue(webtest.isTextPresent("查询"));
    }
	
	@Test(description="8.能否点击待付款订单")
	public void test2() throws Exception{
		webtest.leaveFrame();
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[2]");
		webtest.enterFrame("wst-lframe-35");
		assertTrue(webtest.isTextPresent("查询"));
    }
	
	
	@Test(description="9.能否点击退款订单")
	public void test3() throws Exception{
		webtest.leaveFrame();
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[5]");
		webtest.enterFrame("wst-lframe-35");
		assertTrue(webtest.isTextPresent("查询"));
	}
		
	@Test(description="10.能否点击已发货订单")
	public void test4() throws Exception{
		webtest.leaveFrame();
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[3]");
		webtest.enterFrame("wst-lframe-35");
		assertTrue(webtest.isTextPresent("查询"));
	}
	
	@Test(description="11.能否点击取消/拒收订单")
	public void test5() throws Exception{
		webtest.leaveFrame();
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[4]");
		webtest.enterFrame("wst-lframe-35");
		assertTrue(webtest.isTextPresent("查询"));
	}
	
	@Test(description="12.能否点击已收货订单")
	public void test6() throws Exception{
		webtest.leaveFrame();
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[6]");
		webtest.enterFrame("wst-lframe-35");
		assertTrue(webtest.isTextPresent("查询"));
	}
}
