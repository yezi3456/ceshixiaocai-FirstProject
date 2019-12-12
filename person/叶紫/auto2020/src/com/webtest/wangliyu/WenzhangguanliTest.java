package com.webtest.wangliyu;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class WenzhangguanliTest extends BaseTest {
	
	@Test(priority=1,description="25新增文章fail(不选择分类类型)")
	public void test1() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[5]/div[2]");
		webtest.click("link=文章管理");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/button[3]");
		Thread.sleep(3000);
		webtest.type("id=articleTitle","帮助");
		Thread.sleep(1000);
		webtest.type("id=articleKey","帮助");
		Thread.sleep(1000);
		webtest.type("xpath=/html/body/form/table/tbody/tr[5]/td/div/div[2]/iframe","帮助帮助帮助帮助帮助帮助帮助帮助帮助");	
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/form/table/tbody/tr[6]/td/button[1]");
		assertTrue(webtest.isTextPresent("文章分类不能为空"));
		
		
	}
	

	@Test(priority=2,description="26删除文章")
	public void test2() throws Exception{	
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/form/table/tbody/tr[6]/td/button[2]");		
		Thread.sleep(3000);
		webtest.click("link=删除");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[4]/div[3]/a[1]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("标题"));
	}
	
	@Test(priority=3,description="27修改文章(修改标题)")
	public void test3() throws Exception{	
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/form/table/tbody/tr[6]/td/button[2]");		
		Thread.sleep(3000);
		webtest.click("link=修改");
		Thread.sleep(2000);
		webtest.typeAndClear("id=articleTitle","");
		Thread.sleep(2000);
		webtest.type("id=articleTitle", "修改修改");
		webtest.click("xpath=/html/body/form/table/tbody/tr[6]/td/button[1]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("发票制度"));
	}
	
	@Test(priority=4,description="28修改文章fail(修改成重复的标题)")
	public void test4() throws Exception{	
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/form/table/tbody/tr[6]/td/button[2]");
		Thread.sleep(3000);
		webtest.click("link=修改");
		Thread.sleep(2000);
		webtest.typeAndClear("id=articleTitle","");
		Thread.sleep(2000);
		webtest.type("id=articleTitle", "公司转账");
		webtest.click("xpath=//*[@id=\"articleForm\"]/table/tbody/tr[6]/td/button[1]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("返回"));
	}
	
	@Test(priority=5,description="29批量删除文章")
	public void test5() throws Exception{	
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/form/table/tbody/tr[6]/td/button[2]");			
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[1]/div/input");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[1]/button[2]");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[4]/div[3]/a[1]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("标题"));
	}
	
	
}
