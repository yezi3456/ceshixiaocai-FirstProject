package com.webtest.lizhe;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

@Listeners(com.webtest.core.WebTestListener.class)
public class StoreConfiguration  extends BaseTest{
	@Test(description="修改店铺特色介绍为空")
	public void test1() throws Exception {
		webtest.click("link=店铺配置");
		webtest.enterFrame("wst-lframe-1");
		webtest.typeAndClear("id=shopSlogan", "");
		webtest.click("xpath=//input[@value='保存']");
		assertTrue(webtest.isTextPresent("店铺特色介绍"));
		webtest.leaveFrame();
	}
	@Test(description="修改联系电话")
	public void test2() throws Exception {
		webtest.click("link=店铺配置");
		webtest.enterFrame("wst-lframe-1");
		webtest.typeAndClear("id=serviceTel", "13730556499");
		webtest.click("xpath=//input[@value='保存']");
		assertTrue(webtest.isTextPresent("13730556499"));
		webtest.leaveFrame();
	}
	
	@Test(description="购买短信账号")
	public void test3() throws Exception {
		webtest.click("link=店铺配置");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("link=服务器设置");
		webtest.click("link=购买");
		assertTrue(webtest.isTextPresent("短信账号"));
		webtest.leaveFrame();
	}
	@Test(description="修改未支付订单失效时间")
	public void test4() throws Exception {
		webtest.click("link=店铺配置");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("link=运营设置");
		webtest.typeAndClear("id=autoCancelNoPayDays", "10");
		webtest.click("xpath=//*[@id=\"wst-tab-2\"]/table/tbody/tr[10]/td/input[1]");
		assertTrue(webtest.isTextPresent("10"));
		webtest.leaveFrame();
	}
	@Test(description="修改默认运费为空")
	public void test5() throws Exception {
		webtest.click("link=店铺配置");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("link=运营设置");
		webtest.typeAndClear("id=defaultFreight", "");
		webtest.click("xpath=//*[@id=\"wst-tab-2\"]/table/tbody/tr[10]/td/input[1]");
		assertTrue(webtest.isTextPresent("默认运费"));
		webtest.leaveFrame();
	}
	@Test(description="修改默认运费")
	public void test6() throws Exception {
		webtest.click("link=店铺配置");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("link=运营设置");
		webtest.typeAndClear("id=defaultFreight", "10");
		webtest.click("xpath=//*[@id=\"wst-tab-2\"]/table/tbody/tr[10]/td/input[1]");
		assertTrue(webtest.isTextPresent("10"));
		webtest.leaveFrame();
	}

	@Test(description="修改自动收货期限")
	public void test7() throws Exception {
		webtest.click("link=店铺配置");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("link=运营设置");
		webtest.typeAndClear("id=autoReceiveDays", "2");
		webtest.click("xpath=//*[@id=\"wst-tab-2\"]/table/tbody/tr[10]/td/input[1]");
		assertTrue(webtest.isTextPresent("2"));
		webtest.leaveFrame();
	}
	@Test(description="修改自动评价期限")
	public void test8() throws Exception {
		webtest.click("link=店铺配置");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("link=运营设置");
		webtest.typeAndClear("id=autoAppraiseDays", "5");
		webtest.click("xpath=//*[@id=\"wst-tab-2\"]/table/tbody/tr[10]/td/input[1]");
		assertTrue(webtest.isTextPresent("5"));
		webtest.leaveFrame();
	}

	@Test(description="修改客服QQ")
	public void test9() throws Exception {
		webtest.click("link=店铺配置");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);	
		webtest.typeAndClear("id=serviceQQ","123456");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@value='保存']");
		assertTrue(webtest.isTextPresent("123456"));
		webtest.leaveFrame();
		}


//	@AfterMethod
//	public void exit(){
//		webtest.click("link=退出系统");	
//		webtest.click("link=确定");
//		webtest.type("id=loginPwd","123456");
//		webtest.click("xpath=//input[@value='登录']");
//	}
}
