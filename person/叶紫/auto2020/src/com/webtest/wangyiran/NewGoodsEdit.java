package com.webtest.wangyiran;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

@Listeners(com.webtest.core.WebTestListener.class)
public class NewGoodsEdit extends BaseTest{
		
	@Test(description="25 在售商品页面编辑商品名称(成功用例)")
	//25 在售商品页面编辑商品名称(成功用例)
	public void test1() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsName\"]", "test001");
		webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");
		assertTrue(webtest.isTextPresent("test001"));
		webtest.leaveFrame();
	}
	
	@Test(description="26 在售商品页面编辑商品名称(失败用例:商品名称为空格)")
	//26 在售商品页面编辑商品名称(失败用例:商品名称为空格)
	public void test2() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsName\"]", "   ");
		assertTrue(webtest.isTextPresent("商品名称不能为空"));
		webtest.leaveFrame();
	}
	
	
	
	
	
	@Test(description=" 29在售商品页面编辑商品编号(成功用例)")
	// 29在售商品页面编辑商品编号(成功用例)
	public void test3() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsSn\"]", "00000012");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");
		assertTrue(webtest.isTextPresent("00000012"));
		webtest.leaveFrame();
	}

	
	
	@Test(description="33在售商品页面编辑商品编号(失败用例:商品编号为空)")
	// 33在售商品页面编辑商品编号(失败用例:商品编号为空)
	public void test4() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsSn\"]", "     ");
		assertTrue(webtest.isTextPresent("商品编号不能为空"));
		webtest.leaveFrame();
	}
	
	
	@Test(description="34在售商品页面编辑商品货号(成功用例)")
	// 34在售商品页面编辑商品货号(成功用例)
	public void test5() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"productNo\"]", "123456789101"
				+ "");
		webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		assertTrue(webtest.isTextPresent("00000012"));
		webtest.leaveFrame();
	}
	
	
	
	@Test(description="35在售商品页面编辑市场价格(成功用例)")
	//35在售商品页面编辑市场价格(成功用例)
	public void test6() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"marketPrice\"]", "888.88");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		assertTrue(webtest.isTextPresent("888.88"));
		webtest.leaveFrame();
	}
	
	@Test(description="36在售商品页面编辑市场价格(失败用例: 价格为0)")
	//36在售商品页面编辑市场价格(失败用例: 价格为0)
	public void test7() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"marketPrice\"]", "0");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("价格必须大于0"));
		webtest.leaveFrame();
	}
	
	@Test(description="37在售商品页面编辑市场价格(失败用例:输入特殊字符)")
	//37在售商品页面编辑市场价格(失败用例:输入特殊字符)
	public void test8() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"marketPrice\"]", "!");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("价格必须大于0"));
		webtest.leaveFrame();
	}
	
	@Test(description="38在售商品页面编辑市场价格(失败用例:输入负数)")
	//38在售商品页面编辑市场价格(失败用例:输入负数)
	public void test9() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"marketPrice\"]", "-2");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("价格必须大于0"));
		webtest.leaveFrame();
	}
	
	@Test(description="39在售商品页面编辑市场价格(失败用例:输入空白)")
	//39在售商品页面编辑市场价格(失败用例:输入空白)
	public void test10() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"marketPrice\"]", "    ");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("市场价格不能为空"));
		webtest.leaveFrame();
	}
	
		
	
	@Test(description="40在售商品页面编辑商品库存(成功用例)")
	// 40在售商品页面编辑商品库存(成功用例)
	public void test11() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsStock\"]", "777");
		webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");
		assertTrue(webtest.isTextPresent("777"));
		webtest.leaveFrame();
	}

	
	@Test(description="41在售商品页面编辑商品库存(失败用例:输入负数)")
	// 41在售商品页面编辑商品库存(失败用例:输入负数)
	public void test12() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsStock\"]", "-2");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"shopPrice\"]");
		assertTrue(webtest.isTextPresent("请填写正整数"));
		webtest.leaveFrame();
	}

	
	@Test(description="42在售商品页面编辑商品库存(失败用例:输入字符)")
	// 42在售商品页面编辑商品库存(失败用例:输入字符)
	public void test13() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsStock\"]", "!");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"shopPrice\"]");
		assertTrue(webtest.isTextPresent("请填写正整数"));
		webtest.leaveFrame();
	}
	
	@Test(description="43在售商品页面编辑商品库存(失败用例:输入为空)")
	// 43在售商品页面编辑商品库存(失败用例:输入为空)
	public void test14() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsStock\"]", "     ");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("商品库存不能为空"));
		webtest.leaveFrame();
	}
	
	@Test(description="44在售商品页面编辑预警库存(成功用例)")
	// 44在售商品页面编辑预警库存(成功用例)
	public void test15() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"warnStock\"]", "10");
		webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");
		assertTrue(webtest.isTextPresent("10"));
		webtest.leaveFrame();
	}
	
	
	
	@Test(description="45在售商品页面编辑商品单位(成功用例)")
	// 45在售商品页面编辑商品单位(成功用例)
	public void test16() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsUnit\"]", "件");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		assertTrue(webtest.isTextPresent("件"));
		webtest.leaveFrame();
	}
	
	@Test(description="46在售商品页面编辑商品单位(失败用例:商品单位为空)")
	// 46在售商品页面编辑商品单位(失败用例:商品单位为空)
	public void test17() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.type("xpath=//*[@id=\"goodsUnit\"]", "     ");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("商品单位不能为空"));
		webtest.leaveFrame();
	}
	
	

	@Test(description="49修改商品状态")
	// 49修改商品状态
	public void test18() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.click("xpath=//*[@id=\"isSale-0\"]");
		webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");
		assertTrue(webtest.isTextPresent("下架"));
		webtest.leaveFrame();
	}
	
	@Test(description="50修改商品属性")
	// 50修改商品属性
	public void test19() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.click("xpath=//*[@id=\"isRecom\"]");
		webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");
		assertTrue(webtest.isTextPresent("推荐"));
		webtest.leaveFrame();
	}
	

	@Test(description="51修改本店分类(成功用例)")
	// 51修改本店分类(成功用例)
	public void test20() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[1]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c113\"]/div/div/a[2]");
		webtest.selectByValue("id=cat_0", "50");
		Thread.sleep(2000);
		webtest.selectByValue("id=cat_0_50", "219");
		Thread.sleep(2000);
		webtest.selectByValue("id=cat_0_50_219", "225");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-tab-1\"]/table/tbody/tr[16]/td/button[1]");
		assertTrue(webtest.isTextPresent("推荐"));
		webtest.leaveFrame();
	}


}
