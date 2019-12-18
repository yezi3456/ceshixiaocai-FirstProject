package com.webtest.renzixuan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class CaiWuGuanLi  extends BaseTest1{

	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(3000);
	}
	
	@Test(description="1.财务管理的提现申请的订单查询（只填写提现编号）")
	public void test1() throws Exception {
		//点击运营管理
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[2]");
		//财务管理
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[3]/div[2]");
		//点击提现申请
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[4]/a");
		webtest.enterFrame("wst-lframe-56");
		//填写提现编号
		webtest.type("id=cashNo","100001");
		//点击查询
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("查询"));
	}
	

	@Test(description="2.财务管理的提现申请的订单查询（只填写提现状态）")
	public void test2() throws Exception {
		webtest.leaveFrame();
		//点击提现申请
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[4]/a");
		webtest.enterFrame("wst-lframe-56");
		//填写提现状态(待处理)
		webtest.click("xpath=//*[@id=\"cashSatus\"]/option[2]");
		//点击查询
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("查询"));
	}
	
		@Test(description="3.财务管理的提现申请的订单查询（只填写提现状态）2")
		public void test3() throws Exception {
			webtest.leaveFrame();
			//点击提现申请
			webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[4]/a");
			webtest.enterFrame("wst-lframe-56");
			//填写提现状态(已通过)
			webtest.click("xpath=//*[@id=\"cashSatus\"]/option[3]");
			//点击查询
			webtest.click("xpath=/html/body/div[1]/button");
			assertTrue(webtest.isTextPresent("查询"));
		}

	@Test(description="4.财务管理的提现申请的订单查询（都填写）1")
	public void test4() throws Exception {
		webtest.leaveFrame();
		//点击提现申请
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[4]/a");
		webtest.enterFrame("wst-lframe-56");
		//填写提现编号
		webtest.type("id=cashNo","100001");
		//填写提现状态(待处理)
		webtest.click("xpath=//*[@id=\"cashSatus\"]/option[2]");
		//点击查询
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("查询"));
	}
	
	@Test(description="5.财务管理的提现申请的订单查询（都不填写）直接点击查询")
	public void test5() throws Exception {
		webtest.leaveFrame();
		//点击提现申请
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[4]/a");
		webtest.enterFrame("wst-lframe-56");
		//点击查询
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("查询"));
	}
	
	@Test(description="6.财务管理的提现申请的订单查询（都填写）1")
	public void test6() throws Exception {
		webtest.leaveFrame();
		//点击提现申请
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[4]/a");
		webtest.enterFrame("wst-lframe-56");
		//填写提现编号
		webtest.type("id=cashNo","100001");
		//填写提现状态(已通过)
		webtest.click("xpath=//*[@id=\"cashSatus\"]/option[3]");
		//点击查询
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("查询"));
	}
}
