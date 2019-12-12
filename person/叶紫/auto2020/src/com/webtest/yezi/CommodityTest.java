package com.webtest.yezi;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest1;
import com.webtest.utils.ReadProperties;

public class CommodityTest extends BaseTest1{
	
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
	
	@Test(description="035在首页任意点击商品并查看详情页")
	public void test35() throws Exception{
		webtest.click("xpath=/html/body/div[2]/div[1]/div[1]/a/img");
		webtest.click("xpath=//img[@title='海南蜜宝红心火龙果2.5kg蜜宝红心火龙果是非常受欢迎的健康水果之一']");
		webtest.switchWidow(1);
		webtest.click("xpath=//*[@id='tab']/ul/li[2]");
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id='tab']/ul/li[3]");
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		assertTrue(webtest.isTextPresent("海南蜜宝红心火龙果2.5kg蜜宝红心火龙果是非常受欢迎的健康水果之一"));
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
	}
	
	@Test(description="036在搜索框搜索商品并查看详情页")
	public void test36() throws Exception{
		webtest.switchWidow(0);
		webtest.click("link=欢迎您，aaaa");
		webtest.type("id=search-ipt", "草莓");
		webtest.click("id=search-btn");
		webtest.click("link=草莓");
		webtest.switchWidow(1);
		webtest.click("xpath=//*[@id='tab']/ul/li[3]");
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		assertTrue(webtest.isTextPresent("草莓"));
		Thread.sleep(3000);	
		driver.close();
		Thread.sleep(3000);
	}
	
	@Test(description="037在首页任意点击商品并关注")
	public void test37() throws Exception{
		webtest.switchWidow(0);
		webtest.click("link=欢迎您，aaaa");
		webtest.click("xpath=/html/body/div[2]/div[1]/div[1]/a/img");
		webtest.click("xpath=//img[@title='砂糖桔']");
		webtest.switchWidow(1);
		webtest.click("link=关注商品");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("已关注"));
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
	}
	
	@Test(description="038在搜索框搜索商品并关注")
	public void test38() throws Exception{
		webtest.switchWidow(0);
		webtest.click("link=欢迎您，aaaa");
		webtest.type("id=search-ipt", "菠萝蜜");
		webtest.click("id=search-btn");
		webtest.click("xpath=//img[@title='红肉菠萝蜜 1盒约300g']");
		webtest.switchWidow(1);
		webtest.click("link=关注商品");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("已关注"));
		Thread.sleep(3000);	
		driver.close();
		Thread.sleep(3000);
	}
	
	@Test(description="039在首页任意点击商品并加入购物车")
	public void test39() throws Exception{
		webtest.switchWidow(0);
		webtest.click("link=欢迎您，aaaa");
		webtest.click("xpath=/html/body/div[2]/div[1]/div[1]/a/img");
		webtest.click("xpath=//img[@title='砂糖桔']");
		webtest.switchWidow(1);
		webtest.click("link=加入购物车");
		webtest.click("xpath=//*[@id='wst-nav-items']/a");
		assertTrue(webtest.isTextPresent("砂糖桔"));
		Thread.sleep(3000);	
		driver.close();
		Thread.sleep(3000);
	}
	
	@Test(description="040在搜索框搜索商品并加入购物车")
	public void test40() throws Exception{
		webtest.switchWidow(0);
		webtest.click("link=欢迎您，aaaa");
		webtest.type("id=search-ipt", "菠萝蜜");
		webtest.click("id=search-btn");
		webtest.click("xpath=//img[@title='红肉菠萝蜜 1盒约300g']");
		webtest.switchWidow(1);
		webtest.click("link=加入购物车");
		webtest.click("xpath=//*[@id='wst-nav-items']/a");
		assertTrue(webtest.isTextPresent("菠萝蜜"));
		Thread.sleep(3000);	
		driver.close();
		Thread.sleep(3000);
	}
	
	@Test(description="041查看购物车里面的商品")
	public void test41() throws Exception{
		webtest.switchWidow(0);
		webtest.click("link=欢迎您，aaaa");
		webtest.click("xpath=//p[text()='购物车']");
		webtest.switchWidow(1);
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		Thread.sleep(2000);	
		assertTrue(webtest.isTextPresent("我的购物车"));
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
	}

	@Test(description="042查看积分")
	public void test42() throws Exception{
		webtest.switchWidow(0);
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[1]");
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		Thread.sleep(2000);	
		assertTrue(webtest.isTextPresent("积分明细"));
		Thread.sleep(3000);
	}
	
	//bug又又又又出现啦，应该运行成功反而失败
	@Test(description="043将某个商品取消关注")
	public void test43() throws Exception{
		webtest.switchWidow(0);
		webtest.click("link=欢迎您，aaaa");
		webtest.click("xpath=/html/body/div[1]/div/ul[2]/li[3]");
		webtest.click("xpath=//img[@title='砂糖桔']");
		webtest.switchWidow(1);
		webtest.click("link=已关注");
		webtest.click("xpath=/html/body/div[1]/div/ul[2]/li[3]");
		assertFalse(webtest.isTextPresent("砂糖桔"));
		Thread.sleep(4000);	
		driver.quit();
	
	}
	
//	@Test(description="044将购物车里面的某一个商品删除")
//	public void test44() throws Exception{
//		webtest.switchWidow(0);
//		webtest.click("xpath=//p[text()='购物车']");
//		webtest.switchWidow(1);
//		webtest.click("xpath=/html/body/div[6]/div[5]/div[2]/div/div[2]/div[6]/a");
//		webtest.click("xpath=//*[@id='layui-layer1']/div[3]/a[1]");
//		Thread.sleep(2000);
//		assertFalse(webtest.isTextPresent("菠萝蜜"));
//		driver.close();
//		Thread.sleep(3000);
//	}
	
	
//	@Test(description="041将购物车里面的某一个商品增加购买数量")
//	public void test41() throws Exception{
//		webtest.switchWidow(0);
////		webtest.click("link=欢迎您，aaaa");
//		webtest.click("xpath=//p[text()='购物车']");
//		webtest.switchWidow(1);
//		webtest.click("id=buy-add_70");
//		webtest.click("id=buy-add_70");
//		Thread.sleep(2000);	
//		assertTrue(webtest.isTextPresent("180"));
//		Thread.sleep(3000);
//		driver.close();
//		Thread.sleep(3000);
//	}


}
