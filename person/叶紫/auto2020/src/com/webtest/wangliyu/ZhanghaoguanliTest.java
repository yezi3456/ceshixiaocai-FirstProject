package com.webtest.wangliyu;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
public class ZhanghaoguanliTest extends BaseTest {
	
	@Test(priority=3,description="12重置支付密码")
	public void Test1() throws InterruptedException{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("link=账号管理");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);
		webtest.click("link=重置支付密码");
		webtest.click("xpath=/html/body/div[5]/div[3]/a[1]");
		assertTrue(webtest.isTextPresent("账号"));
	}
	
	
	
	@Test(priority=4,description="14修改2")
	public void Test3() throws InterruptedException{
		Thread.sleep(3000);
		webtest.click("link=修改");
		Thread.sleep(1000);
		webtest.typeAndClear("id=loginName","");
		Thread.sleep(1000);
		webtest.type("id=loginName","tom089");
		Thread.sleep(1000);
		webtest.type("id=loginPwd","123456");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("tom000"));
	}
	
	@Test(priority=5,description="13修改(不填密码)")
	public void Test2() throws InterruptedException{
		Thread.sleep(3000);
		webtest.click("link=修改");
		Thread.sleep(1000);
		webtest.typeAndClear("id=loginName","");
		Thread.sleep(1000);
		webtest.type("id=loginName","tom099");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("tom000"));
	}
	
	@Test(priority=6,description="15修改(不填用户名)")
	public void Test4() throws InterruptedException{
		Thread.sleep(3000);
		webtest.click("link=修改");
		Thread.sleep(1000);
		webtest.typeAndClear("id=loginName","");
		Thread.sleep(1000);
		webtest.type("id=loginPwd","123456");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("手机号码"));
	}

}
