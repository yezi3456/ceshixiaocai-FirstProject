package com.webtest.yezi;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

public class BackstageFalseTest extends BaseTest1{
	
	@BeforeMethod
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(3000);
	}
	
	
	@Test(description="048查询商品失败-输入订单号")
	public void test48() throws Exception{
		webtest.click("xpath=//a[text()='商品管理']");
		webtest.click("link=评价管理");
		webtest.enterFrame("wst-lframe-22");//进入iframe页面
		webtest.type("id=goodsName", "100000250");
		webtest.click("xpath=//input[@value='查询']");
		assertTrue(webtest.isTextPresent("100000250"));
		Thread.sleep(3000);
	}
	
	@Test(description="049查询商品失败-输入字符")
	public void test49() throws Exception{
		webtest.click("xpath=//a[text()='商品管理']");
		webtest.click("link=评价管理");
		webtest.enterFrame("wst-lframe-22");//进入iframe页面
		webtest.type("id=goodsName", "@！@！#￥5");
		webtest.click("xpath=//input[@value='查询']");
		assertTrue(webtest.isTextPresent("@！@！#￥5"));
		Thread.sleep(3000);
	}
	
	@Test(description="050查询商品失败-输入评价内容")
	public void test50() throws Exception{
		webtest.click("xpath=//a[text()='商品管理']");
		webtest.click("link=评价管理");
		webtest.enterFrame("wst-lframe-22");//进入iframe页面
		webtest.type("id=goodsName", "very good");
		webtest.click("xpath=//input[@value='查询']");
		assertTrue(webtest.isTextPresent("very good"));
		Thread.sleep(4000);
		driver.quit();
		
	}
}
