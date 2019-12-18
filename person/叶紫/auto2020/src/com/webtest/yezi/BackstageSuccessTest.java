package com.webtest.yezi;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class BackstageSuccessTest extends BaseTest1{
	
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(3000);
	}
	
	@Test(description="044查询商品成功")
	public void test44() throws Exception{
		webtest.click("xpath=//a[text()='商品管理']");
		webtest.click("link=评价管理");
		webtest.enterFrame("wst-lframe-22");//进入iframe页面
		webtest.type("id=goodsName", "砂糖桔");
		webtest.click("xpath=//input[@value='查询']");
		assertTrue(webtest.isTextPresent("100000132"));
		assertTrue(webtest.isTextPresent("砂糖桔"));
		assertTrue(webtest.isTextPresent("very good"));
		Thread.sleep(3000);
		webtest.leaveFrame();
		Thread.sleep(3000);
	}
	
	
	
	@Test(description="045修改商品评价的状态")
	public void test45() throws Exception{
		webtest.click("xpath=//a[text()='商品管理']");
		webtest.click("link=评价管理");
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id='maingrid|2|r1001|c110']/div/a[1]");
		webtest.click("xpath=//input[@value='0']");
		webtest.click("xpath=//input[@value='提交']");
		assertTrue(webtest.isTextPresent("100000250"));
		assertTrue(webtest.isTextPresent("very good"));
		assertTrue(webtest.isTextPresent("隐藏"));
		Thread.sleep(3000);
		webtest.leaveFrame();
		Thread.sleep(3000);
	}
	
	@Test(description="046修改商品评价的评语")
	public void test46() throws Exception{
		webtest.click("xpath=//a[text()='商品管理']");
		webtest.click("link=评价管理");
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id='maingrid|2|r1002|c110']/div/a[1]");
		webtest.type("id=content", "给家人买的十分好吃，会回购的！！");
		webtest.click("xpath=//input[@value='提交']");
		assertTrue(webtest.isTextPresent("给家人买的"));
		Thread.sleep(3000);
		webtest.leaveFrame();
		Thread.sleep(3000);
	}
	
	
	//bug又又又又出现啦，无法删除，应运行成功但失败
	@Test(description="047删除某个商品评价")
	public void test47() throws Exception{
		webtest.click("xpath=//a[text()='商品管理']");
		webtest.click("link=评价管理");
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id='maingrid|2|r1053|c110']/div/a[2]");
		webtest.click("xpath=//*[@id='layui-layer1']/div[3]/a[1]");
		assertFalse(webtest.isTextPresent("送爸妈必备"));
		Thread.sleep(3000);
		webtest.leaveFrame();
		Thread.sleep(3000);
	}
	

}
