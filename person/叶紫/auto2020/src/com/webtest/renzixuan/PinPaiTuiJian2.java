package com.webtest.renzixuan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class PinPaiTuiJian2 extends BaseTest1{
	String url="http://localhost/wstshop/admin/index/login.html";
	
	@Test(priority=2,description="30.品牌推荐不选择左边的商品分类然后搜索华为商品看是否搜索出来")
	public void a() throws Exception{
		//登录后台
		webtest.open(url);
		webtest.type("id=loginPwd","5201314zj");
		webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[4]/td[2]/div/input");
		//点击运营管理
		Thread.sleep(2000);	
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
	
	
		@Test(priority=3,description="31.品牌推荐不推荐到右边直接点保存")
		public void b() throws Exception{
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
		
		
	
		@Test(priority=4,description="32.品牌推荐选择的商品分类跟实际的商品不符合看能不能搜索出来")
		public void c() throws Exception{
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
		
	
	@Test(priority=5,description="33.推荐到右边不选择商品分类直接勾选商品点击保存")
	public void d() throws Exception{
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
	

	@Test(priority=6,description="34.推荐到右边选择商品分类但是不勾选商品点击保存")
	public void e() throws Exception{
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
			
	
	@Test(priority=7,description="35.推荐到右边不选择商品分类而且也不勾选商品点击保存")
	public void f() throws Exception{
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
	
	
	@Test(priority=8,description="36.左边不选择东西，直接右边选择商品分类选择手机点击保存")
	public void h() throws Exception{
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
