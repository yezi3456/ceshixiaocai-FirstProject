package com.webtest.renzixuan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class Chakan extends BaseTest1{
	String url="http://localhost/wstshop/admin/index/login.html";
	
	
	@Test(priority=2,description="7.能否点击待发货订单")
	public void a() throws Exception{
		//登录后台
		webtest.open(url);
		webtest.type("id=loginPwd","5201314zj");
		webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[4]/td[2]/div/input");
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[3]");
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[1]");
		webtest.enterFrame("wst-lframe-35");
		assertTrue(webtest.isTextPresent("查询"));
    }
	
	@Test(priority=3,description="8.能否点击待付款订单")
	public void b() throws Exception{
		webtest.leaveFrame();
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[2]");
		webtest.enterFrame("wst-lframe-35");
		assertTrue(webtest.isTextPresent("查询"));
    }
	
	
	@Test(priority=4,description="9.能否点击退款订单")
	public void c() throws Exception{
		webtest.leaveFrame();
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[5]");
		webtest.enterFrame("wst-lframe-35");
		assertTrue(webtest.isTextPresent("查询"));
	}
		
	@Test(priority=5,description="10.能否点击已发货订单")
	public void d() throws Exception{
		webtest.leaveFrame();
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[3]");
		webtest.enterFrame("wst-lframe-35");
		assertTrue(webtest.isTextPresent("查询"));
	}
	
	@Test(priority=6,description="11.能否点击取消/拒收订单")
	public void k() throws Exception{
		webtest.leaveFrame();
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[4]");
		webtest.enterFrame("wst-lframe-35");
		assertTrue(webtest.isTextPresent("查询"));
	}
	
	@Test(priority=7,description="12.能否点击已收货订单")
	public void l() throws Exception{
		webtest.leaveFrame();
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[6]");
		webtest.enterFrame("wst-lframe-35");
		assertTrue(webtest.isTextPresent("查询"));
	}
}
