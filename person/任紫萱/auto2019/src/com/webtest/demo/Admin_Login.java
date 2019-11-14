package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Admin_Login  extends BaseTest{
	
	@Test
	public void testLogin() {
		//打开页面
		webtest.open("http://localhost:8032/mymovie/admin.php/");
		//文本框输入
		webtest.type("name=username", "admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
	}

}
