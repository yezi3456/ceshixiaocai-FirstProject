package com.webtest.yezi;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class UserInformationTest extends BaseTest1{
	
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
	
	@Test(description="025查看用户资料")
	public void test25() throws Exception{
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[3]/li[1]");
		webtest.keysDown();
		webtest.keysDown();
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("个人资料")); 
	}
	
	@Test(description="026修改用户资料成功")
	public void test26() throws Exception{
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[3]/li[1]");
		webtest.type("id=userName", "小飞飞");
		webtest.type("id=trueName", "小飞");
		webtest.click("xpath=//*[@id='tab']/div/div[1]/table/tbody/tr[4]/td/div/label[2]/label");
		webtest.type("id=brithday", "1999-02-09");
		webtest.type("id=userQQ", "1976755700");
		webtest.click("xpath=//*[@id='tab']/div/div[1]/table/tbody/tr[7]/td/button[1]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("小飞飞"));
	}
	
	@Test(description="027失败的测试用例-昵称为空")
	public void test27() throws Exception{
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[3]/li[1]");
		webtest.type("id=userName", "");
		webtest.type("id=trueName", "小飞");
		webtest.click("xpath=//*[@id='tab']/div/div[1]/table/tbody/tr[4]/td/div/label[2]/label");
		webtest.type("id=brithday", "1989-02-09");
		webtest.type("id=userQQ", "197675");
		webtest.click("xpath=//*[@id='tab']/div/div[1]/table/tbody/tr[7]/td/button[1]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("1989-02-09")); 
	}
	
	//bug又又出现啦，应运行成功但失败
	@Test(description="028失败的测试用例-真实姓名非法")
	public void test28() throws Exception{
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[3]/li[1]");
		webtest.type("id=userName", "aaaa");
		webtest.type("id=trueName", "!@#ASSS");
		webtest.click("xpath=//*[@id='tab']/div/div[1]/table/tbody/tr[4]/td/div/label[2]/label");
		webtest.type("id=brithday", "1999-02-09");
		webtest.type("id=userQQ", "197675");
		webtest.click("xpath=//*[@id='tab']/div/div[1]/table/tbody/tr[7]/td/button[1]");
		Thread.sleep(3000);
		assertFalse(webtest.isTextPresent("!@#ASSS")); 
	}
	
	//bug又又又出现啦，应运行成功但失败
	@Test(description="029失败的测试用例-QQ号长度非法")
	public void test29() throws Exception{
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[3]/li[1]");
		webtest.type("id=userName", "小女孩22");
		webtest.type("id=trueName", "飞飞");
		webtest.click("xpath=//*[@id='tab']/div/div[1]/table/tbody/tr[4]/td/div/label[2]/label");
		webtest.type("id=brithday", "1999-02-09");
		webtest.type("id=userQQ", "1");
		webtest.click("xpath=//*[@id='tab']/div/div[1]/table/tbody/tr[7]/td/button[1]");
		Thread.sleep(3000);
		assertFalse(webtest.isTextPresent("1")); 
	}
	
	

}
