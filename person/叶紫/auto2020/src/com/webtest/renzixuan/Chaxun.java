package com.webtest.renzixuan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class Chaxun extends BaseTest1{
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(3000);
	}
	
	@Test(description="13.订单管理的已收货订单列表里根据订单编号100000003查询订单详情")
	public void test1() throws Exception {
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[3]");
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[6]");
		webtest.enterFrame("wst-lframe-35");
		webtest.type("id=orderNo","100000003");
		webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
		webtest.click("xpath=//*[@id=\"deliverType\"]/option[3]");
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("查询"));
	}
	

	@Test(description="14.订单管理的已收货订单列表里根据订单编号查询（查不到的情况）（货到付款选成自提或者输入一个根本不存在的订单号）")
	public void test2() throws Exception {
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
		webtest.click("xpath=//*[@id=\"deliverType\"]/option[2]");
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("查询"));
	}
	

		@Test(description="15.订单管理的待发货订单列表里根据订单编号100000202查询订单详情")
		public void test3() throws Exception {
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
		
		@Test(description="16.订单管理的待发货订单列表里根据订单编号查询（查不到的情况）（货到付款选成自提或者输入一个根本不存在的订单号）")
		public void test4() throws Exception {
			Thread.sleep(2000);	
			webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
			webtest.click("xpath=//*[@id=\"deliverType\"]/option[2]");
			webtest.click("xpath=/html/body/div[1]/button");
			assertTrue(webtest.isTextPresent("查询"));
		}
	
		@Test(description="16.订单管理的已发货订单列表里根据订单编号100000036查询订单详情")
		public void test5() throws Exception {
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
		
		
		@Test(description="17.订单管理的已发货订单列表里根据订单编号查询（查不到的情况）（货到付款选成自提或者输入一个根本不存在的订单号）")
		public void test6() throws Exception {
			//登录后台
			Thread.sleep(2000);	
			webtest.click("xpath=//*[@id=\"orderStatus\"]/option[2]");
			webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
			webtest.click("xpath=/html/body/div[1]/button");
			assertTrue(webtest.isTextPresent("查询"));
		}
		
	
		@Test(description="18.订单管理的取消/拒收订单列表里根据订单编号100000003查询订单详情")
		public void test7() throws Exception {
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
		
	
		@Test(description="19.订单管理的取消/拒收订单列表里根据订单编号查询（查不到的情况）（货到付款选成自提或者输入一个根本不存在的订单号）")
		public void test8() throws Exception {
			//登录后台
			Thread.sleep(2000);	
			webtest.click("xpath=//*[@id=\"orderStatus\"]/option[2]");
			webtest.click("xpath=//*[@id=\"payType\"]/option[2]");
			webtest.click("xpath=/html/body/div[1]/button");
			assertTrue(webtest.isTextPresent("查询"));
		}
}
