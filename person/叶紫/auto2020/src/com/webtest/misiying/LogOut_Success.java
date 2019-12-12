package com.webtest.misiying;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class LogOut_Success extends BaseTest1{
	@Test(description="ÍË³öÇ°Ì¨µÇÂ¼")
	public void login() throws Exception {
		webtest.open("http://localhost/wstshop/home/index/index.html");
		webtest.click("link=ÇëµÇÂ¼");
		webtest.type("id=loginName","misiying");
		webtest.type("id=loginPwd","123456");
		webtest.type("id=verifyCode","NHYG");
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");

		webtest.click("xpath=/html/body/div[1]/div/ul[1]/li[5]/div/a");
		assertTrue(webtest.isTextPresent("ÇëµÇÂ¼"));
	}
}