package com.webtest.wangyiran;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class IsSalingButtonThing extends BaseTest{
	
	@Test(description="05点击推荐按钮推荐商品")
	//05点击推荐按钮推荐商品
	public void test1() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c102\"]/div/div/input");
		webtest.click("xpath=/html/body/div[2]/button[2]");
		assertTrue(webtest.isTextPresent("商品编号"));
		webtest.leaveFrame();
		
	}
	
	
	@Test(description="06点击精品按钮将商品设置为精品")
	//06点击精品按钮将商品设置为精品
	public void test2() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c102\"]/div/div/input");
		webtest.click("xpath=/html/body/div[2]/button[4]");
		assertTrue(webtest.isTextPresent("商品编号"));
		webtest.leaveFrame();
		
	}
	@Test(description="07点击新品按钮将商品设置为新品")
	//07点击新品按钮将商品设置为新品
	public void test3() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c102\"]/div/div/input");
		webtest.click("xpath=/html/body/div[2]/button[3]");
		assertTrue(webtest.isTextPresent("商品编号"));
		webtest.leaveFrame();
		
	}
	
	
	@Test(description="08点击热销按钮将商品设置为热销")
	//08点击热销按钮将商品设置为热销
	public void test4() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c102\"]/div/div/input");
		webtest.click("xpath=/html/body/div[2]/button[5]");
		assertTrue(webtest.isTextPresent("商品编号"));
		webtest.leaveFrame();
	
	}
	
	

	
	
	@Test(description="09点击刷新按钮")
	//09点击刷新按钮
	public void test5() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid\"]/div[5]/div/div[10]/div");
		assertTrue(webtest.isTextPresent("袋"));
		webtest.leaveFrame();
	}
	
	
	@Test(description="11点击第一页按钮")
	//11点击第一页按钮
	public void test6() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid\"]/div[5]/div/div[4]/div[1]");
		assertTrue(webtest.isTextPresent("所属分类"));
		webtest.leaveFrame();
	}
	
	
	@Test(description="12点击最后一页按钮")
	//12点击最后一页按钮
	public void test7() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid\"]/div[5]/div/div[8]/div[2]");
		assertTrue(webtest.isTextPresent("所属分类"));
		webtest.leaveFrame();
	}
	
	@Test(description="13点击上一页按钮")
	//13点击上一页按钮
	public void test8() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid\"]/div[5]/div/div[4]/div[2]");
		assertTrue(webtest.isTextPresent("所属分类"));
	}
	
	@Test(description="14点击下一页按钮")
	//14点击下一页按钮
	public void test9() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(4000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid\"]/div[5]/div/div[8]/div[1]");
		assertTrue(webtest.isTextPresent("所属分类"));
		webtest.leaveFrame();
	}
	
	


}
