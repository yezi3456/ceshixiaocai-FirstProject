package com.webtest.wangyiran;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

@Listeners(com.webtest.core.WebTestListener.class)
public class CommodityClassificationShow extends BaseTest{

	
	@Test(description="01成功修改推荐")
	//01修改推荐
	public void test1() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
	    Thread.sleep(2000);
	    webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[6]");
	    Thread.sleep(2000);
	    webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"f_47\"]");
		assertTrue(webtest.isTextPresent("不推荐"));
		webtest.leaveFrame();
	}
	
	
	@Test(description="02成功修改展示")
	//02修改展示
	public void test2() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
	    Thread.sleep(2000);
	    webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[6]");
	    Thread.sleep(2000);
	    webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"sh_47\"]");
		assertTrue(webtest.isTextPresent("显示"));
		webtest.leaveFrame();
	}
	
	@Test(description="60查询商品属性(成功用例:输入空白)")
	//60查询商品属性(成功用例:输入空白)
	public void test3() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[7]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.type("xpath=//*[@id=\"keyName\"]", "           ");
		webtest.click("xpath=/html/body/div[1]/div[1]/button");
		assertTrue(webtest.isTextPresent("网络类型"));
		assertTrue(webtest.isTextPresent("营养元素"));
		assertTrue(webtest.isTextPresent("保鲜期"));
		assertTrue(webtest.isTextPresent("手机类型"));
		assertTrue(webtest.isTextPresent("操作系统"));
		webtest.leaveFrame();
	}
	
}


