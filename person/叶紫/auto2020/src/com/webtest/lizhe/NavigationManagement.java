package com.webtest.lizhe;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class NavigationManagement extends BaseTest{
	@Test(description="导航管理中修改第一个导航名称为数码")
	public void test1() throws Exception {
		webtest.click("link=导航管理");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);	
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c108\"]/div/a[1]");
		webtest.typeAndClear("id=navTitle", "数码");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@value='提交']");
		assertTrue(webtest.isTextPresent("数码"));
		webtest.leaveFrame();
	}
	@Test(description="导航管理中新增导航1")
	public void test2() throws Exception {
		webtest.click("link=导航管理");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[1]/button");
		webtest.click("link=确定");
		webtest.type("id=navTitle", "新增导航1");
		webtest.type("id=navUrl","http://www.wstmart.net");
		webtest.click("xpath=//input[@value='提交']");
		assertTrue(webtest.isTextPresent("新增导航1"));
		webtest.leaveFrame();
	}
	@Test(description="导航管理中删除一条导航 新增导航1")
	public void test3() throws Exception {
		webtest.click("link=导航管理");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);	
//		webtest.click("xpath=//*[@id=\"maingrid|2|r1002|c108\"]/div/a[1]");
		webtest.click("xpath=//*[@id='maingrid|2|r1001|c108']/div/a[2]");
		webtest.click("link=确定");
		assertFalse(webtest.isTextPresent("新增导航1"));
		webtest.leaveFrame();
	}
	@Test(description="刷新")
	public void test4() throws Exception {
		webtest.click("link=导航管理");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);	
//		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[7]/div/a[1]");
		webtest.click("xpath=//*[@id=\"maingrid\"]/div[5]/div/div[10]/div/span");
		assertTrue(webtest.isTextPresent("关于我们"));
		webtest.leaveFrame();
	}
	@Test(description="直接点击 导航1 改变显示或隐藏状态")
	public void test5() throws Exception {
		webtest.click("link=导航管理");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);	
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c105\"]/div/span");
		assertTrue(webtest.isTextPresent("显示"));
		assertTrue(webtest.isTextPresent("隐藏"));
		webtest.leaveFrame();
	}
}
