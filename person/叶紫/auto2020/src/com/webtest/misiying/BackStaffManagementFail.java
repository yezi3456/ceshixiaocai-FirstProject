package com.webtest.misiying;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class BackStaffManagementFail extends BaseTest1{
	
	@BeforeMethod
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(3000);
	}
	
	@Test(description="后台系统管理-职员管理-新增职员-登录账号为空")
	public void test1() throws Exception {
		
		webtest.click("xpath=//*[@id='wst-accordion-1']/div[7]/div[2]");
		webtest.click("link=职员管理");
		webtest.enterFrame("wst-lframe-1");

	    webtest.click("xpath=/html/body/div[1]/button[2]");	
	    webtest.type("id=loginPwd","yz290315");
	    webtest.type("id=staffName","小飞飞");
	    webtest.type("id=staffNo","001");
	    webtest.click("xpath=/html/body/form/table/tbody/tr[8]/td/input[1]");
		assertTrue(webtest.isTextPresent("登录账号不能为空"));
		Thread.sleep(3000);
		webtest.leaveFrame();
		Thread.sleep(3000);
		

	}
	
	@Test(description="后台系统管理-职员管理-新增职员-登录密码为空")
	public void test2() throws Exception {
		
		webtest.click("xpath=//*[@id='wst-accordion-1']/div[7]/div[2]");
		webtest.click("link=职员管理");
		webtest.enterFrame("wst-lframe-1");

	    webtest.click("xpath=/html/body/div[1]/button[2]");	
	    webtest.type("id=loginName","xiaofeifei");
	    webtest.type("id=staffName","小飞飞");
	    webtest.type("id=staffNo","001");
	    webtest.click("xpath=/html/body/form/table/tbody/tr[8]/td/input[1]");
		assertTrue(webtest.isTextPresent("登录密码不能为空"));
		Thread.sleep(3000);
		webtest.leaveFrame();
		Thread.sleep(3000);
//		

	}
	
	@Test(description="后台系统管理-职员管理-新增职员-职员名称为空")
	public void test3() throws Exception {
		
		webtest.click("xpath=//*[@id='wst-accordion-1']/div[7]/div[2]");
		webtest.click("link=职员管理");
		webtest.enterFrame("wst-lframe-1");

	    webtest.click("xpath=/html/body/div[1]/button[2]");	
	    webtest.type("id=loginName","xiaofeifei");
	    webtest.type("id=loginPwd","yz290315");
	    webtest.type("id=staffNo","001");
	    webtest.click("xpath=/html/body/form/table/tbody/tr[8]/td/input[1]");
		assertTrue(webtest.isTextPresent("职员名称不能为空"));
		Thread.sleep(3000);
		webtest.leaveFrame();
		Thread.sleep(3000);
		
	}
	
	@Test(description="后台系统管理-职员管理-新增职员-登录账号不存在")
	public void test4() throws Exception {
		
		webtest.click("xpath=//*[@id='wst-accordion-1']/div[7]/div[2]");
		webtest.click("link=职员管理");
		webtest.enterFrame("wst-lframe-1");	
	    webtest.click("xpath=/html/body/div[1]/button[2]");	
	    webtest.type("id=loginName","xiaofeifei1234");
	    webtest.type("id=loginPwd","yz290315");
	    webtest.type("id=staffName","小飞飞");
	    webtest.type("id=staffNo","001");
	    webtest.click("xpath=/html/body/form/table/tbody/tr[8]/td/input[1]");
		assertTrue(webtest.isTextPresent("登录账号不存在"));
		Thread.sleep(3000);
		webtest.leaveFrame();
		Thread.sleep(3000);

	}
	
	@Test(description="后台系统管理-职员管理-新增职员-登录密码错误")
	public void test5() throws Exception {
		
		webtest.click("xpath=//*[@id='wst-accordion-1']/div[7]/div[2]");
		webtest.click("link=职员管理");
		webtest.enterFrame("wst-lframe-1");	
	    webtest.click("xpath=/html/body/div[1]/button[2]");	
	    webtest.type("id=loginName","xiaofeifei");
	    webtest.type("id=loginPwd","yz290315aaa");
	    webtest.type("id=staffName","小飞飞");
	    webtest.type("id=staffNo","001");
	    webtest.click("xpath=/html/body/form/table/tbody/tr[8]/td/input[1]");
		assertTrue(webtest.isTextPresent("登录密码错误"));
		Thread.sleep(3000);
		webtest.leaveFrame();
		Thread.sleep(3000);

	}
}
