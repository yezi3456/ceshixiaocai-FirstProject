package com.webtest.misiying;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class BackChangeLoginPwd extends BaseTest1{
	@Test(description="设置系统管理员登录后台的新密码")
	public void login() throws Exception {
		//系统管理员登录后台
		webtest.open("http://localhost/wstshop/admin/index/login.html");
		webtest.type("id=loginPwd","123456");
		webtest.type("id=verifyCode","NHYG");
		webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[4]/td[2]/div/input");
		
		//进入到后台修改密码目录
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[7]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[8]/a[4]");
		webtest.enterFrame("wst-lframe-1");	
		webtest.click("xpath=//*[@id=\"maingrid|2|r1008|c109\"]/div/a[1]");
		//设置系统管理员登录新密码
		webtest.type("xpath=//*[@id=\"newPass\"]","123456");
		webtest.type("xpath=//*[@id=\"newPass2\"]","123456");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		
		assertTrue(webtest.isTextPresent("修改成功"));
	}
}


