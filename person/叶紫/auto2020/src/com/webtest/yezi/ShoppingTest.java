package com.webtest.yezi;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class ShoppingTest extends BaseTest1{
	
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
	
	@Test(description="016结算购物车里面的商品")
	public void test16() throws Exception{
		webtest.click("xpath=//p[text()='购物车']");
		webtest.switchWidow(1);//会打开两个页面，需要切换到所需页面
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(2000);
		webtest.click("link=结算");
		webtest.click("link=提交订单");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("订单提交成功!"));
		Thread.sleep(2000);
//		webtest.switchWidow(1);
		driver.close();
		Thread.sleep(3000);
	}  
	
	@Test(description="017搜索某个商品并购买")
	public void test17() throws Exception{
		webtest.switchWidow(0);
		webtest.type("xpath=//input[@placeholder='请输入商品名称']", "草莓");
		webtest.click("id=search-btn");
		webtest.click("link=草莓");
		webtest.switchWidow(1);
		webtest.click("link=立即购买");
		webtest.click("link=结算");
		webtest.click("link=提交订单");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("订单提交成功!"));
	}
	
	

}
