package com.webtest.lizhe;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ExpressManagement extends BaseTest{
	@Test(description="添加快递")
	public void test1() throws Exception {
		webtest.click("link=快递管理");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[1]/button");
		webtest.type("id=expressName", "新增快递1");
		webtest.click("link=确定");
		assertTrue(webtest.isTextPresent("新增快递1"));
		webtest.leaveFrame();
	}
	@Test(description="修改新增快递1(第一行)为新增快递2")
	public void test2() throws Exception {
		webtest.click("link=快递管理");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c103\"]/div/a[1]");
		webtest.typeAndClear("id=expressName", "新增快递2");
		webtest.click("link=确定");
		assertTrue(webtest.isTextPresent("新增快递2"));
		webtest.leaveFrame();
	}
	@Test(description="删除(第一行)新增快递2")
	public void test3() throws Exception {
		webtest.click("link=快递管理");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c103\"]/div/a[2]");
		webtest.click("link=确定");
		assertFalse(webtest.isTextPresent("新增快递2"));
		webtest.leaveFrame();
	}
}
