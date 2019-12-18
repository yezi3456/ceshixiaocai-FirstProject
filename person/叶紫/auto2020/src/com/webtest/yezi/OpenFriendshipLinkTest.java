package com.webtest.yezi;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class OpenFriendshipLinkTest extends BaseTest1{
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
	
	@Test(description="030打开第1个友情链")
	public void test30() throws Exception{
		webtest.click("xpath=/html/body/div[2]/div[1]/div[1]/a/img");
		webtest.click("link=WSTMart多商户商");
		webtest.switchWidow(1);
		assertTrue(webtest.isTextPresent("欢迎来到WSTMart官网"));
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(3000);
		
	}
	
	@Test(description="031打开第2个友情链")
	public void test31() throws Exception{
		webtest.switchWidow(0);
		webtest.click("xpath=/html/body/div[2]/div[1]/div[1]/a/img");
		webtest.click("link=WSTMart论坛");
		webtest.switchWidow(1);
		assertTrue(webtest.isTextPresent("商淘软件"));
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(3000);
	}
	
	@Test(description="032打开第3个友情链")
	public void test32() throws Exception{
		webtest.switchWidow(0);
		webtest.click("xpath=/html/body/div[2]/div[1]/div[1]/a/img");
		webtest.click("link=商淘软件");
		webtest.switchWidow(1);
		assertTrue(webtest.isTextPresent("商淘软件"));
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(3000);
	}
	
	@Test(description="033打开第4个友情链")
	public void test33() throws Exception{
		webtest.switchWidow(0);
		webtest.click("xpath=/html/body/div[2]/div[1]/div[1]/a/img");
		webtest.click("link=WSTMall社区O2O系统");
		webtest.switchWidow(1);
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("欢迎来到WSTMall官网"));
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(6000);
		
	}
	
	@Test(description="034打开第5个友情链")
	public void test34() throws Exception{
		Thread.sleep(4000);
		webtest.switchWidow(0);
		webtest.click("xpath=/html/body/div[2]/div[1]/div[1]/a/img");
		webtest.click("link=WSTMall论坛");
		webtest.switchWidow(1);
		assertTrue(webtest.isTextPresent("商淘软件"));
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(3000);
		
	}


}
