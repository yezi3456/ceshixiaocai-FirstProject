package com.webtest.renzixuan;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class ShangPinTuijian extends BaseTest1{
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(3000);
	}
	
	@Test(description="42.商品推荐")
	public void test1() throws Exception{
		//点击运营管理
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[2]");
		//推荐管理
		Thread.sleep(2000);	
		webtest.click("link=推荐管理");
		Thread.sleep(2000);	
		//点击商品推荐
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[1]");
		webtest.enterFrame("wst-lframe-56");
		Thread.sleep(2000);
		//点击手机
		webtest.click("xpath=//*[@id=\"cat12_0\"]/option[8]");
		//点击手机
		webtest.click("xpath=//*[@id=\"cat12_0_334\"]/option[2]");
		//点击手机
		webtest.click("xpath=//*[@id=\"cat12_0_334_348\"]/option[2]");
		Thread.sleep(2000);	
		webtest.type("id=key_2","华为");
		Thread.sleep(2000);	
		//点击搜索
		webtest.click("xpath=/html/body/form/table/tbody/tr[2]/td[1]/input[2]");
		Thread.sleep(2000);	
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[1]/div/div[1]/div[1]/input");
		Thread.sleep(2000);	
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[2]/input[1]");
		Thread.sleep(2000);	
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[3]/div/div[1]/div[1]/input");
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"dataType_2\"]/option[3]");
		Thread.sleep(2000);	
		webtest.click("xpath=/html/body/form/table/tbody/tr[4]/td/input");
		assertTrue(webtest.isTextPresent("搜索"));
	}
	

	
	@Test(description="43.商品推荐右边不选择商品分类")
	public void test2() throws Exception{
		webtest.leaveFrame();
		//点击商品推荐
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[1]");
		webtest.enterFrame("wst-lframe-56");
		Thread.sleep(2000);	
		webtest.type("id=key_2","华为");
		Thread.sleep(2000);	
		//点击搜索
		webtest.click("xpath=/html/body/form/table/tbody/tr[2]/td[1]/input[2]");
		assertTrue(webtest.isTextPresent("搜索"));
	}
		
		

		@Test(description="44.商品推荐直接点击保存，不添加商品")
		public void test3() throws Exception{
			webtest.leaveFrame();
			//点击商品推荐
			webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[1]");
			webtest.enterFrame("wst-lframe-56");
			webtest.click("xpath=/html/body/form/table/tbody/tr[4]/td/input");
			assertFalse(webtest.isTextPresent("搜索"));
		}
		
	
}
