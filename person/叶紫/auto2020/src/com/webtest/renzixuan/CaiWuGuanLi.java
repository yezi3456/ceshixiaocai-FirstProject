package com.webtest.renzixuan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class CaiWuGuanLi  extends BaseTest1{
	String url="http://localhost/wstshop/admin/index/login.html";
	
	@Test(priority=2,description="1.财务管理的提现申请的订单查询（只填写提现编号）")
	public void a() throws Exception {
		//登录后台
		webtest.open(url);
		webtest.type("id=loginPwd","5201314zj");
		webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[4]/td[2]/div/input");
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
	

	@Test(priority=3,description="2.财务管理的提现申请的订单查询（只填写提现状态）")
	public void b() throws Exception {
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
	
		@Test(priority=4,description="3.财务管理的提现申请的订单查询（只填写提现状态）2")
		public void H() throws Exception {
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

	@Test(priority=5,description="4.财务管理的提现申请的订单查询（都填写）1")
	public void c() throws Exception {
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
	
	@Test(priority=6,description="5.财务管理的提现申请的订单查询（都不填写）直接点击查询")
	public void d() throws Exception {
		webtest.leaveFrame();
		//点击提现申请
		webtest.click("xpath=//*[@id=\"wst-accordion-56\"]/div[4]/a");
		webtest.enterFrame("wst-lframe-56");
		//点击查询
		webtest.click("xpath=/html/body/div[1]/button");
		assertTrue(webtest.isTextPresent("查询"));
	}
	
	@Test(priority=7,description="6.财务管理的提现申请的订单查询（都填写）1")
	public void f() throws Exception {
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
