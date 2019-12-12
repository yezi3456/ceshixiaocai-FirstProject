package com.webtest.renzixuan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.dataprovider.NSDataProvider;

public class Chaxun extends BaseTest1{
String url="http://localhost/wstshop/admin/index/login.html";
	
	@Test(priority=1,description="13.订单管理的已收货订单列表里根据订单编号100000003查询订单详情")
	public void chakan() throws Exception {
		//登录后台
		webtest.open(url);
		webtest.type("id=loginPwd","5201314zj");
		webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[4]/td[2]/div/input");
		
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[3]");
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[6]");
		webtest.enterFrame("wst-lframe-35");
		webtest.type("id=orderNo","100000003");
		webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
		webtest.click("xpath=//*[@id=\"deliverType\"]/option[3]");
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("查询"));
	}
	

	@Test(priority=2,description="14.订单管理的已收货订单列表里根据订单编号查询（查不到的情况）（货到付款选成自提或者输入一个根本不存在的订单号）")
	public void chakan1() throws Exception {
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
		webtest.click("xpath=//*[@id=\"deliverType\"]/option[2]");
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("查询"));
	}
	

		@Test(priority=3,description="15.订单管理的待发货订单列表里根据订单编号100000202查询订单详情")
		public void chakan2() throws Exception {
			webtest.leaveFrame();
			//点击待发货订单
			webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[1]");
			webtest.enterFrame("wst-lframe-35");
			webtest.type("id=orderNo","100000202");
			Thread.sleep(2000);	
			webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
			webtest.click("xpath=//*[@id=\"deliverType\"]/option[1]");
			webtest.click("xpath=/html/body/div[1]/button");
			assertTrue(webtest.isTextPresent("查询"));
		}
		
		@Test(priority=4,description="16.订单管理的待发货订单列表里根据订单编号查询（查不到的情况）（货到付款选成自提或者输入一个根本不存在的订单号）")
		public void chakan3() throws Exception {
			Thread.sleep(2000);	
			webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
			webtest.click("xpath=//*[@id=\"deliverType\"]/option[2]");
			webtest.click("xpath=/html/body/div[1]/button");
			assertTrue(webtest.isTextPresent("查询"));
		}
	
		@Test(priority=5,description="16.订单管理的已发货订单列表里根据订单编号100000036查询订单详情")
		public void chakan4() throws Exception {
			webtest.leaveFrame();
	        //点击已发货订单
			webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[3]");
			Thread.sleep(2000);	
			webtest.enterFrame("wst-lframe-35");
			Thread.sleep(2000);	
			webtest.type("id=orderNo","100000036");
			Thread.sleep(2000);	
			webtest.click("xpath=//*[@id=\"orderStatus\"]/option[2]");
			webtest.click("xpath=//*[@id=\"payType\"]/option[3]");
			webtest.click("xpath=/html/body/div[1]/button");
			assertTrue(webtest.isTextPresent("查询"));
		}
		
		
		@Test(priority=6,description="17.订单管理的已发货订单列表里根据订单编号查询（查不到的情况）（货到付款选成自提或者输入一个根本不存在的订单号）")
		public void chakan5() throws Exception {
			//登录后台
			Thread.sleep(2000);	
			webtest.click("xpath=//*[@id=\"orderStatus\"]/option[2]");
			webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
			webtest.click("xpath=/html/body/div[1]/button");
			assertTrue(webtest.isTextPresent("查询"));
		}
		
	
		@Test(priority=7,description="18.订单管理的取消/拒收订单列表里根据订单编号100000003查询订单详情")
		public void chakan6() throws Exception {
			webtest.leaveFrame();
			//点击取消/拒收订单
			webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[4]");
			webtest.enterFrame("wst-lframe-35");
			webtest.type("id=orderNo","100000014");
			Thread.sleep(2000);	
			webtest.click("xpath=//*[@id=\"orderStatus\"]/option[2]");
			webtest.click("xpath=//*[@id=\"payType\"]/option[3]");
			webtest.click("xpath=/html/body/div[1]/button");
			assertTrue(webtest.isTextPresent("查询"));
		}
		
	
		@Test(priority=8,description="19.订单管理的取消/拒收订单列表里根据订单编号查询（查不到的情况）（货到付款选成自提或者输入一个根本不存在的订单号）")
		public void chakan7() throws Exception {
			//登录后台
			Thread.sleep(2000);	
			webtest.click("xpath=//*[@id=\"orderStatus\"]/option[2]");
			webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
			webtest.click("xpath=/html/body/div[1]/button");
			assertTrue(webtest.isTextPresent("查询"));
		}
}
