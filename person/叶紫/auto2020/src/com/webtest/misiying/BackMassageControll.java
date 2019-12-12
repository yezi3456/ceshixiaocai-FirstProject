package com.webtest.misiying;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;

public class BackMassageControll extends BaseTest1{
	@Test(description="在后台-系统管理-消息管理-消息列表查看已经发送的消息")
	public void login() throws Exception {
		webtest.open("http://localhost/wstshop/admin/index/login.html");
		webtest.type("id=loginPwd","123456");
		webtest.type("id=verifyCode","NHYG");
		webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[4]/td[2]/div/input");
		
		Thread.sleep(2000);	
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[7]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[8]/a[8]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[1]/div[1]/ul/li[2]/a");
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[3]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[8]/div/a[1]");
	    webtest.click("xpath=/html/body/div[7]/div[3]/a");
	    
	    assertTrue(webtest.isTextPresent("关闭"));

	}
}
