package com.webtest.renzixuan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class PinPaiTuiJian extends BaseTest1{
	String url="http://localhost/wstshop/admin/index/login.html";
	
	//11.品牌推荐
	@Test(priority=2,description="29.品牌推荐")
	public void a() throws Exception{
		//登录后台
		webtest.open(url);
		webtest.type("id=loginPwd","5201314zj");
		webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[4]/td[2]/div/input");
		assertTrue(webtest.isTextPresent("退出系统"));
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
		webtest.click("xpath=//*[@id=\"cat12_0\"]/option[8]");
		webtest.type("id=key_2","华为");
		Thread.sleep(2000);	
		//点击搜索
		webtest.click("xpath=/html/body/form/table/tbody/tr[2]/td[1]/input[2]");
		Thread.sleep(2000);	
		//点击左边的勾选框
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[1]/div/div[1]/div[1]/input");
		Thread.sleep(2000);	
		//点击向右的按钮
		webtest.click("xpath=/html/body/form/table/tbody/tr[3]/td[2]/input[1]");
		//选择手机
		webtest.click("xpath=//*[@id=\"cat22_0\"]/option[8]");
		Thread.sleep(2000);	
	    //点击右边的勾选框（华为）
		webtest.click("xpath=//*[@id=\"rlist_2\"]/div[7]/div[1]/input");
		Thread.sleep(2000);	
		//为华为后面的排序为01
		webtest.type("xpath=//*[@id=\"rlist_2\"]/div[7]/div[3]/input","1");
		//点击保存
		webtest.click("xpath=/html/body/form/table/tbody/tr[4]/td/input");
		assertTrue(webtest.isTextPresent("搜索"));
	}
	
}
