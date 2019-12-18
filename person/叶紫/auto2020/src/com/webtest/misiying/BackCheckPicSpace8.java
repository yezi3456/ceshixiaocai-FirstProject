package com.webtest.misiying;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

@Listeners(com.webtest.core.WebTestListener.class)
public class BackCheckPicSpace8 extends BaseTest1{
	
	@BeforeClass
	public void loginTest() throws Exception{
		webtest.open(ReadProperties.getPropertyValue("backstage_url"));
		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "yz290315");
		webtest.click("xpath=//input[@value='登录']");
		Thread.sleep(3000);
	}
	
	@Test(description="后台系统管理-图片空间-店铺广告-删除")
	public void test1() throws Exception {
		
		//跳转到后台-系统管理-图片空间
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[1]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[7]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[8]/a[7]");
		//店铺广告
		webtest.enterFrame("wst-lframe-1");	
		webtest.click("xpath=//*[@id=\"list\"]/tr[1]/td[5]/a");
		//删除
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c107\"]/div/a[2]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");	
		
		assertTrue(webtest.isTextPresent("删除"));
	}
	
	
	@Test(description="后台系统管理-图片空间-商品评价-删除")
	public void test2() throws Exception {
		webtest.leaveFrame();
		
		//跳转到后台-系统管理-图片空间
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[1]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[7]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[8]/a[7]");
		//商品评价
		webtest.enterFrame("wst-lframe-1");	
		webtest.click("xpath=//*[@id=\"list\"]/tr[2]/td[5]/a");
		//删除
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c107\"]/div/a[2]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		
		assertTrue(webtest.isTextPresent("删除"));
	}
	
	
	@Test(description="后台系统管理-图片空间-品牌-删除")
	public void test3() throws Exception {
		webtest.leaveFrame();
		
		//跳转到后台-系统管理-图片空间
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[1]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[7]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[8]/a[7]");
		//品牌
		webtest.enterFrame("wst-lframe-1");	
		webtest.click("xpath=//*[@id=\"list\"]/tr[3]/td[5]/a");
		//删除
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c107\"]/div/a[2]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		
		assertTrue(webtest.isTextPresent("删除"));
	}
	
	
	@Test(description="后台系统管理-图片空间-商品信息-删除")
	public void test4() throws Exception {
		webtest.leaveFrame();
		
		//跳转到后台-系统管理-图片空间
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[1]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[7]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[8]/a[7]");
		//商品信息
		webtest.enterFrame("wst-lframe-1");	
		webtest.click("xpath=//*[@id=\"list\"]/tr[4]/td[5]/a");
		//删除
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c107\"]/div/a[2]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		
		assertTrue(webtest.isTextPresent("删除"));
	}
	
	
	@Test(description="后台系统管理-图片空间-编辑器-删除")
	public void test5() throws Exception {
		webtest.leaveFrame();
		
		//跳转到后台-系统管理-图片空间
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[1]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[7]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[8]/a[7]");
		//编辑器
		webtest.enterFrame("wst-lframe-1");	
		webtest.click("xpath=//*[@id=\"list\"]/tr[5]/td[5]/a");
		//删除
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c107\"]/div/a[2]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		
		assertTrue(webtest.isTextPresent("删除"));
	}
	
	
	@Test(description="后台系统管理-图片空间-店铺配置-删除")
	public void test6() throws Exception {
		webtest.leaveFrame();
		
		//跳转到后台-系统管理-图片空间
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[1]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[7]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[8]/a[7]");
		//店铺配置
		webtest.enterFrame("wst-lframe-1");	
		webtest.click("xpath=//*[@id=\"list\"]/tr[6]/td[5]/a");
		//删除
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c107\"]/div/a[2]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		
		assertTrue(webtest.isTextPresent("删除"));
	}
	
	
	@Test(description="后台系统管理-图片空间-会员等级-删除")
	public void test7() throws Exception {
		webtest.leaveFrame();
		
		//跳转到后台-系统管理-图片空间
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[1]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[7]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[8]/a[7]");
		//会员等级
		webtest.enterFrame("wst-lframe-1");	
		webtest.click("xpath=//*[@id=\"list\"]/tr[7]/td[5]/a");
		//删除
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c107\"]/div/a[2]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		
		assertTrue(webtest.isTextPresent("删除"));
	}
	
	
	@Test(description="后台系统管理-图片空间-会员信息-删除")
	public void test8() throws Exception {
		webtest.leaveFrame();
		
		//跳转到后台-系统管理-图片空间
		Thread.sleep(2000);	
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[1]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[7]/div[2]");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[8]/a[7]");
		//会员信息
		webtest.enterFrame("wst-lframe-1");	
		webtest.click("xpath=//*[@id=\"list\"]/tr[8]/td[5]/a");
		//删除
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c107\"]/div/a[2]");
		webtest.click("xpath=//*[@id=\"layui-layer1\"]/div[3]/a[1]");
		
		assertTrue(webtest.isTextPresent("删除"));
	}
}
