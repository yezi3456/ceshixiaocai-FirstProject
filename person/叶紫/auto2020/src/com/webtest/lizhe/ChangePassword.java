package com.webtest.lizhe;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
//修改后台登录密码
public class ChangePassword extends BaseTest{
	@Test(description="修改后台登录密码不输入确认密码")
	public void test1() throws Exception {
		webtest.click("xpath=/html/body/div[1]/div[2]/a[4]");
		webtest.type("id=srcPass", "yz290315");
		webtest.type("id=newPass","111111");
		webtest.type("id=newPass2","");
		webtest.click("link=确定");
		assertTrue(webtest.isTextPresent("确认密码不能为空"));
		webtest.click("link=取消");
		webtest.leaveFrame();
	}
	@Test(description="修改后台登录密码为111111")
	public void test2() throws Exception {
		webtest.click("xpath=/html/body/div[1]/div[2]/a[4]");
		webtest.typeAndClear("id=srcPass", "yz290315");
		webtest.typeAndClear("id=newPass","111111");
		webtest.typeAndClear("id=newPass2","111111");
		webtest.click("link=确定");
		assertTrue(webtest.isTextPresent("admin"));
		webtest.leaveFrame();
	}
	@Test(description="修改后台登录密码为123456")
	public void test3() throws Exception {
		webtest.click("xpath=/html/body/div[1]/div[2]/a[4]");
		webtest.typeAndClear("id=srcPass", "111111");
		webtest.typeAndClear("id=newPass","yz290315");
		webtest.typeAndClear("id=newPass2","yz290315");
		webtest.click("link=确定");
		assertTrue(webtest.isTextPresent("admin"));
		webtest.leaveFrame();
	}
	@Test(description="修改后台登录密码确认密码与新密码不一致")
	public void test4() throws Exception {
		webtest.click("xpath=/html/body/div[1]/div[2]/a[4]");
		webtest.typeAndClear("id=srcPass", "yz290315");
		webtest.typeAndClear("id=newPass","111111");
		webtest.typeAndClear("id=newPass2","111222");
		webtest.click("link=确定");
		assertTrue(webtest.isTextPresent("确认密码与新密码不一致"));
		webtest.click("link=取消");
		webtest.leaveFrame();
	}
	@Test(description="修改后台登录密码新密码为空")
	public void test5() throws Exception {
		webtest.click("xpath=/html/body/div[1]/div[2]/a[4]");
		webtest.typeAndClear("id=srcPass", "yz290315");
		webtest.typeAndClear("id=newPass","");
		webtest.typeAndClear("id=newPass2","111111");
		webtest.click("link=确定");
		assertTrue(webtest.isTextPresent("新密码不能为空"));
	}
}
