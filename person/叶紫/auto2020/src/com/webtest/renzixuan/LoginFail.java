package com.webtest.renzixuan;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.dataprovider.TxtDataProvider;

public class LoginFail extends BaseTest1{
	String url="http://localhost/wstshop/home/users/login.html";

	
		@Test(priority=1,description="24.前台登录失败（不输入验证码）")
		public void login() throws Exception {
			webtest.open(url);
			webtest.type("id=loginName","renzixuan");
			webtest.type("id=loginPwd","5201314zj");
			webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
			Thread.sleep(2000);	
			assertFalse(webtest.isTextPresent("退出"));
		}
		
	
		@Test(priority=2,description="25.密码错误")
		public void login2() throws Exception {
			webtest.open(url);
			webtest.type("id=loginName","renzixuan");
			webtest.type("id=loginPwd","5201314z");
			webtest.type("id=verifyCode","1");
			webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
			Thread.sleep(2000);	
			assertFalse(webtest.isTextPresent("退出"));
		}
		

		@Test(priority=2,description="26.用户不存在")
		public void login3() throws Exception {
			webtest.open(url);
			webtest.type("id=loginName","1");
			webtest.type("id=loginPwd","5201314zj");
			webtest.type("id=verifyCode","1");
			webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
			Thread.sleep(2000);	
			assertFalse(webtest.isTextPresent("退出"));
		}
}
