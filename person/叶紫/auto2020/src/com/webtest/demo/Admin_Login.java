package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;

public class Admin_Login  extends BaseTest1{
	
	@Test
	public void testLogin() {
		//打开页面
		webtest.open("http://www.baidu.com");
		//文本框输入
//		webtest.type("name=username", "admin");
//		webtest.type("name=password", "admin");
//		webtest.click("xpath=//input[@type='submit']");
	}

}
