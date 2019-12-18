package com.webtest.wangliyu;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
@Listeners(com.webtest.core.WebTestListener.class)
public class ZhanghaoguanliTest extends BaseTest {
	
	@Test(description="12重置支付密码")
	public void test1() throws InterruptedException{
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("link=账号管理");
//		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("link=账号管理");
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(3000);
		webtest.click("link=重置支付密码");
		webtest.click("xpath=/html/body/div[5]/div[3]/a[1]");
		assertTrue(webtest.isTextPresent("账号"));
//		webtest.leaveFrame();
	}
	
	
	
	@Test(description="14修改2")
	public void test2() throws InterruptedException{
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("link=账号管理");
//		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id='maingrid|2|r1002|c108']/div/a[1]");
		Thread.sleep(1000);
		webtest.typeAndClear("id=loginName","");
		Thread.sleep(1000);
		webtest.type("id=loginName","tomdd");
		Thread.sleep(1000);
		webtest.type("id=loginPwd","123456");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("账号"));
//		webtest.leaveFrame();
	}
	
	@Test(description="13修改(不填密码)")
	public void test3() throws InterruptedException{
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("link=账号管理");
//		webtest.enterFrame("wst-lframe-1");
		webtest.click("link=修改");
		Thread.sleep(1000);
		webtest.typeAndClear("id=loginName","");
		Thread.sleep(1000);
		webtest.type("id=loginName","tom099");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("tom000"));
//		webtest.leaveFrame();
	}
	
	@Test(description="15修改(不填用户名)")
	public void test4() throws InterruptedException{
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]");
		webtest.click("link=账号管理");
//		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id='maingrid|2|r1001|c108']/div/a[1]");
		Thread.sleep(1000);
		webtest.typeAndClear("id=loginName","");
		Thread.sleep(1000);
		webtest.type("id=loginPwd","123456");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("登录账号不能为空"));
	}

}
