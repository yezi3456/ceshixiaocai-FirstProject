package com.webtest.lizhe;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class BankManagement extends BaseTest{
	@Test(description="银行管理 新增 新增银行1")
	public void test1() throws Exception {
		webtest.click("link=银行管理");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);	
		webtest.click("xpath=/html/body/div[1]/button");
		webtest.type("id=bankName", "新增银行1");
		webtest.click("link=确定");
		assertTrue(webtest.isTextPresent("新增银行1"));
		webtest.leaveFrame();
	}
	@Test(description="银行管理修改  将新增银行1修改成新增银行2")
	public void test2() throws Exception {
		webtest.click("link=银行管理");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);	
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c103\"]/div/a[1]");
		webtest.typeAndClear("id=bankName", "新增银行2");
		webtest.click("link=确定");
		assertTrue(webtest.isTextPresent("新增银行2"));
		webtest.leaveFrame();
	}
	@Test(description="删除 新增银行2")
	public void test3() throws Exception {
		webtest.click("link=银行管理");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);	
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c103\"]/div/a[2]");
		webtest.click("link=确定");
		assertFalse(webtest.isTextPresent("新增银行2"));
		webtest.leaveFrame();
	}
}