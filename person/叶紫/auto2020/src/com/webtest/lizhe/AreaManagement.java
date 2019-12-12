package com.webtest.lizhe;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AreaManagement extends BaseTest{
	@Test(description="修改1澳门特别行政区 是否显示")
	public void test1() throws Exception {
		webtest.click("link=地区管理");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c103\"]/div/span");
		assertTrue(webtest.isTextPresent("澳门特别行政区"));
		assertTrue(webtest.isTextPresent("显示"));		
		webtest.leaveFrame();
	}
	@Test(description="新增一级地区")
	public void test2() throws Exception {
		webtest.click("link=地区管理");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[1]/button");	
		webtest.type("id=areaName", "newArea1");
		webtest.type("id=areaKey", "n");
		webtest.click("link=确定");
		assertTrue(webtest.isTextPresent("newArea1"));
		webtest.leaveFrame();
	}
	@Test(description="新增二级地区")
	public void test3() throws Exception {
		webtest.click("link=地区管理");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1002|c106\"]/div/a[1]");	
		webtest.click("xpath=/html/body/div[1]/button[2]");	
		webtest.type("id=areaName", "newArea11");
		webtest.type("id=areaKey", "1");		
		webtest.click("link=确定");
		assertTrue(webtest.isTextPresent("newArea11"));
		webtest.leaveFrame();
	}
	@Test(description="删除一级地区")
	public void test4() throws Exception {
		webtest.click("link=地区管理");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c106\"]/div/a[3]");			
		webtest.click("link=确定");
		webtest.leaveFrame();
	}
	@Test(description="修改三级地区排序号为1，排序字母为w")
	public void test5() throws Exception {
		webtest.click("link=地区管理");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1032|c106\"]/div/a[1]");	
		webtest.click("xpath=//*[@id=\"maingrid|2|r1007|c106\"]/div/a[1]");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1005|c106\"]/div/a[2]");
		webtest.type("id=areaKey", "w");
		webtest.typeAndClear("id=areaSort", "1");
		webtest.click("link=确定");
		assertTrue(webtest.isTextPresent("w"));
		webtest.leaveFrame();
	}
	@Test(description="验证返回按钮")
	public void test6() throws Exception {
		webtest.click("link=地区管理");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c106\"]/div/a[1]");	
		webtest.click("xpath=/html/body/div[1]/button[1]");
		assertTrue(webtest.isTextPresent("澳门特别行政区"));
		webtest.leaveFrame();
	}
	
}
