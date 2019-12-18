package com.webtest.renzixuan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class PinPaiTuiJian2 extends BaseTest1{
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(3000);
	}
	
	@Test(description="30.品牌推荐不选择左边的商品分类然后搜索华为商品看是否搜索出来")
	public void test1() throws Exception{
		//点击运营管理
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[2]");
		//推荐管理
		Thread.sleep(2000);	
		webtest.click("link=推荐管理");
		Thread.sleep(2000);	
		//点击品牌推荐
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[2]");
		webtest.enterFrame("wst-lframe-56");
		Thread.sleep(2000);
		webtest.type("id=key_2","华为");
		Thread.sleep(2000);	
		//点击搜索
		webtest.click("xpath=/html/body/form/table/tbody/tr[2]/td[1]/input[2]");
		assertTrue(webtest.isTextPresent("搜索"));
	}
	
	
		@Test(description="31.品牌推荐不推荐到右边直接点保存")
		public void test2() throws Exception{
			//点击品牌推荐
			webtest.leaveFrame();
			webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[2]");
			webtest.enterFrame("wst-lframe-56");
			Thread.sleep(2000);
			webtest.click("xpath=//*[@id=\"cat12_0\"]/option[8]");
			webtest.type("id=key_2","华为");
			Thread.sleep(2000);	
			//点击搜索
			webtest.click("xpath=/html/body/form/table/tbody/tr[2]/td[1]/input[2]");
			Thread.sleep(2000);	
			webtest.click("xpath=/html/body/form/table/tbody/tr[4]/td/input");
			assertTrue(webtest.isTextPresent("搜索"));
		}
		
		
	
		@Test(description="32.品牌推荐选择的商品分类跟实际的商品不符合看能不能搜索出来")
		public void test3() throws Exception{
			//点击品牌推荐
			webtest.leaveFrame();
			webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[2]");
			webtest.enterFrame("wst-lframe-56");
			webtest.click("xpath=//*[@id=\"cat12_0\"]/option[2]");
			webtest.type("id=key_2","华为");	
			//点击搜索
			webtest.click("xpath=/html/body/form/table/tbody/tr[2]/td[1]/input[2]");
			assertTrue(webtest.isTextPresent("搜索"));
		}
		
	
	@Test(description="33.推荐到右边不选择商品分类直接勾选商品点击保存")
	public void test4() throws Exception{
		webtest.leaveFrame();
		//点击品牌推荐
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[2]");
		webtest.enterFrame("wst-lframe-56");
		webtest.click("xpath=//*[@id=\"cat12_0\"]/option[8]");
		webtest.type("id=key_2","华为");
		//点击搜索
		webtest.click("xpath=/html/body/form/table/tbody/tr[2]/td[1]/input[2]");
		//点击左边的勾选框
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[1]/div/div[1]/div[1]/input");
		//点击向右的按钮
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[2]/input[1]");
	    //点击右边的勾选框
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[3]/div/div[1]/div[1]/input");
		//为华为后面的排序为01
		webtest.type("xpath=//*[@id=\"rlist_2\"]/div[7]/div[3]/input","1");
		//点击保存
		webtest.click("xpath=/html/body/form/table/tbody/tr[4]/td/input");	
		assertTrue(webtest.isTextPresent("搜索"));
	}
	

	@Test(description="34.推荐到右边选择商品分类但是不勾选商品点击保存")
	public void test5() throws Exception{
		webtest.leaveFrame();
		//点击品牌推荐
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[2]");
		webtest.enterFrame("wst-lframe-56");
		//选择手机
		webtest.click("xpath=//*[@id=\"cat12_0\"]/option[8]");
		webtest.type("id=key_2","华为");
		//点击搜索
		webtest.click("xpath=/html/body/form/table/tbody/tr[2]/td[1]/input[2]");
		//点击左边的勾选框
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[1]/div/div[1]/div[1]/input");
		//点击向右的按钮
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[2]/input[1]");
		//选择手机
		webtest.click("xpath=//*[@id=\"cat22_0\"]/option[8]");
		//点击保存
		webtest.click("xpath=/html/body/form/table/tbody/tr[4]/td/input");
		assertTrue(webtest.isTextPresent("搜索"));
	}
			
	
	@Test(description="35.推荐到右边不选择商品分类而且也不勾选商品点击保存")
	public void test6() throws Exception{
		webtest.leaveFrame();
		//点击品牌推荐
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[2]");
		webtest.enterFrame("wst-lframe-56");
		webtest.click("xpath=//*[@id=\"cat12_0\"]/option[8]");
		webtest.type("id=key_2","华为");
		//点击搜索
		webtest.click("xpath=/html/body/form/table/tbody/tr[2]/td[1]/input[2]");
		//点击左边的勾选框
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[1]/div/div[1]/div[1]/input");
		//点击向右的按钮
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[2]/input[1]");
		//点击保存
		webtest.click("xpath=/html/body/form/table/tbody/tr[4]/td/input");
		assertTrue(webtest.isTextPresent("搜索"));
	}
	
	
	@Test(description="36.左边不选择东西，直接右边选择商品分类选择手机点击保存")
	public void test7() throws Exception{
		webtest.leaveFrame();
		//点击品牌推荐
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[2]/a[2]");
		webtest.enterFrame("wst-lframe-56");
		//选择手机
		webtest.click("xpath=//*[@id=\"cat22_0\"]/option[8]");
	    //点击右边的勾选框
		webtest.click("xpath=//*[@id=\"rlist_2\"]/div[7]/div[1]/input");	
		//为后面的排序为1
		webtest.type("xpath=//*[@id=\"rlist_2\"]/div[7]/div[3]/input","2");
		//点击保存
		webtest.click("xpath=/html/body/form/table/tbody/tr[4]/td/input");	
		assertTrue(webtest.isTextPresent("搜索"));
	}
}
