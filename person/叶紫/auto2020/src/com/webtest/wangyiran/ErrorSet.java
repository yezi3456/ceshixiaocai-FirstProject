package com.webtest.wangyiran;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.core.BaseTestFail;

@Listeners(com.webtest.core.WebTestListener.class)
public class ErrorSet extends BaseTestFail{
	
	
	@Test(description="27 在售商品页面编辑商品名称(失败用例:商品名称为特殊字符)")
	//27 在售商品页面编辑商品名称(失败用例:商品名称为特殊字符)
	public void test1() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsName\"]", "!");
		assertTrue(webtest.isTextPresent("请输入正确商品名称"));
		webtest.leaveFrame();
	}
	

	@Test(description="28 在售商品页面编辑商品名称(失败用例:商品名称太长)")
	//28 在售商品页面编辑商品名称(失败用例:商品名称太长)
	public void test2() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsName\"]", "商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品商品");
		assertTrue(webtest.isTextPresent("商品名称过长!"));
		webtest.leaveFrame();
	}
	

	@Test(description="30在售商品页面编辑商品编号(失败用例:商品编号为特殊字符)")
	// 30在售商品页面编辑商品编号(失败用例:商品编号为特殊字符)
	public void test3() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsSn\"]", "!");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("请输入正确的商品编号"));
		webtest.leaveFrame();
	}


	@Test(description="31在售商品页面编辑商品编号(失败用例:商品编号过长)")
	// 31在售商品页面编辑商品编号(失败用例:商品编号过长)
	public void test4() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsSn\"]", "0000001000000100000010000001000000100000010000001000000100000010000001");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("请输入正确的商品编号"));
		webtest.leaveFrame();
	}

	
	@Test(description="32在售商品页面编辑商品编号(失败用例:商品编号过短)")
	// 32在售商品页面编辑商品编号(失败用例:商品编号过短)
	public void test5() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsSn\"]", "1");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("请输入正确的商品编号"));
		webtest.leaveFrame();
	}


	@Test(description="47在售商品页面编辑商品单位(失败用例:商品单位为特殊字符)")
	// 47在售商品页面编辑商品单位(失败用例:商品单位为特殊字符)
	public void test6() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsUnit\"]", "!!");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("请输入正确商品单位"));
		webtest.leaveFrame();
	}
	

	@Test(description="48在售商品页面编辑商品单位(失败用例:商品单位为数字)")
	// 48在售商品页面编辑商品单位(失败用例:商品单位为数字)
	public void test7() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsUnit\"]", "123");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("请输入正确商品单位"));
		webtest.leaveFrame();
	}
	

	@Test(description="59查询商品属性(失败用例:输入特殊字符)")
	//59查询商品属性(失败用例:输入特殊字符)
	public void test8() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[7]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.type("xpath=//*[@id=\"keyName\"]", "!!!!!");
		webtest.click("xpath=/html/body/div[1]/div[1]/button");
		assertTrue(webtest.isTextPresent("请输入正确的商品属性名称"));
	}
	

	@Test(description="58查询商品属性(成功用例)")
	//58查询商品属性(成功用例)
	public void test9() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[7]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.type("xpath=//*[@id=\"keyName\"]", "尺寸");
		webtest.click("xpath=/html/body/div[1]/div[1]/button");
		assertTrue(webtest.isTextPresent("下拉框"));
		webtest.leaveFrame();
	}
	

	@Test(description="66查询品牌名称(失败用例:输入特殊字符)")
	//66查询品牌名称(失败用例:输入特殊字符)
	public void test10() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[8]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1007|c105\"]/div/a[1]");
		webtest.type("xpath=//*[@id=\"brandName\"]", "test01");
		webtest.click("xpath=//*[@id=\"brandForm\"]/table/tbody/tr[6]/td/button[1]");
		assertTrue(webtest.isTextPresent("品牌名称不能为特殊字符"));
		webtest.leaveFrame();
	}
	

	@Test(description="62失败查询品牌名称,输入特殊字符")
	//62查询品牌名称(失败用例:输入特殊字符)
	public void test11() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[8]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.type("xpath=//*[@id=\"key\"]", "!");
		webtest.click("xpath=/html/body/div[1]/button[1]");
		assertTrue(webtest.isTextPresent("请输入正确的品牌名称"));
		webtest.leaveFrame();
	}
	

	@Test(description="63失败查询品牌名称,输入空白")
	//63查询品牌名称(失败用例:输入空白)
	public void test12() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[8]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.type("xpath=//*[@id=\"key\"]", "      ");
		webtest.click("xpath=/html/body/div[1]/button[1]");
		assertTrue(webtest.isTextPresent("品牌名称不能为空"));
		webtest.leaveFrame();
	}
	

	

	
}
