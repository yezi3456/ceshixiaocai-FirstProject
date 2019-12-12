package com.webtest.wangyiran;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class IsSalingDoubleClick extends BaseTest{
	
	@Test(description="18双击推荐")
	//18双击推荐
	public void test1() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.doubleClick("xpath=//*[@id=\"maingrid|2|r1001|c107\"]/div/div");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("推荐"));
		webtest.leaveFrame();
	}
	
	
	@Test(description="19双击精品")
	//19双击精品
	public void test2() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.doubleClick("xpath=//*[@id=\"maingrid|2|r1001|c108\"]/div/div");
		Thread.sleep(2000);		
		assertTrue(webtest.isTextPresent("精品"));
		webtest.leaveFrame();

	}
	
	
	@Test(description="20双击新品")
	//20双击新品
	public void test3() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.doubleClick("xpath=//*[@id=\"maingrid|2|r1001|c109\"]/div/div");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("新品"));
		webtest.leaveFrame();

	}
	
	
	@Test(description="21双击热销")
	//21双击热销
	public void test4() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.doubleClick("xpath=//*[@id=\"maingrid|2|r1001|c110\"]/div/div");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("热销"));
		webtest.leaveFrame();

	}
}
