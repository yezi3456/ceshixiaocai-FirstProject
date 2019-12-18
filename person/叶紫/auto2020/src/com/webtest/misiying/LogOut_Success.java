package com.webtest.misiying;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class LogOut_Success extends BaseTest1{
	
	
	@Test(description="ÍË³öÇ°Ì¨µÇÂ¼")
	public void test1() throws Exception {
		webtest.open(ReadProperties.getPropertyValue("url"));
		webtest.click("link=ÇëµÇÂ¼");
		webtest.type("name=loginName", "xiaofeifei");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//[@name='rememberPwd']");
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
		Thread.sleep(3000);

		webtest.click("xpath=/html/body/div[1]/div/ul[1]/li[5]/div/a");
		assertTrue(webtest.isTextPresent("ÇëµÇÂ¼"));
	}
}