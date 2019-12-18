package com.webtest.lizhe;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.core.BaseTestFail;

@Listeners(com.webtest.core.WebTestListener.class)
public class FailedAssertTest extends BaseTestFail{
	@Test(description="修改店铺特色介绍超过长度限制")
	public void test1() throws Exception {
		webtest.click("link=店铺配置");
		webtest.enterFrame("wst-lframe-1");
		webtest.typeAndClear("id=shopSlogan", "易用的B2C网上商店系统！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！1");
		webtest.click("xpath=//input[@value='保存']");
		assertTrue(webtest.isTextPresent("易用的B2C网上商店系统！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！1"));
		webtest.leaveFrame();
	}
	@Test(description="修改自动评价期限小于自动收货时间")
	public void test2() throws Exception {
		webtest.click("link=店铺配置");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("link=运营设置");
		webtest.typeAndClear("id=autoReceiveDays", "2");
		webtest.typeAndClear("id=autoAppraiseDays", "1");
		webtest.click("xpath=//*[@id=\"wst-tab-2\"]/table/tbody/tr[10]/td/input[1]");
		assertTrue(webtest.isTextPresent("自动评价期限小于自动收货时间修改失败"));
		webtest.leaveFrame();
	}
	@Test(description="修改默认运费数值过大无意义")
	public void test3() throws Exception {
		webtest.click("link=店铺配置");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("link=运营设置");
		webtest.typeAndClear("id=defaultFreight", "100000");
		webtest.click("xpath=//*[@id=\"wst-tab-2\"]/table/tbody/tr[10]/td/input[1]");
		assertTrue(webtest.isTextPresent("默认运费数值过大无意义"));
		webtest.leaveFrame();
	}
	@Test(description="验证重置键")
	public void test4() throws Exception {
		webtest.click("link=店铺配置");
		webtest.enterFrame("wst-lframe-1");
		webtest.typeAndClear("id=shopSlogan", "wstshop特色网站");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@value='重置']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("易用的B2C网上商店系统！"));
		webtest.leaveFrame();
	}
}
