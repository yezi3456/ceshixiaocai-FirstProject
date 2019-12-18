package com.webtest.wangyiran;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

@Listeners(com.webtest.core.WebTestListener.class)
public class BrandManagment extends BaseTest{

	@Test(description="61成功查询品牌名称")
	//61查询品牌名称(成功用例)
	public void test1() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[8]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.type("xpath=//*[@id=\"key\"]", "志高");
		webtest.click("xpath=/html/body/div[1]/button[1]");
		assertTrue(webtest.isTextPresent("1"));
		webtest.leaveFrame();
	}
	

	@Test(description="64修改品牌名称(成功用例)")
	//64修改品牌名称(成功用例)
	public void test2() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[8]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1007|c105\"]/div/a[1]");
		webtest.type("xpath=//*[@id=\"brandName\"]", "test01");
		webtest.click("xpath=//*[@id=\"brandForm\"]/table/tbody/tr[6]/td/button[1]");
		assertTrue(webtest.isTextPresent("test01"));
		webtest.leaveFrame();
	}
	

	@Test(description="65修改品牌名称(失败用例:输入空白)")
	//65修改品牌名称(失败用例:输入空白)
	public void test3() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[8]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1007|c105\"]/div/a[1]");
		webtest.type("xpath=//*[@id=\"brandName\"]", "       ");
		webtest.click("xpath=//*[@id=\"brandForm\"]/table/tbody/tr[6]/td/button[1]");
		assertTrue(webtest.isTextPresent("品牌名称不能为空"));
		webtest.leaveFrame();
	}
	

	
	@Test(description="67下拉列表查询(成功用例)")
	//67下拉列表查询(成功用例)
	public void test4() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[8]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.selectByValue("id=catId", "47");
		webtest.click("xpath=/html/body/div[1]/button[1]");
		assertTrue(webtest.isTextPresent("烟雨农夫"));
		webtest.leaveFrame();
	}


}
