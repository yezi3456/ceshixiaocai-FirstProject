package com.webtest.renzixuan;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.dataprovider.TxtDataProvider;

public class DingDanQuxiao extends BaseTest1{
    String url="http://localhost/wstshop/admin/index/login.html";
	
	@Test(priority=2,description="20.删除-已发货订单第一个")
	public void a() throws Exception{
		webtest.open(url);
		webtest.type("id=loginPwd","5201314zj");
		webtest.click("xpath=/html/body/div/div/form/table/tbody/tr[4]/td[2]/div/input");
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
	
	@Test(priority=3,description="21.删除取消/拒收订单第一个")
	public void b() throws Exception{
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
	

	@Test(priority=4,description="22.删除-已收货订单第一个")
	public void c() throws Exception{
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
	
		
	@Test(priority=5,description="23.删除-待发货订单第一个")
	public void d() throws Exception{
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
