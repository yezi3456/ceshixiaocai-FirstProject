package com.webtest.misiying;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class IntegralManage9 extends BaseTest1{
	
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("url"));
		webtest.click("link=请登录");
		webtest.type("name=loginName", "xiaofeifei");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//[@name='rememberPwd']");
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
		Thread.sleep(3000);

	}
	
	@Test(description="查看积分明细")
	public void test1() throws Exception {
		//资金管理
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//积分管理
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[1]");
		assertTrue(webtest.isTextPresent("商品订单"));
	}
	
	
	@Test(description="查看积分收入")
	public void test2() throws Exception {
		//资金管理
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//积分管理
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[1]");
		//积分收入
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[2]");
		assertTrue(webtest.isTextPresent("交易订单"));
	}
	
	
	@Test(description="查看积分支出")
	public void test3() throws Exception {
		//资金管理
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//积分管理
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[1]");
		//积分支出
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[3]");
		assertTrue(webtest.isTextPresent("积分变化"));
	}
	
	
	@Test(description="查看资金流水")
	public void test4() throws Exception {
		//资金管理
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//资金流水
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[2]");
		assertTrue(webtest.isTextPresent("来源"));
	}
	
	
	@Test(description="查看资金收入")
	public void test5() throws Exception {
		//资金管理
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//资金流水
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[2]");
		//资金收入
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[2]");
		assertTrue(webtest.isTextPresent("金额"));
	}
	
	
	@Test(description="查看资金支出")
	public void test6() throws Exception {
		//资金管理
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		//资金流水
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[2]");
		//资金支出
		webtest.click("xpath=//*[@id=\"tab\"]/ul/li[3]");
		assertTrue(webtest.isTextPresent("日期"));
	}
	
	
	@Test(description="新增用户银行卡及信息")
	public void test7() throws Exception {
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
	
	
	@Test(description="修改用户银行卡及信息")
	public void test8() throws Exception {
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
	
	
	@Test(description="删除用户银行卡及信息")
	public void test9() throws Exception {
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
