package com.webtest.wangyiran;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class IsSalingSelect extends BaseTest{
	
	@Test(description="22不选择任何条件进行查询")
	//22不选择任何条件进行查询
	public void test1() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
	    Thread.sleep(2000);
	    webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
	    Thread.sleep(2000);
	    webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("华为"));
		webtest.leaveFrame();
	}
	
	@Test(description="23输入商品名称进行查询")
	//23输入商品名称进行查询
	public void test2() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
	    Thread.sleep(2000);
	    webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
	    Thread.sleep(4000);
	    webtest.enterFrame("wst-lframe-22");
		webtest.type("xpath=//*[@id=\"goodsName\"]","Xiaomi/小米 小米Max 国产超薄6.44英寸大屏指纹识别解锁智能手机");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("小米"));
		webtest.leaveFrame();
	}
	
	@Test(description="24输入商品编号进行查询")
	//24输入商品编号进行查询
	public void test3() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
	    Thread.sleep(2000);
	    webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
	    Thread.sleep(4000);
	    webtest.enterFrame("wst-lframe-22");
		webtest.type("xpath=//*[@id=\"goodsName\"]","148280233673182");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("小米"));
		webtest.leaveFrame();
	}
}
