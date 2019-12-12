package com.webtest.misiying;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class IntegralManage9 extends BaseTest1{
	
	String url="http://localhost/wstshop/home/index/index.html";
	
	@Test(description="查看积分明细",priority=1)
	public void Integral1() throws Exception {
		webtest.open(url);
		webtest.click("link=请登录");
		webtest.type("id=loginName","misiying");
		webtest.type("id=loginPwd","123456");
		webtest.type("id=verifyCode","NHYG");
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");

		//资金管理
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//积分管理
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[1]");
		assertTrue(webtest.isTextPresent("商品订单"));
	}
	
	
	@Test(description="查看积分收入",priority=2)
	public void Integral2() throws Exception {
		//资金管理
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//积分管理
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[1]");
		//积分收入
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[2]");
		assertTrue(webtest.isTextPresent("交易订单"));
	}
	
	
	@Test(description="查看积分支出",priority=3)
	public void Integral3() throws Exception {
		//资金管理
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//积分管理
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[1]");
		//积分支出
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[3]");
		assertTrue(webtest.isTextPresent("积分变化"));
	}
	
	
	@Test(description="查看资金流水",priority=4)
	public void MoneyTrans1() throws Exception {
		//资金管理
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//资金流水
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[2]");
		assertTrue(webtest.isTextPresent("来源"));
	}
	
	
	@Test(description="查看资金收入",priority=5)
	public void MoneyTrans2() throws Exception {
		//资金管理
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//资金流水
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[2]");
		//资金收入
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[2]");
		assertTrue(webtest.isTextPresent("金额"));
	}
	
	
	@Test(description="查看资金支出",priority=6)
	public void MoneyTrans3() throws Exception {
		//资金管理
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//资金流水
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[2]");
		//资金支出
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[3]");
		assertTrue(webtest.isTextPresent("日期"));
	}
	
	
	@Test(description="新增用户银行卡及信息",priority=7)
	public void EditBankCard1() throws Exception {
		//资金管理
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[3]");
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[2]");
		//新增
		webtest.click("xpath=//*[@id=\"tab\"]/div/div[2]/div/button");
    	webtest.click("xpath=//*[@id=\"accTargetId\"]");
    	webtest.click("xpath=//*[@id=\"accTargetId\"]/option[2]");
    	webtest.click("xpath=//*[@id=\"area_0\"]");
    	webtest.click("xpath=//*[@id=\"area_0\"]/option[3]");
    	webtest.click("xpath=//*[@id=\"area_0_360000\"]");
    	webtest.click("xpath=//*[@id=\"area_0_360000\"]/option[4]");
    	webtest.click("xpath=//*[@id=\"area_0_360000_360300\"]");
    	webtest.click("xpath=//*[@id=\"area_0_360000_360300\"]/option[3]");
    	webtest.type("xpath=//*[@id=\"accNo\"]","11113335672423");
    	webtest.type("xpath=//*[@id=\"accUser\"]","张三");
    	webtest.type("xpath=//*[@id=\"payPwd\"]","123456");
    	//保存
    	webtest.click("xpath=//*[@id=\"configForm\"]/table/tbody/tr[6]/td/button[1]");
//    	assertTrue(webtest.isTextPresent("江西省"));
	}
	
	
	@Test(description="修改用户银行卡及信息",priority=8)
	public void EditBankCard2() throws Exception {
		//资金管理
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[3]");
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[2]");
		//编辑
		webtest.click("xpath=//*[@id=\"config-page-list\"]/tr[1]/td[5]/a[1]");
		//银行信息
    	webtest.click("xpath=//*[@id=\"accTargetId\"]");
    	webtest.click("xpath=//*[@id=\"accTargetId\"]/option[8]");
    	//卡号信息
    	webtest.typeAndClear("id=accNo","");
    	webtest.type("xpath=//*[@id=\"accNo\"]","1111331111117777777");
    	//支付密码
    	webtest.type("xpath=//*[@id=\"payPwd\"]","123456");
    	//保存
    	webtest.click("xpath=//*[@id=\"configForm\"]/table/tbody/tr[6]/td/button[1]");
//    	assertTrue(webtest.isTextPresent("兴业银行"));
	}
	
	
	@Test(description="删除用户银行卡及信息",priority=9)
	public void EditBankCard3() throws Exception {
		//资金管理
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[3]");
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[2]");
		//删除
		webtest.click("xpath=//*[@id=\"config-page-list\"]/tr[1]/td[5]/a[2]");
		//确认删除
    	webtest.click("xpath=//*[@id=\"layui-layer3\"]/div[3]/a[1]");
//    	assertFalse(webtest.isTextPresent("兴业银行"));
	}
}
