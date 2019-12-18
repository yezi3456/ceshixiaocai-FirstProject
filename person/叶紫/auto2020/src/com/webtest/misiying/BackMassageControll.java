package com.webtest.misiying;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class BackMassageControll extends BaseTest1{
	
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(3000);
	}
	
	@Test(description="在后台-系统管理-消息管理-消息列表查看已经发送的消息")
	public void test1() throws Exception {
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[7]/div[2]");
		webtest.click("xpath=/html/body/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[8]/a[8]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[1]/div[1]/ul/li[2]/a");
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div[3]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[8]/div/a[1]");
	    webtest.click("xpath=/html/body/div[7]/div[3]/a");
	    
	    assertTrue(webtest.isTextPresent("关闭"));

	}
}
