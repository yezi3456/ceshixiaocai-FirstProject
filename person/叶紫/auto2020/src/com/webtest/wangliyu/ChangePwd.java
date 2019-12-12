package com.webtest.wangliyu;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ChangePwd extends BaseTest {

	@Test(priority=1,description="16修改密码success")
	public void changepwd() throws Exception{
		Thread.sleep(3000);
		webtest.click("link=修改密码");
		Thread.sleep(3000);
		webtest.type("id=srcPass","123456");
		Thread.sleep(3000);
		webtest.type("id=newPass","123456");
		Thread.sleep(3000);
		webtest.type("id=newPass2","123456");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");	
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("修改密码"));
	}
	
	
	@Test(priority=2,description="17修改密码fail(确认密码与新密码不一致)")
	public void changepwd2() throws Exception{
		
		Thread.sleep(3000);
		webtest.click("link=修改密码");
		webtest.typeAndClear("id=srcPass","");
		webtest.typeAndClear("id=newPass","");
		webtest.typeAndClear("id=newPass2","");
		Thread.sleep(3000);
		webtest.type("id=srcPass","123456");
		Thread.sleep(3000);
		webtest.type("id=newPass","123456");
		Thread.sleep(3000);
		webtest.type("id=newPass2","12345");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");	
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("确认密码与新密码不一致"));
	}
	
	
	@Test(priority=3,description="18修改密码fail(确认密码为空)")
	public void changepwd3() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[2]");	
		Thread.sleep(3000);
		webtest.click("link=修改密码");
		webtest.typeAndClear("id=srcPass","");
		webtest.typeAndClear("id=newPass","");
		webtest.typeAndClear("id=newPass2","");
		Thread.sleep(3000);
		webtest.type("id=srcPass","123456");
		Thread.sleep(3000);
		webtest.type("id=newPass","123456");
		Thread.sleep(3000);
//		webtest.type("id=newPass2","12345");
//		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");	
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("确认密码不能为空"));
	}
	
	@Test(priority=4,description="19修改密码fail(新密码为空)")
	public void changepwd4() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[2]");	
		Thread.sleep(3000);
		webtest.click("link=修改密码");
		webtest.typeAndClear("id=srcPass","");
		webtest.typeAndClear("id=newPass","");
		webtest.typeAndClear("id=newPass2","");
		Thread.sleep(3000);
		webtest.type("id=srcPass","123456");
		Thread.sleep(3000);
//		webtest.type("id=newPass","123456");
//		Thread.sleep(3000);
		webtest.type("id=newPass2","123456");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");	
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("新密码不能为空"));
	}
	
	@Test(priority=5,description="20修改密码fail(原密码为空)")
	public void changepwd5() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[2]");	
		Thread.sleep(3000);
		webtest.click("link=修改密码");
		webtest.typeAndClear("id=srcPass","");
		webtest.typeAndClear("id=newPass","");
		webtest.typeAndClear("id=newPass2","");
//		Thread.sleep(3000);
//		webtest.type("id=srcPass","123456");
		Thread.sleep(3000);
		webtest.type("id=newPass","123456");
		Thread.sleep(3000);
		webtest.type("id=newPass2","123456");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");	
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("原密码不能为空"));
	}
	
	@Test(priority=6,description="21修改密码fail(原密码错误)")
	public void changepwd6() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[2]");	
		Thread.sleep(3000);
		webtest.click("link=修改密码");
		webtest.typeAndClear("id=srcPass","");
		webtest.typeAndClear("id=newPass","");
		webtest.typeAndClear("id=newPass2","");
		Thread.sleep(3000);
		webtest.type("id=srcPass","123457");
		Thread.sleep(3000);
		webtest.type("id=newPass","123456");
		Thread.sleep(3000);
		webtest.type("id=newPass2","123456");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");	
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("原密码"));
	}
	
	@Test(priority=7,description="22修改密码fail(新密码5位)")
	public void changepwd7() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[2]");	
		Thread.sleep(3000);
		webtest.click("link=修改密码");
		webtest.typeAndClear("id=srcPass","");
		webtest.typeAndClear("id=newPass","");
		webtest.typeAndClear("id=newPass2","");
		Thread.sleep(3000);
		webtest.type("id=srcPass","123456");
		Thread.sleep(3000);
		webtest.type("id=newPass","12345");
		Thread.sleep(3000);
		webtest.type("id=newPass2","12345");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");	
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("原密码"));
	}
	
	@Test(priority=8,description="23修改密码success(新密码为7位)")
	public void changepwd8() throws Exception{
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[2]");	
		Thread.sleep(3000);
		webtest.click("link=修改密码");
		webtest.typeAndClear("id=srcPass","");
		webtest.typeAndClear("id=newPass","");
		webtest.typeAndClear("id=newPass2","");
		Thread.sleep(3000);
		webtest.type("id=srcPass","123456");
		Thread.sleep(3000);
		webtest.type("id=newPass","1234567");
		Thread.sleep(3000);
		webtest.type("id=newPass2","1234567");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");	
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("修改密码"));
	}
	
	@Test(priority=9,description="24修改密码(新密码为20位)")
	public void changepwd9() throws Exception{
//		Thread.sleep(3000);
//		webtest.click("xpath=/html/body/div[3]/div[3]/a[2]");	
		Thread.sleep(3000);
		webtest.click("link=修改密码");
		webtest.typeAndClear("id=srcPass","");
		webtest.typeAndClear("id=newPass","");
		webtest.typeAndClear("id=newPass2","");
		Thread.sleep(3000);
		webtest.type("id=srcPass","1234567");
		Thread.sleep(3000);
		webtest.type("id=newPass","12345670000000000000");
		Thread.sleep(3000);
		webtest.type("id=newPass2","12345670000000000000");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/a[1]");	
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("修改密码"));
	}
	

}
