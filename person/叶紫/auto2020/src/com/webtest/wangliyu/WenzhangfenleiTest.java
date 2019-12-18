package com.webtest.wangliyu;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

@Listeners(com.webtest.core.WebTestListener.class)
public class WenzhangfenleiTest extends BaseTest {
	
	@Test(description="30新增分类success")
	public void test1() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[5]/div[2]");
		webtest.click("link=文章分类");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/button");
		Thread.sleep(3000);
		webtest.type("id=catName","帮助");
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		Thread.sleep(5000);
		assertTrue(webtest.isTextPresent("普通类型"));	
	}
	
	@Test(description="31新增子分类success")
	public void test2() throws Exception{
		Thread.sleep(3000);
		webtest.click("link=新增子分类");
		Thread.sleep(3000);
		webtest.type("id=catName","帮助success");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(5000);
		assertTrue(webtest.isTextPresent("普通类型"));	
	}
	
	@Test(description="32新增子分类fail(不添加分类名称)")
	public void test3() throws Exception{
		Thread.sleep(3000);
		
		webtest.click("link=新增子分类");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("分类名称不能为空"));	
	}
	
	@Test(description="33新增子分类fail，不填排序号")
	public void test4() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[2]");
		Thread.sleep(3000);
		webtest.click("link=新增子分类");
		Thread.sleep(3000);
		webtest.type("id=catName","帮助哈哈嗯嗯");
		Thread.sleep(3000);
		webtest.typeAndClear("id=catSort","");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("排序号不能为空"));	
	}
	
	@Test(description="34新增子分类fail，排序号为非数字")
	public void test5() throws Exception{
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[2]");
		Thread.sleep(3000);
		webtest.click("link=新增子分类");
		Thread.sleep(3000);
		webtest.type("id=catName","帮助哈哈嗯嗯");
		Thread.sleep(3000);
		webtest.typeAndClear("id=catSort","");
		Thread.sleep(3000);
		webtest.type("id=catSor","aaa");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("新增文章分类"));	
	}
	
	@Test(description="35删除")
	public void test6() throws Exception{
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[2]");
		Thread.sleep(3000);
		webtest.click("link=删除");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[5]/div[3]/a[1]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("帮助中心"));	
	}
	
	@Test(description="36修改success")
	public void test7() throws Exception{
		Thread.sleep(3000);
		webtest.click("link=修改");
		Thread.sleep(3000);
		webtest.typeAndClear("id=catName","");
		Thread.sleep(3000);
		webtest.type("id=catName","中心");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");	
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("帮助中心"));	
	}
	
	
}
