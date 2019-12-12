package com.webtest.yezi;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

public class AddressTest extends BaseTest1{
	
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
	
	@Test(description="018新增地址成功")
	public void test18() throws Exception{
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[3]/li[3]");
		webtest.click("xpath=//input[@value='新增收货地址']");
		webtest.selectByValue("id=area_0", "110000");
		webtest.selectByValue("id=area_0_110000", "110100");
		webtest.selectByValue("id=area_0_110000_110100", "110105");
		webtest.type("id=userAddress", "南二环东路20号");
		webtest.type("id=userName", "小飞飞");
		webtest.type("id=userPhone", "12345678901");
		webtest.click("xpath=//label[text()=' 否']");
		webtest.click("xpath=//button[text()='提交']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("小飞飞"));
	}
	
	@Test(description="019失败测试用例-详细地址为空")
	public void test19() throws Exception{
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[3]/li[3]");
		webtest.click("xpath=//input[@value='新增收货地址']");
		webtest.selectByValue("id=area_0", "110000");
		webtest.selectByValue("id=area_0_110000", "110100");
		webtest.selectByValue("id=area_0_110000_110100", "110105");
		webtest.type("id=userAddress", "");
		webtest.type("id=userName", "小小小");
		webtest.type("id=userPhone", "12345678901");
		webtest.click("xpath=//label[text()=' 否']");
		webtest.click("xpath=//button[text()='提交']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("小小小"));
	}
	
	@Test(description="020失败测试用例-联系名称为空")
	public void test20() throws Exception{
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[3]/li[3]");
		webtest.click("xpath=//input[@value='新增收货地址']");
		webtest.selectByValue("id=area_0", "110000");
		webtest.selectByValue("id=area_0_110000", "110100");
		webtest.selectByValue("id=area_0_110000_110100", "110105");
		webtest.type("id=userAddress", "东路20号");
		webtest.type("id=userName", "");
		webtest.type("id=userPhone", "12345678901");
		webtest.click("xpath=//label[text()=' 否']");
		webtest.click("xpath=//button[text()='提交']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("东路20号"));
	}
	
	@Test(description="021失败测试用例-联系电话为空")
	public void test21() throws Exception{
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[3]/li[3]");
		webtest.click("xpath=//input[@value='新增收货地址']");
		webtest.selectByValue("id=area_0", "110000");
		webtest.selectByValue("id=area_0_110000", "110100");
		webtest.selectByValue("id=area_0_110000_110100", "110105");
		webtest.type("id=userAddress", "南二环东路20号");
		webtest.type("id=userName", "小小小");
		webtest.type("id=userPhone", "");
		webtest.click("xpath=//label[text()=' 否']");
		webtest.click("xpath=//button[text()='提交']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("小小小"));
	}
	
	@Test(description="022失败测试用例-区域为空")
	public void test22() throws Exception{
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[3]/li[3]");
		webtest.click("xpath=//input[@value='新增收货地址']");
		webtest.type("id=userAddress", "南二环东路20号");
		webtest.type("id=userName", "小小小");
		webtest.type("id=userPhone", "12345678901");
		webtest.click("xpath=//label[text()=' 否']");
		webtest.click("xpath=//button[text()='提交']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("小小小"));
	}
	
	//bug又出现啦，应失败但成功啦
	@Test(description="023失败测试用例-详细地址输入非法字符、字母")
	public void test23() throws Exception{
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[3]/li[3]");
		webtest.click("xpath=//input[@value='新增收货地址']");
		webtest.selectByValue("id=area_0", "110000");
		webtest.selectByValue("id=area_0_110000", "110100");
		webtest.selectByValue("id=area_0_110000_110100", "110105");
		webtest.type("id=userAddress", "aaaa@@@！！！");
		webtest.type("id=userName", "天空");
		webtest.type("id=userPhone", "12345678901");
		webtest.click("xpath=//label[text()=' 否']");
		webtest.click("xpath=//button[text()='提交']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("天空"));
	}
	
	
	
	
	@Test(description="024浏览我的地址")
	public void test24() throws Exception{
		webtest.click("xpath=//p[text()='我的收货地址']");
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("新增收货地址"));
	}
	

}
