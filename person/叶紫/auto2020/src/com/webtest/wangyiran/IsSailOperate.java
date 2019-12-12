package com.webtest.wangyiran;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class IsSailOperate extends BaseTest{
	
		
	@Test(description="04成功点击编辑选项")
	//04点击编辑选项
	public void test1() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1016|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"shopPrice\"]", "100.00");
		webtest.click("xpath=/html/body/form/div/div[2]/div[1]/table/tbody/tr[16]/td/button[1]");
		assertTrue(webtest.isTextPresent("商品编号"));
		webtest.leaveFrame();
	}
	
	@Test(description="03成功点击查看选项")
	//03点击查看选项
	public void test2() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[1]");
		assertTrue(webtest.isTextPresent("华为"));
		webtest.leaveFrame();
	}
}	
	
	

	

