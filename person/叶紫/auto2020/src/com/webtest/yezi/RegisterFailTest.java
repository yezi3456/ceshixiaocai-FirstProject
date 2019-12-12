package com.webtest.yezi;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

public class RegisterFailTest extends BaseTest1{
	
	@BeforeMethod
	public void registerTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("url"));
	}
	
	@Test(description="007失败测试用例-密码位数小于6")
	public void test7() throws Exception{
		webtest.click("link=免费注册"); 
		webtest.type("name=loginName", "yezi112");
		webtest.type("name=loginPwd", "yz123");
		webtest.type("name=reUserPwd", "yz123");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//input[@name='protocol']");
		webtest.click("xpath=//input[@value='注册']");
		Thread.sleep(3000);
	    assertTrue(webtest.isTextPresent("退出"));
	    Thread.sleep(2000);

	}
	
	@Test(description="008失败测试用例-密码位数大于16")
	public void test8() throws Exception{
		webtest.click("link=免费注册"); 
		webtest.type("name=loginName", "yezi112");
		webtest.type("name=loginPwd", "yz1234567890123456789");
		webtest.type("name=reUserPwd", "yz1234567890123456789");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//input[@name='protocol']");
		webtest.click("xpath=//input[@value='注册']");
		Thread.sleep(3000);
	    assertTrue(webtest.isTextPresent("退出"));
	    Thread.sleep(2000);

	}
	
	@Test(description="009失败测试用例-确认密码与密码不一致")
	public void test9() throws Exception{
		webtest.click("link=免费注册"); 
		webtest.type("name=loginName", "yezi112");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=reUserPwd", "yz123491");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//input[@name='protocol']");
		webtest.click("xpath=//input[@value='注册']");
		Thread.sleep(3000);
	    assertTrue(webtest.isTextPresent("退出"));
	    Thread.sleep(2000);
	}
	
	@Test(description="010失败测试用例-验证码为空")
	public void test10() throws Exception{
		webtest.click("link=免费注册"); 
		webtest.type("name=loginName", "yezi112");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=reUserPwd", "yz290315");
		webtest.type("name=verifyCode", "");
		webtest.click("xpath=//input[@name='protocol']");
		webtest.click("xpath=//input[@value='注册']");
		Thread.sleep(3000);
	    assertTrue(webtest.isTextPresent("退出"));
	    Thread.sleep(2000);
	}
	
	@Test(description="011失败测试用例-不勾选协议")
	public void test11() throws Exception{
		webtest.click("link=免费注册"); 
		webtest.type("name=loginName", "yezi112");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=reUserPwd", "yz290315");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//input[@value='注册']");
		Thread.sleep(3000);
	    assertTrue(webtest.isTextPresent("退出"));
	    Thread.sleep(2000);
	}
	
	@Test(description="012失败的测试用例-用户名以数字开头")
	public void test12() throws Exception{
		webtest.click("link=免费注册"); 
		webtest.type("name=loginName", "112");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=reUserPwd", "yz290315");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//input[@name='protocol']");
		webtest.click("xpath=//input[@value='注册']");
		Thread.sleep(3000);
	    assertTrue(webtest.isTextPresent("退出"));
	    Thread.sleep(2000);
	}
	
	@Test(description="013失败的测试用例-用户名以字符开头")
	public void test13() throws Exception{
		webtest.click("link=免费注册"); 
		webtest.type("name=loginName", "@@@aaas");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=reUserPwd", "yz290315");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//input[@name='protocol']");
		webtest.click("xpath=//input[@value='注册']");
		Thread.sleep(3000);
	    assertTrue(webtest.isTextPresent("退出"));
	    Thread.sleep(2000);
	}
	
	@Test(description="014失败的测试用例-用户名位数小于四位")
	public void test14() throws Exception{
		webtest.click("link=免费注册"); 
		webtest.type("name=loginName", "aaa");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=reUserPwd", "yz290315");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//input[@name='protocol']");
		webtest.click("xpath=//input[@value='注册']");
		Thread.sleep(3000);
	    assertTrue(webtest.isTextPresent("退出"));
	    Thread.sleep(2000);
	}
	
	//bug出现了，应失败但成功了
	@Test(description="015失败的测试用例-用户名位数大于四位")
	public void test15() throws Exception{
		webtest.click("link=免费注册"); 
		webtest.type("name=loginName", "a123451aaaaaa56787654321112345678901234567890");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=reUserPwd", "yz290315");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//input[@name='protocol']");
		webtest.click("xpath=//input[@value='注册']");
		Thread.sleep(3000);
	    assertTrue(webtest.isTextPresent("退出"));
	    Thread.sleep(3000);
		webtest.click("link=退出");
		Thread.sleep(2000);
	}
}
