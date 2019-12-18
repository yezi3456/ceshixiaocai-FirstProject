package com.webtest.renzixuan;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.dataprovider.NSDataProvider;
import com.webtest.dataprovider.TxtDataProvider;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class LoginFail extends BaseTest1{

	
		@Test(description="24.前台登录失败（不输入验证码）")
		public void test1() throws Exception {
			webtest.open(ReadProperties.getPropertyValue("url"));
			webtest.click("link=请登录");
			webtest.type("id=loginName","renzixuan");
			webtest.type("id=loginPwd","5201314zj");
			webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
			Thread.sleep(2000);	
			assertFalse(webtest.isTextPresent("退出"));
		}
		
	
		@Test(description="25.密码错误")
		public void test2() throws Exception {
			webtest.click("link=请登录");
			webtest.type("id=loginName","renzixuan");
			webtest.type("id=loginPwd","5201314z");
			webtest.type("id=verifyCode","1");
			webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
			Thread.sleep(2000);	
			assertFalse(webtest.isTextPresent("退出"));
		}
		

		@Test(description="26.用户不存在")
		public void test3() throws Exception {
			webtest.click("link=请登录");
			webtest.type("id=loginName","1");
			webtest.type("id=loginPwd","5201314zj");
			webtest.type("id=verifyCode","1");
			webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
			Thread.sleep(2000);	
			assertFalse(webtest.isTextPresent("退出"));
		}
}
