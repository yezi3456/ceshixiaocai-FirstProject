package com.webtest.misiying;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class EditPersonalMassage5 extends BaseTest1{
	
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("url"));
		webtest.click("link=请登录");
		webtest.type("name=loginName", "xiaofeifei");
		webtest.type("name=loginPwd", "yz290315");
		webtest.type("name=verifyCode", "aaa");
		webtest.click("xpath=//[@name='rememberPwd']");
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
		Thread.sleep(3000);

	}
	
	@Test(description="编辑个人资料【每一项都填写】")
	public void test1() throws Exception {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div/div[1]/ul/li[3]/p[2]");
		
		webtest.typeAndClear("id=userName","");
		webtest.type("xpath=//*[@id=\"userName\"]","siying");
		webtest.typeAndClear("id=trueName","");
		webtest.type("xpath=//*[@id=\"trueName\"]","mimimi");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/form/div/div/div[1]/table/tbody/tr[4]/td/div/label[2]/label");
		webtest.typeAndClear("id=brithday","");
		webtest.type("xpath=//*[@id=\"brithday\"]","1999-01-10");
		webtest.typeAndClear("id=userQQ","");
		webtest.type("xpath=//*[@id=\"userQQ\"]","1212121212");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/form/div/div/div[1]/table/tbody/tr[7]/td/button[1]");
		assertTrue(webtest.isTextPresent("重置"));
	}
	
	
	@Test(description="编辑个人资料【无昵称】")
	public void test2() throws Exception {

		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div/div[1]/ul/li[3]/p[2]");
		
		Thread.sleep(3000);
		webtest.typeAndClear("id=userName","");
		Thread.sleep(3000);
		webtest.typeAndClear("id=trueName","");
		webtest.type("xpath=//*[@id=\"trueName\"]","mimimi");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/form/div/div/div[1]/table/tbody/tr[4]/td/div/label[2]/label");
		webtest.typeAndClear("id=brithday","");
		webtest.type("xpath=//*[@id=\"brithday\"]","1979-01-10");
		webtest.typeAndClear("id=userQQ","");
		webtest.type("xpath=//*[@id=\"userQQ\"]","12777799999");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/form/div/div/div[1]/table/tbody/tr[7]/td/button[1]");
		
		assertTrue(webtest.isTextPresent("昵称"));
	}
	
	
	@Test(description="编辑个人资料【无真实姓名】")
	public void test3() throws Exception {

		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div/div[1]/ul/li[3]/p[2]");
		
		webtest.typeAndClear("id=userName","");
		webtest.type("xpath=//*[@id=\"userName\"]","siying");
		webtest.typeAndClear("id=trueName","");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/form/div/div/div[1]/table/tbody/tr[4]/td/div/label[2]/label");
		webtest.typeAndClear("id=brithday","");
		webtest.type("xpath=//*[@id=\"brithday\"]","1999-01-10");
		webtest.typeAndClear("id=userQQ","");
		webtest.type("xpath=//*[@id=\"userQQ\"]","1212121212");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/form/div/div/div[1]/table/tbody/tr[7]/td/button[1]");
		
		assertTrue(webtest.isTextPresent("昵称"));
	}
	
	
	@Test(description="编辑个人资料【无生日日期】")
	public void test4() throws Exception {

		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div/div[1]/ul/li[3]/p[2]");
		
		webtest.typeAndClear("id=userName","");
		webtest.type("xpath=//*[@id=\"userName\"]","siying");
		webtest.typeAndClear("id=trueName","");
		webtest.type("xpath=//*[@id=\"trueName\"]","mimimi");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/form/div/div/div[1]/table/tbody/tr[4]/td/div/label[2]/label");
		webtest.typeAndClear("id=brithday","");
		webtest.typeAndClear("id=userQQ","");
		webtest.type("xpath=//*[@id=\"userQQ\"]","1212121212");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/form/div/div/div[1]/table/tbody/tr[7]/td/button[1]");
		
		assertTrue(webtest.isTextPresent("昵称"));
	}
	
	
	@Test(description="编辑个人资料【无QQ号】")
	public void test5() throws Exception {

		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div/div[1]/ul/li[3]/p[2]");
		Thread.sleep(3000);
		webtest.typeAndClear("id=userName","");
		Thread.sleep(3000);
		webtest.type("xpath=//*[@id=\"userName\"]","siying");
		webtest.typeAndClear("id=trueName","");
		webtest.type("xpath=//*[@id=\"trueName\"]","mimimi");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/form/div/div/div[1]/table/tbody/tr[4]/td/div/label[2]/label");
		webtest.typeAndClear("id=brithday","");
		webtest.type("xpath=//*[@id=\"brithday\"]","1999-01-10");
		Thread.sleep(3000);
		webtest.typeAndClear("id=userQQ","");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/form/div/div/div[1]/table/tbody/tr[7]/td/button[1]");
		
		assertTrue(webtest.isTextPresent("昵称"));
	}
}

