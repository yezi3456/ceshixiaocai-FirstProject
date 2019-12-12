package com.webtest.lizhe;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class PayManagement  extends BaseTest{
	@Test(description="安装微信")
	public void test1() throws Exception {
		webtest.click("link=支付管理");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c106\"]/div/a");
		webtest.typeAndClear("id=payName", "微信支付");
		webtest.typeAndClear("id=appId", "111");
		webtest.typeAndClear("id=mchId", "222");
		webtest.typeAndClear("id=apiKey", "333");
		webtest.typeAndClear("id=appsecret", "333");
		webtest.typeAndClear("id=payDesc", "这是微信支付");
		webtest.typeAndClear("id=payOrder", "1");
		webtest.click("xpath=//input[@value='提交']");
		assertTrue(webtest.isTextPresent("这是微信支付"));
		webtest.leaveFrame();
	}
	
//	@Test(description="支付管理卸载货到付款",priority=2)
//	public void deleteHDFK() throws Exception {
//		webtest.click("link=支付管理");
//		webtest.enterFrame("wst-lframe-1");
//		webtest.click("xpath=//*[@id=\"maingrid|2|r1003|c106\"]/div/a[2]");
//		webtest.click("link=确定");
//		assertTrue(webtest.isTextPresent("货到付款"));
//		assertTrue(webtest.isTextPresent("安装"));
//		webtest.leaveFrame();
//	}
	@Test(description="修改微信支付描述")
	public void test2() throws Exception {
		webtest.click("link=支付管理");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c106\"]/div/a[1]");
		webtest.typeAndClear("id=payDesc", "微信支付");
		webtest.click("xpath=//input[@value='提交']");
		assertTrue(webtest.isTextPresent("微信支付"));
		webtest.leaveFrame();
	}
	
	
	@Test(description="卸载微信支付")
	public void test3() throws Exception {
		webtest.click("link=支付管理");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id='maingrid|2|r1001|c106']/div/a[2]");
		webtest.click("link=确定");
		assertTrue(webtest.isTextPresent("微信支付"));
		assertTrue(webtest.isTextPresent("安装"));
		webtest.leaveFrame();
	}
	
}