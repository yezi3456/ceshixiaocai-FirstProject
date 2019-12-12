package com.webtest.wangyiran;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class GoodsClassification extends BaseTest{

	@Test(description="56成功修改商品推荐")
	//56修改商品推荐
	public void test1() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[6]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"f_377\"]");
		assertTrue(webtest.isTextPresent("不推荐"));
		webtest.leaveFrame();
	}

	@Test(description="57成功修改商品展示隐藏")
	//57修改商品展示隐藏
	public void test2() throws Exception{
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[4]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"wst-accordion-22\"]/div[2]/a[6]");
		Thread.sleep(2000);
		webtest.enterFrame("wst-lframe-22");
		webtest.click("xpath=//*[@id=\"sh_377\"]");
		assertTrue(webtest.isTextPresent("显示"));
		webtest.leaveFrame();
	}
	

}
