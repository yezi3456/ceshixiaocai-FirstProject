package com.webtest.renzixuan;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.dataprovider.TxtDataProvider;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class DingDanQuxiao extends BaseTest1{
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(3000);
	}
	
	@Test(description="20.删除-已发货订单第一个")
	public void test1() throws Exception{
		//点击订单管理
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[3]");
		//点击已发货订单
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[3]");
		Thread.sleep(2000);	
		//进去那个iframe
		webtest.enterFrame("wst-lframe-35");
		Thread.sleep(2000);	
		//点击删除
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c110\"]/div/a[2]");
		//点击确定
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		assertTrue(webtest.isTextPresent("查询"));
	}
	
	@Test(description="21.删除取消/拒收订单第一个")
	public void test2() throws Exception{
		webtest.leaveFrame();
		//点击订单管理
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[3]");
		//点击取消/拒收订单
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[4]");
		Thread.sleep(2000);	
		//进去那个iframe
		webtest.enterFrame("wst-lframe-35");
		Thread.sleep(2000);	
		//点击删除
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c110\"]/div/a[2]");
		//点击确定
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		assertTrue(webtest.isTextPresent("查询"));
	}
	

	@Test(description="22.删除-已收货订单第一个")
	public void test3() throws Exception{
		webtest.leaveFrame();
		//点击订单管理
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[3]");
		//点击已收货订单
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[6]");
		Thread.sleep(2000);	
		//进去那个iframe
		webtest.enterFrame("wst-lframe-35");
		Thread.sleep(2000);	
		//点击删除
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c110\"]/div/a[2]");
		//点击确定
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		assertTrue(webtest.isTextPresent("查询"));
	 }
	
		
	@Test(description="23.删除-待发货订单第一个")
	public void test4() throws Exception{
		webtest.leaveFrame();
		//点击订单管理
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-tabs\"]/div[1]/ul/li[3]");
		//点击待发货订单
		webtest.click("xpath=//*[@id=\"wst-accordion-35\"]/div[2]/a[1]");
		Thread.sleep(2000);	
		//进去那个iframe
		webtest.enterFrame("wst-lframe-35");
		Thread.sleep(2000);	
		//点击删除
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c110\"]/div/a[3]");
		//点击确定
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		assertTrue(webtest.isTextPresent("查询"));
    }
}
